package br.com.up.mypokedex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import br.com.up.mypokedex.adapter.PokemonAdapter;
import br.com.up.mypokedex.model.Pokemon;
import br.com.up.mypokedex.network.ConnectionAsyncTask;
import br.com.up.mypokedex.network.PokeAPI;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPokemon;
    private ArrayList<Pokemon> pokemons = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPokemon = findViewById(R.id.recycler_pokemon);
        //Exibição do layout (grid)
        recyclerViewPokemon.setLayoutManager(new GridLayoutManager(this, 3));

        PokemonAdapter adapter = new PokemonAdapter(pokemons,
                new PokemonAdapter.PokemonClickListener() {
                    @Override
                    public void onPokemonClick(Pokemon pokemon) {
                        callPokemonDetail(pokemon);
                    }
                });

        recyclerViewPokemon.setAdapter(adapter);


        new PokeAPI().getPokemon(new PokeAPI.PokeAPIListener() {
            @Override
            public void onPokemonsMapperFinish(ArrayList<Pokemon> pokemons) {
                MainActivity.this.pokemons.addAll(pokemons);
                recyclerViewPokemon.getAdapter().notifyDataSetChanged();
            }
        });
    }

    private void callPokemonDetail(Pokemon pokemon){
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("ID", pokemon.getId());
        intent.putExtra("Nome", pokemon.getName());
        intent.putExtra("Image", pokemon.getImage());

        startActivity(intent);
    }



}
