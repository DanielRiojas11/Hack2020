package com.example.hack2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bienvenida extends AppCompatActivity {

    private Button personalButton;
    private Button pacienteButton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenida);
        //startActivity(new Intent(,Paciente.class));

        personalButton = (Button) findViewById(R.id.personalButton);
        pacienteButton = (Button) findViewById(R.id.pacienteButton);

        personalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Personal.class));
            }
        });

        pacienteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Paciente.class));
            }
        });
    }



}