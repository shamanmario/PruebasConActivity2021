package com.example.pruebasconactivity2021;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.textoConExtra);

        String textoNuevo = getIntent().getStringExtra("textoPrueba");

        Contacto contactoRecibido = (Contacto) getIntent().getSerializableExtra("contactoPrueba");

        texto.setText(contactoRecibido.getNombre()+ " llegó sin problemas");

    }
}