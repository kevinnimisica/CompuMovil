package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetallesPais extends AppCompatActivity {
    TextView detalles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_pais);
        detalles = findViewById(R.id.detallesPais);
        Bundle pais = getIntent().getBundleExtra("bundle");
        detalles.setText("Nombre del Pais: " + pais.getString("nombrePa")+
        "\nSigla: " + pais.getString("sigla")+
        "\nNombre Internacional: " + pais.getString("internacional")+
        "\nCapital: " + pais.getString("capital"));

    }
}
