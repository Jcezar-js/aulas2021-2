package com.example.starwarswiki.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class JediAdapter extends RecyclerView.Adapter<JediAdapter>
{
    private ArrayList<Character>characters;


    @NonNull
    @Override
    public JediAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull JediAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return characters.size();
    }

    public class CharacterViewHolder extends RecyclerView.ViewHolder{

        public ImageView imageviewCharacter;
        public TextView textviewCharacter;

        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);
            imageviewCharacter = itemView.findViewById()
            textviewCharacter =

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int position = getAdapterPosition();
                    Pokemon pokemon = pokemons.get(position);

                    listener.onPokemonClick(pokemon);
                }
            });
        }

        public CharacterViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
