package com.example.quizuno.quiz1_minottalosada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Administrador extends AppCompatActivity {

    Button cerrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);

        cerrar= findViewById(R.id.button2);

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intento= new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intento);
            }
        });


    }
}
