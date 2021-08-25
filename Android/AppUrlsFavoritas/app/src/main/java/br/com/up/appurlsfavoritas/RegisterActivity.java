package br.com.up.appurlsfavoritas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {


    private Button buttonSave;

    private TextInputEditText inputEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        buttonSave = findViewById(R.id.button_register_save);
        inputEditText = findViewById(R.id.input_register_link);

        buttonSave.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                saveLink();
            }
        });
    }
    private void saveLink() {
        String link = inputEditText.getEditableText().toString();
        if (link.isEmpty()) {
            inputEditText.setError("Favor verificar o link digitado.");
        }else{

            Intent intent  = new Intent();
            intent.putExtra("Link", link);
            setResult(RESULT_OK,intent);
            finish();
        }
    }
}