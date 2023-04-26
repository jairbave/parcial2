package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tex,pass;
    private View btnEnviar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         tex = findViewById(R.id.edi_tex);
         pass = findViewById(R.id.contra);
        btnEnviar = findViewById(R.id.btnenviar);

        btnEnviar.setOnClickListener(new  View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = Integer.parseInt(tex.getText().toString());
                Intent intent;

                int numero2 = Integer.parseInt(pass.getText().toString());
                Intent intent2;
            }
        }
    }
}