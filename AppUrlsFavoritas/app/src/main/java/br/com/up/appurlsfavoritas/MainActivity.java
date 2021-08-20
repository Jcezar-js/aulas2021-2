package br.com.up.appurlsfavoritas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fabAddLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabAddLink = findViewById(R.id.fab_main_add_link);
        fabAddLink.setImageResource(R.drawable.ic_launcher_foreground);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Clicou", Toast.LENGTH_LONG).show();
            }
        };


        fabAddLink.setOnClickListener(listener);
    }
}