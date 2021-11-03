package br.com.up.mypokedex.network;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import br.com.up.mypokedex.MainActivity;
import br.com.up.mypokedex.model.Pokemon;

public class PokeAPI {

    public ArrayList<Pokemon> getPokemons(){

        ConnectionAsyncTask connectionAsyncTask =  new ConnectionAsyncTask();
        connectionAsyncTask.execute("https://pokeapi.co/api/v2/pokemon?limit=1500");


        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Pokemon(1,"bulbasaur","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/1.png"));
        pokemons.add(new Pokemon(2,"ivysaur","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/2.png"));
        pokemons.add(new Pokemon(3,"venusaur","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/3.png"));

        pokemons.add(new Pokemon(4,"charmander","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/4.png"));
        pokemons.add(new Pokemon(5,"charmeleon","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/5.png"));
        pokemons.add(new Pokemon(6,"charizard","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/6.png"));

        pokemons.add(new Pokemon(7,"squirtle","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/7.png"));
        pokemons.add(new Pokemon(8,"wartortle","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/8.png"));
        pokemons.add(new Pokemon(9,"blastoise","https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/9.png"));


        return pokemons;
    }

}
