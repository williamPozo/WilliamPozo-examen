package com.example.williampozo_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = findViewById(R.id.etUsuario);
        pass = findViewById(R.id.etClave);

    }

    public void Ingresar (View view){
        // El usuario será: estudiante2020
        // clave: uisrael2020

        String usuarioET = user.getText().toString();
        String claveET = pass.getText().toString();
        if (usuarioET.equals("estudiante2020")&&(claveET.equals("uisrael2020"))){
            Intent AbrirIntent = new Intent(this, Registro.class);
            AbrirIntent.putExtra("datoEnviado", user.getText().toString());
            startActivity(AbrirIntent);

        }
        else
        {
            Toast.makeText(getApplicationContext(), "ACCESO INCORRECTO", Toast.LENGTH_LONG).show();
        }

    }
}
