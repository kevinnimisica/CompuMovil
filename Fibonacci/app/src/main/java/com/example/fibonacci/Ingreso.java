package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class Ingreso extends AppCompatActivity {
    Button calc;
    EditText limit;
    Button paises;
    ImageButton fib;
    Button factorial;
    Spinner numero;
    int cantFac= 0, cantFib = 0;
    Date timeFac= Calendar.getInstance().getTime(), timeFib= timeFac;
    TextView cantidadFib, cantidadiFac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);
        calc = findViewById(R.id.calcular);
        limit =  findViewById(R.id.limite);
        paises = findViewById(R.id.paises);
        factorial = findViewById(R.id.factorial);
        fib = findViewById(R.id.buttonFibonacci);
        numero = findViewById(R.id.spinnerFactorial);
        cantidadiFac = findViewById(R.id.cantidadFac);
        cantidadFib = findViewById(R.id.contadorFib);
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantFib++;
                timeFib = Calendar.getInstance().getTime();
                cantidadFib.setText("Fibonacci: \nVeces: " + cantFib + "\nMomento: " + timeFib.toString());
                Intent view = new Intent(getBaseContext(), MainActivity.class);
                view.putExtra("limite", limit.getText().toString());
                startActivity(view);
            }
        });
        paises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view = new Intent(getBaseContext(), Paises.class);
                startActivity(view);
            }
        });
        fib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent view =new Intent(getBaseContext(), BiografiaFib.class);
                startActivity(view);
            }
        });
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cantFac++;
                timeFib = Calendar.getInstance().getTime();
                cantidadiFac.setText("Factorial: \nVeces: " + cantFac + "\nMomento: " + timeFac.toString());
                int num = Integer.parseInt(numero.getSelectedItem().toString());
                Intent view = new Intent(getBaseContext(),Factorial.class);
                view.putExtra("numero",num);
                startActivity(view);
            }
        });



    }
}
