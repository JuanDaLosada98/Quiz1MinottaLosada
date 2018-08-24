package com.example.quizuno.quiz1_minottalosada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText usuario;
    EditText contrasena;
    Button iniciar;
    TextView aviso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    usuario= findViewById(R.id.editText);
    contrasena= findViewById(R.id.editText3);
    iniciar= findViewById(R.id.button);
    aviso = findViewById(R.id.textView2);

    iniciar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String nombre="administrador";
            String contraseña= "123456";
            Intent intento= new Intent(getApplicationContext(),Administrador.class);

            if(nombre.equals(usuario.getText().toString()) && contraseña.equals(contrasena.getText().toString())){

            startActivity(intento);

            } else {


                aviso.setText("El usuario o la contrseña NO es correcta");
            }
        }
    });


    }
}
