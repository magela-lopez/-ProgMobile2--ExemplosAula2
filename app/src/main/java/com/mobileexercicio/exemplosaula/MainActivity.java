package com.mobileexercicio.exemplosaula;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).setTitle("");

        Button btnNavegador = findViewById(R.id.btnExemploNav);
        Button btnMapa = findViewById(R.id.btnExemploMapa);
        Button btnCamera = findViewById(R.id.btnExemploCamera);

        btnNavegador.setOnClickListener(v -> {
            Intent intent1 = new Intent(MainActivity.this, ExemploNavegadorActivity.class);
            startActivity(intent1);
            finish();
        });
        btnMapa.setOnClickListener(v -> {
            Intent intent2 = new Intent(MainActivity.this, ExemploMapaActivity.class);
            startActivity(intent2);
            finish();
        });
        btnCamera.setOnClickListener(v -> {
            Intent intent3 = new Intent(getApplicationContext(), ExemploCameraActivity.class);
            startActivity(intent3);
            finish();
        });

    }
}