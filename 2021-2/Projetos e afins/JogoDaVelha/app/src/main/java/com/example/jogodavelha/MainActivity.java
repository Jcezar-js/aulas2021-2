package com.example.jogodavelha;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;


import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private Button OkButton;
    private TextInputLayout InputJogadorX, InputJogadorO;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkButton = findViewById(R.id.OkButton);
        InputJogadorX = findViewById(R.id.InputJogadorX);
        InputJogadorO = findViewById(R.id.InputJogadorO);

        OkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { saveName(); }
        });
    }

    private void saveName(){

        String nomeX = InputJogadorX.getEditText().getEditableText().toString();
        String nomeO = InputJogadorO.getEditText().getEditableText().toString();

        if (nomeX.isEmpty()){
            InputJogadorX.setError("Nome do jogador X em branco!");
        }
        if (nomeO.isEmpty()){
            InputJogadorO.setError("Nome do jogador O em branco!");
        }
        if (!nomeX.isEmpty() && !nomeO.isEmpty()){
            callPlayActivity(nomeX, nomeO);
        }
    }

    private void callPlayActivity(String nomeX, String nomeO){

        Intent intent = new Intent( MainActivity.this,
                PlayActivity.class)
        intent.putExtra("O",nomeO);
        intent.putExtra("X",nomeX);
        startActivityForResult(intent,1000);
    }
}