package com.example.testedeestilos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTextoExibido;
    TextView txtTexto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtTextoExibido = findViewById(R.id.txtTextoExibido);
        txtTexto = findViewById(R.id.texto);

        txtTexto.setVisibility(View.VISIBLE);
        txtTextoExibido.setVisibility(View.VISIBLE);
    }



}