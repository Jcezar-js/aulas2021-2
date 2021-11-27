package br.com.up.mypokedex.network;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import br.com.up.mypokedex.model.Description;
import br.com.up.mypokedex.model.Pokemon;

public class PokeAPI {

    public void getPokemon(PokeAPIListener listener){

        ConnectionAsyncTask asyncTask =  new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {

            @Override
            public void onRequestFinish(JSONObject object) {

                try {
                    ArrayList<Pokemon>pokemons = new ArrayList<>();

                    JSONArray results = object.getJSONArray("results");

                    for (int index = 0 ; index < results.length(); index++){

                        JSONObject objectPokemon = results.getJSONObject(index);

                        int id = index + 1;
                        pokemons.add(new Pokemon(id, objectPokemon.getString("name"),
                                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/"
                        +id+".png"));
                    }
                    listener.onPokemonsMapperFinish(pokemons);
                }catch (Exception e){
                    listener.onPokemonsMapperFinish(null);
                }
            }
        });
        asyncTask.execute("https://pokeapi.co/api/v2/pokemon?limit=150");
    }



    public void getPokemonDetail(int id, onPokeAPIDetailListener listener){
        ConnectionAsyncTask asyncTask =  new ConnectionAsyncTask(new ConnectionAsyncTask.ConnectionListener() {

            @Override
            public void onRequestFinish(JSONObject object) {
                try{

                    ArrayList<String> pokeAbilities =  new ArrayList<>();
                    ArrayList<String> pokeMoves =  new ArrayList<>();
                    ArrayList<String> pokeStats =  new ArrayList<>();
                    ArrayList<String> pokeTypes =  new ArrayList<>();

                    Description description =  new Description();

                    //TRAZ A API

                    JSONArray abilities = object.getJSONArray("abilities");
                    JSONArray types = object.getJSONArray("types");
                    JSONArray moves = object.getJSONArray("moves");
                    JSONArray stats = object.getJSONArray("stats");


//                    get habilidades
                    for (int index = 0; index < abilities.length(); index++){

                        JSONObject objectAbilities = abilities.getJSONObject(index);
                        JSONObject objectAbility = objectAbilities.getJSONObject("ability");

                        String abilityName =  objectAbility.getString("name");

                        pokeAbilities.add(abilityName);
                    }

                    for (int index = 0; index < types.length(); index++){
                        JSONObject objectTypes = types.getJSONObject(index);
                        JSONObject objectType = objectTypes.getJSONObject("type");

                        String typeName = objectType.getString("name");

                        pokeTypes.add(typeName);
                    }
                    for (int index = 0; index < moves.length(); index++){
                        JSONObject objectMoves = moves.getJSONObject(index);
                        JSONObject objectMove = objectMoves.getJSONObject("move");

                        String nameMove = objectMove.getString("name");

                        pokeMoves.add(nameMove);
                    }
                    for (int index = 0; index<stats.length(); index++){
                        JSONObject objectStats = stats.getJSONObject(index);
                        int base = objectStats.getInt("base_stat");

                        JSONObject objectState = objectStats.getJSONObject("stat");
                        String stateName = objectState.getString("name");

                        pokeStats.add(stateName + ": " + base);
                    }

                    description.setAbilities(pokeAbilities);
                    description.setTypes(pokeTypes);
                    description.setMoves(pokeMoves);
                    description.setStats(pokeStats);


                    listener.onFinish(description);
                }catch (Exception e){
                    listener.onFinish(null);

                }
            }
        });
        asyncTask.execute("https://pokeapi.co/api/v2/pokemon/"+id+"/");
    }




    public interface onPokeAPIDetailListener{
        void onFinish(Description description);
    }

    public interface PokeAPIListener{
        void onPokemonsMapperFinish(ArrayList<Pokemon> pokemons);
    }

}
