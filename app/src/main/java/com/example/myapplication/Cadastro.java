package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Cadastro extends AppCompatActivity {
    TextView Cadastro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitycadastro);

        Cadastro=findViewById(R.id.Cadastro);

        Intent it = getIntent();

        String nome = it.getStringExtra("nome");
        Cadastro.setText(nome);
    }
}