package br.com.up.mypokedex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import br.com.up.mypokedex.model.Description;
import br.com.up.mypokedex.model.Pokemon;
import br.com.up.mypokedex.network.PokeAPI;

public class DetailActivity extends AppCompatActivity {
    private int id;
    private String nome;
    private String image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imagePokemon = findViewById(R.id.imagePokemon);
        TextView detailsPokemon = findViewById(R.id.detailsPokemon);
        TextView detailType = findViewById(R.id.detailsTypePokemon);
        TextView detailStats = findViewById(R.id.detailStatsPokemon);
        TextView detailAbilities = findViewById(R.id.detailAbilitiesPokemon);
        TextView detailMove = findViewById(R.id.detailMovesPokemon);

        Intent intent = getIntent();
        id = intent.getIntExtra("ID", 1);
        nome = intent.getStringExtra("Nome");
        image = intent.getStringExtra("Image");

        new PokeAPI().getPokemonDetail(id, new PokeAPI.onPokeAPIDetailListener() {
            @Override
            public void onFinish(Description description) {
                Picasso.get().load(image).into(imagePokemon);
                detailsPokemon.setText(nome);

                String types ="";
                String abilities ="";
                String moves ="";
                String stats ="";




                for (int index = 0; index < description.getTypes().size(); index++) {
                        types += description.getTypes().get(index) + "\n";
                    }
                for (int index = 0; index < description.getStats().size(); index++) {
                    stats += description.getStats().get(index) + "\n";
                }

                for (int index = 0; index < description.getAbilities().size(); index++) {
                    abilities += description.getAbilities().get(index) + "\n";
                }

                for (int index = 0; index < description.getMoves().size(); index++) {
                    moves += description.getMoves().get(index) + "\n";
                }


                detailType.setText(types);
                detailStats.setText(stats);
                detailAbilities.setText(abilities);
                detailMove.setText(moves);

            }
        });
    }
}