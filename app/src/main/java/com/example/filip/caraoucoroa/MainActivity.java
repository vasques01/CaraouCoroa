package com.example.filip.caraoucoroa;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] /* nome do array  */opcao = /* inserir os itens da array */{"cara","coroa"};

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = findViewById(R.id.botaoJogarId);
        botaoJogar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //gerar numero aleatorio

                Random randomico = new Random();
                int numeroAleatorio= randomico.nextInt(2);

                //opcao[numeroAleatorio] / passar a informacao para outra tela usando intent.

                Intent intent = new Intent(MainActivity.this,DetalheActivity.class);

                //putExtra metodo responsavel por enviar a informacao
                intent.putExtra("opcao", opcao[numeroAleatorio]);

                startActivity(intent);

            }
        });





    }
}
