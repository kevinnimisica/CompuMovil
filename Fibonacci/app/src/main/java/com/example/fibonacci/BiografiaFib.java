package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class BiografiaFib extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biografia_fib);
        web = findViewById(R.id.webView);
        web.loadUrl("https://es.wikipedia.org/wiki/Leonardo_de_Pisa");
    }
}
