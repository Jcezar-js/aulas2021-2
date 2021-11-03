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
        ConnectionAsyncTask connectionAsyncTask =  new ConnectionAsyncTask();
        connectionAsyncTask.execute("https://pokeapi.co/api/v2/pokemon?limit=1500");
    }

    private void callPokemonDetail(Pokemon pokemon){
        Intent intent = new Intent(this,DetailActivity.class);
        intent.putExtra("pokemon", pokemon);
        startActivity(intent);
    }

    //Página de requisição HTTP
    public class ConnectionAsyncTask extends AsyncTask<String,Integer,String> {

        @Override //Do in background executa esta tarefa fora da vista do usuário
        protected String doInBackground(String... strings) {
            String stringUrl = strings[0];

            try
            {
                URL url = new URL(stringUrl);
                HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                if (urlConnection.getResponseCode() == 200)
                {
                    InputStream inputStream = urlConnection.getInputStream();
                    return IOUtils.toString(inputStream, "UTF-8");
                }

                else{
                    return null;
                }

            }catch (Exception e)
            {
                return null;
            }
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            try{
                JSONObject object = new JSONObject(s);

                JSONArray results = object.getJSONArray("results");

                for (int index = 0 ; index < results.length(); index++){
                    JSONObject objectPokemon = results.getJSONObject(index);

                    String name = objectPokemon.getString("name");
                    String url = objectPokemon.getString("url");

                    String id = url.replace("https://pokeapi.co/api/v2/pokemon/","");
                    id = id.replace("/","");
                    String image = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png";
                    Pokemon pokemon = new Pokemon(Integer.parseInt(id), name,image);

                    pokemons.add(pokemon);
                }
                recyclerViewPokemon.getAdapter().notifyDataSetChanged();
            }catch (Exception e){

            }
        }
    }

}
