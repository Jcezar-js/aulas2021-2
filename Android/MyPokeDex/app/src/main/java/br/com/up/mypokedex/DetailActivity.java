package br.com.up.mypokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

import br.com.up.mypokedex.adapter.PokemonAdapter;
import br.com.up.mypokedex.model.Pokemon;

public class DetailActivity extends AppCompatActivity {

    private ArrayList<Pokemon> pokemons = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Pokemon pokemon = (Pokemon) getIntent().getSerializableExtra("pokemon");

        PokemonAdapter adapter = new PokemonAdapter(pokemons, new PokemonAdapter.PokemonClickListener() {
            @Override
            public void onPokemonClick(Pokemon pokemon) {

            }
        }){

        };

    }
}