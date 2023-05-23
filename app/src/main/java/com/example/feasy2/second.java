package com.example.feasy2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class second extends AppCompatActivity {

    ImageView yakisoba;
    ImageView hamburguers;
    ImageView pizza;
    ImageView mousse;
    ImageView hotdog;
    ImageView torta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        yakisoba = findViewById(R.id.yakisoba);
        yakisoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d( "clicado", "yakisoba");
                Uri uri = Uri.parse("https://www.tudogostoso.com.br/receita/76053-yakisoba.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        hamburguers = findViewById(R.id.hamburguers);
       hamburguers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d( "clicado", "hamburguer");
                Uri uri = Uri.parse("https://comidinhasdochef.com/hamburguer-caseiro-facil-e-rapido/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        pizza = findViewById(R.id.pizza);
       pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d( "clicado", "pizza");
                Uri uri = Uri.parse("https://www.receiteria.com.br/receitas-de-pizza/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        mousse = findViewById(R.id.mousse);
        mousse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d( "clicado", "mousse");
                Uri uri = Uri.parse("https://www.confeiteiradesucesso.com/15-receitas-de-mousse/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        hotdog = findViewById(R.id.hotdog);
        hotdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d( "clicado", "hotdog");
                Uri uri = Uri.parse("https://www.tudogostoso.com.br/receita/160242-hot-dog-caseirinho.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        torta = findViewById(R.id.torta);
        torta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d( "clicado", "torta");
                Uri uri = Uri.parse("https://www.receiteria.com.br/receitas-de-torta-salgada/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }


    public void MainActivity (View view){

        Intent in = new Intent ( second.this, MainActivity.class);
        startActivity(in);
    }

}
