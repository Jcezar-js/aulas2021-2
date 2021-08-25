package br.com.up.appurlsfavoritas;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
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
//       fabAddLink.setImageResource(R.drawable.ic_launcher_foreground);

//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getBaseContext(), "Clicou", Toast.LENGTH_LONG).show();
//            }
//        };


        fabAddLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Abrindo Register", Toast.LENGTH_LONG).show();
//                callBrowserWithUrl("https://www.netflix.com");
                callRegisterActivity();
            }
        });
    }

    private void callRegisterActivity() {

        Intent intent = new Intent(this, RegisterActivity.class);

        startActivityForResult(intent, 1234);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1234 && resultCode == RESULT_OK){
            String url = data.getStringExtra("link");
            Toast.makeText(getBaseContext(), "URL " + url, Toast.LENGTH_LONG).show();
        }
    }

    //Função para chamar o navegador e entrar na netflix
    private void callBrowserWithUrl(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

}