package br.com.up.mypokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import br.com.up.mypokedex.model.Pokemon;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("pokemon");

    }
}