package br.com.up.mypokedex.network;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import br.com.up.mypokedex.model.Pokemon;

public class PokeAPI {

    public void getPokemon(PokeAPIListener listener){

        ConnectionAsyncTask asyncTask =  new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {

            @Override
            public void onRequestFinish(JSONObject object) {
                ArrayList<Pokemon>pokemons = new ArrayList<>();

                try {

                    JSONArray results = object.getJSONArray("results");

                    for (int index = 0 ; index < results.length(); index++){

                        JSONObject objectPokemon = results.getJSONObject(index);

                        int id = index +1;
                        String name = objectPokemon.getString("name");
                        String url = objectPokemon.getString("url");
                        url = url.replace("https://pokeapi.co/api/v2/pokemon/","");
                        url = url.replace("/","");
                        String image = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png";

                        pokemons.add(new Pokemon(id,name,image));
                    }
                }catch (Exception e){

                }

                listener.onPokemonsMapperFinish(pokemons);
            }
        });
        asyncTask.execute("https://pokeapi.co/api/v2/pokemon?limit=150");
    }



    public void getPokemonDetail(int id, onPokeAPIDetailListener listener){
        ConnectionAsyncTask asyncTask =  new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {

            @Override
            public void onRequestFinish(JSONObject object) {
                ArrayList<Pokemon>pokemons = new ArrayList<>();

                try {

                    JSONArray results = object.getJSONArray("results");

                    for (int index = 0 ; index < results.length(); index++){

                        JSONObject objectPokemon = results.getJSONObject(index);

                        int id = index +1;
                        String name = objectPokemon.getString("name");
                        String url = objectPokemon.getString("url");
                        url = url.replace("https://pokeapi.co/api/v2/pokemon/","");
                        url = url.replace("/","");
                        String image = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/" + id + ".png";

                        pokemons.add(new Pokemon(id,name,image));
                    }
                    listener.onFinish(pokemons);
                }catch (Exception e){
                    listener.onFinish(null);

                }
            }
        });
        asyncTask.execute("https://pokeapi.co/api/v2/pokemon?limit=150");
    }


    public interface onPokeAPIDetailListener{
        void onFinish(ArrayList<Pokemon> pokemons);
    }

    public interface PokeAPIListener{
        void onPokemonsMapperFinish(ArrayList<Pokemon> pokemons);
    }

}
