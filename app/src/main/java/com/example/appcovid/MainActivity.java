package com.example.appcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Botao_Casa = findViewById(R.id.entrar_casa);

        Botao_Casa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acessoCasa = new Intent(MainActivity.this, Casa.class);
                startActivity(acessoCasa);


            }
        });


        Button Botao_idosos = findViewById(R.id.grupo_risco);

        Botao_idosos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acessoidosos = new Intent(MainActivity.this, idosos.class);
                startActivity(acessoidosos);

            }
        });

        Button Btn_rua = findViewById(R.id.sair_rua);

        Btn_rua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acesrua = new Intent(MainActivity.this, rua.class);
                startActivity(acesrua);

            }
        });



        TextView Btn_cot = findViewById(R.id.hiperlinks);

        Btn_cot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               setContentView(R.layout.activity_main);
               TextView link = (TextView)findViewById(R.id.hiperlinks);
               String linkText = "Visite o site do <a href='https://www.cotemig.com.br'>Cotemig.";
               link.setText(Html.fromHtml(linkText));


            }
        });

    }

}
