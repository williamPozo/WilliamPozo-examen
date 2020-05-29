package com.example.williampozo_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText datoR, nombre, monto, pago;
    Bundle dato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        datoR = findViewById(R.id.etCentroR);
        dato = getIntent().getExtras();
        String recibir = dato.getString("datoEnviado");
        datoR.setText(recibir);

        nombre = findViewById(R.id.etNombre);
        monto = findViewById(R.id.etMonto);
        pago = findViewById(R.id.etPago);
    }

    public void Calcular (View view){
        double cuotaInicial = Double.parseDouble(monto.getText().toString());
        double costoCurso = 1800;
        double cuotaMensual = (1800-cuotaInicial)/3;
        pago.setText(Double.toString(cuotaMensual));
    }

    public void Guardar (View view){
        Intent AbrirIntent = new Intent(Registro.this, Encuesta.class);
        AbrirIntent.putExtra("datoEnviado", datoR.getText().toString());
        startActivity(AbrirIntent);
        Toast.makeText(getApplicationContext(),"Elemento guardado con exito", Toast.LENGTH_LONG).show();

    }
}


