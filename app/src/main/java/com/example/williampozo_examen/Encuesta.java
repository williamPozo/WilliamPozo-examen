package com.example.williampozo_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Encuesta extends AppCompatActivity {
    EditText ingre;
    CheckBox cb1, cb2 ,cb3;
    RadioButton rb1, rb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        ingre = findViewById(R.id.editText);
        cb1 = findViewById(R.id.cb1);
        cb2 = findViewById(R.id.cb2);
        cb3 = findViewById(R.id.cb3);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);

    }

    public void Resumen (View view){

        Intent AbrirIntent = new Intent(this, Resumen.class);

        AbrirIntent.putExtra("DATO ENVIADO 1", cb1.getText().toString());
        AbrirIntent.putExtra("DATO ENVIADO 2", cb2.getText().toString());
        AbrirIntent.putExtra("DATO ENVIADO 3", cb3.getText().toString());
        AbrirIntent.putExtra("DATO ENVIADO 4", rb2.getText().toString());
        AbrirIntent.putExtra("DATO ENVIADO 5", rb1.getText().toString());
        AbrirIntent.putExtra("DATO ENVIADO", ingre.getText().toString());

        startActivity(AbrirIntent);

        Toast.makeText(getApplicationContext(), ("Datos guardados"), Toast.LENGTH_LONG).show();


    }

}
