package br.com.up.mypokedex.network;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import br.com.up.mypokedex.MainActivity;
import br.com.up.mypokedex.model.Pokemon;

public class PokeAPI {

    public ArrayList<Pokemon> getPokemons(){
        ConnectionAsyncTask connectionAsyncTask =  new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {
            @Override
            public void onRequestFinish(JSONObject object) {

                try {
                    JSONArray results = object.getJSONArray("results");

                    for (int index = 0; index <results.length(); index++){
                        JSONObject objectPokemon = results.getJSONObject(index);

                        String name = objectPokemon.getString("name");
                        String url =  objectPokemon.getString("url");
                        String id = url.replace()
                    }
                }catch ()

            }
        }
    }
}
