package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText cajanumerohoras;
    TextView cajatexto;
    Button botoncalcular;
    int horasdigitadas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajanumerohoras=findViewById(R.id.numerohoras);
        cajatexto=findViewById(R.id.texto);
        botoncalcular=findViewById(R.id.calcular);

        botoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               horasdigitadas=Integer.parseInt(cajanumerohoras.getText().toString());
                if (horasdigitadas<=40)
                {
                    int salario=horasdigitadas*20000;
                    cajatexto.setText("Su salario es de: "+salario);
                }
                else
                {
                    int salariobase=800000;
                    int numerohorasextras=horasdigitadas-40;
                    int salario=salariobase+(numerohorasextras*25000);
                    cajatexto.setText(salario);
                }
            }
        });
    }
}