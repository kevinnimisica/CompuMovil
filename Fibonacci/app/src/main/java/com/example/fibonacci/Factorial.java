package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Factorial extends AppCompatActivity {
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        int calc = getIntent().getIntExtra("numero", 1);
        resultado = findViewById(R.id.resultadoFac);
        String res = "Multiplicacion: 1";
        int resNum= 1;
        for (int i = 2; i<= calc; i++)
        {
            res += " * " + i;
            resNum *= i;
        }
        res = "\nResultado: "+ resNum;
        resultado.setText(res);
    }
}
