package br.com.up.appurlsfavoritas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class RegisterActivity extends AppCompatActivity {


    private Button buttonSave;

    private TextInputEditText inputEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        setTitle("cadastro de links");

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
        String url = inputEditText.getEditableText().toString();
        if (url.isEmpty()) {
            inputEditText.setError("Favor verificar o link digitado.");
        }else{

            Intent intent  = new Intent();
            intent.putExtra("Link",url);

            setResult(RESULT_OK,intent);
            finish();
        }
    }
}