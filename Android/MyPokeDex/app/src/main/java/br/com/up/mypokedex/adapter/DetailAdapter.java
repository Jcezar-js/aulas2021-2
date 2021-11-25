package br.com.up.mypokedex.adapter;

import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import br.com.up.mypokedex.R;
import br.com.up.mypokedex.model.Pokemon;
import br.com.up.mypokedex.network.PokeAPI;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {


    private ArrayList<Pokemon> pokemons;
    private PokemonDetailCLickListener Detaillistener;

    public DetailAdapter (ArrayList<Pokemon> pokemons, PokemonDetailCLickListener Detaillistener){
        this.pokemons = pokemons;
        this.Detaillistener = Detaillistener;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull DetailAdapter.DetailViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DetailViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageDetailViewPokemon;
        public TextView TextViewDetailPokemon;
        public TextView TextViewNamePokemon;

        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);
            imageDetailViewPokemon = itemView.findViewById(R.id.imagePokemon);
            TextViewDetailPokemon = itemView.findViewById(R.id.descriptionPokemon);
            TextViewNamePokemon = itemView.findViewById(R.id.namePokemon);

        }
    }

    public interface PokemonDetailCLickListener{

    }
}
