package com.example.pruebasconactivity2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void LevantarActivity(View view){

        Intent intent = new Intent(this, MainActivity.class);

        intent.putExtra("textoPrueba", "Hola mundo mundial!");

        Contacto contactoTest = new Contacto();

        intent.putExtra("contactoPrueba", contactoTest);

        startActivity(intent);

    }
}