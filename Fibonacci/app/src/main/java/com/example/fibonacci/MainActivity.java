package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    LinearLayout scrollRes;
    int fibCalc = 1;
    int fibAct=1;
    int fibAnt=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollRes = findViewById(R.id.linearLayout);

        fibCalc = Integer.valueOf(getIntent().getStringExtra("limite"));

        for ( int i = 0; i<fibCalc; i++)
        {
            /*String actual = (String) resultados.getText();*/
            TextView nuevo = new TextView(getBaseContext());
            fibAct = fibAct + fibAnt;
            fibAnt = fibAct - fibAnt;
            nuevo.setText("" + fibAct);
            //resultados.setText(actual);
            scrollRes.addView(nuevo);
        }

    }
}
