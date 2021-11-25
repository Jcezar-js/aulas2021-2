package br.com.up.mypokedex.network;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import br.com.up.mypokedex.model.Pokemon;

public class PokeAPIDetails {


    public void getDetails(PokeAPIDetailsListener listener){

        ConnectionAsyncTask connectionAsyncTask =  new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {

            @Override
            public void onRequestFinish(JSONObject object) {
                ArrayList<Pokemon> details = new ArrayList<>();

                try {

                    JSONArray results = object.getJSONArray("results");
                    JSONArray moves = object.getJSONArray("moves");
                    JSONArray types = object.getJSONArray("types");
                    JSONArray abilities = object.getJSONArray("abilities");
                    JSONArray Stats = object.getJSONArray("Stats");


                    for (int index = 0 ; index < results.length(); index++){

                        JSONObject objectPokemon = results.getJSONObject(index);
                        JSONArray objectAbilities = abilities.getJSONArray(index);

                        String name = objectPokemon.getString("name");
                        String url = objectPokemon.getString("url");
                        String genre = objectPokemon.getString("genre");




                        String id = url.replace("https://pokeapi.co/api/v2/pokemon/","");
                        id = id.replace("/","");
                        String image = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png";
                        Pokemon pokemon = new Pokemon(Integer.parseInt(id), name,image,genre);

                        details.add(pokemon);
                    }
                }catch (Exception e){
                }

                listener.onPokemonsDetailsMapper(details);
            }
        });
        connectionAsyncTask.execute("https://pokeapi.co/api/v2/pokemon/", "");
    }


    public interface PokeAPIDetailsListener {
        void onPokemonsDetailsMapper(ArrayList<Pokemon> pokemons);
    }
}
