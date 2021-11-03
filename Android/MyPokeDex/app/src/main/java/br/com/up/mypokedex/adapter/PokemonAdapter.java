package br.com.up.mypokedex.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.security.Policy;
import java.util.ArrayList;

import br.com.up.mypokedex.R;
import br.com.up.mypokedex.model.Pokemon;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>{

    //Variavel global para a lista de pokemons
    private ArrayList<Pokemon> pokemons;
    private PokemonClickListener listener;

    //Construtor
    public PokemonAdapter (ArrayList<Pokemon> pokemons, PokemonClickListener listener){
        this.pokemons = pokemons;
        this.listener = listener;
    }


    //Métodos implementados para que o adapter funcione corretamente
    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //Layout inflater para converter um arquivo xml em um objeto "VIEW"
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_view_pokemon,parent,false);

        return new PokemonViewHolder(view);
    }

    //Serve para atualizar informações
    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {
        Pokemon pokemon = pokemons.get(position);
        holder.textViewPokemonName.setText(pokemon.getName());

        //Biblioteca download e posicionamento da imagem
        Picasso.get()
                .load(pokemon.getImage())
                .placeholder(R.drawable.ic_launcher_foreground)
                .into(holder.imageViewPokemon);
    }

    //Mostra a quantidade de itens da lista
    @Override
    public int getItemCount() {
        return pokemons.size();
    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageViewPokemon;
        public TextView textViewPokemonName;

        public PokemonViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewPokemon = itemView.findViewById(R.id.image_view_item_pokemon);
            textViewPokemonName = itemView.findViewById(R.id.text_view_item_pokemon);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position = getAdapterPosition();
                    Pokemon pokemon = pokemons.get(position);

                    listener.onPokemonClick(pokemon);
                }
            });
        }
    }
    //listener custom, retorna o pokemon que foi clicado
    public interface PokemonClickListener{
        void onPokemonClick (Pokemon pokemon);
    }
}
