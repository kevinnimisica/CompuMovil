package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Paises extends AppCompatActivity {
    List<Pais> listaPaises = new ArrayList<Pais>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paises);
        try {
            JSONObject json = new JSONObject(loadJson());
            JSONArray paisesJsonArray = json.getJSONArray("paises");
            for (int i=0; i < paisesJsonArray.length(); i++)
            {
                JSONObject pais = paisesJsonArray.getJSONObject(i);
                String capital = pais.getString("capital");
                String nombrePais = pais.getString("nombre_pais");
                String nombreInt = pais.getString("nombre_pais_int");
                String sigla = pais.getString("sigla");
                Pais nuevo = new Pais(nombrePais,capital,nombreInt,sigla);
                listaPaises.add(nuevo);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ArrayAdapter<Pais> adapter = new ArrayAdapter<Pais>(getBaseContext(), android.R.layout.simple_list_item_1,listaPaises);
        ListView listView = findViewById(R.id.paises);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle datos = new Bundle();
                datos.putString("nombrePa", listaPaises.get(position).getNombrePais());
                datos.putString("capital", listaPaises.get(position).getCapital());
                datos.putString("internacional", listaPaises.get(position).getNomPaInt());
                datos.putString("sigla", listaPaises.get(position).getSigla());
                Intent detalles = new Intent(getBaseContext(), DetallesPais.class);
                detalles.putExtra("bundle", detalles);
                startActivity(detalles);
            }
        });
    }

    public String loadJson()
    {
        String json = null;
        try {
            InputStream is = this.getAssets().open("paises.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        }catch (IOException ex){
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}
