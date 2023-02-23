package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button buttonIrCadastro;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIrCadastro = findViewById(R.id.buttonIrCadastro);

        buttonIrCadastro.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent in = new Intent(Menu.this, Cadastro.class);

                startActivity(in);

            }
        });
    }
}
