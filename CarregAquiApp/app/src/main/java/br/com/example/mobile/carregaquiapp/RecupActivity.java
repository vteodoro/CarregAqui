package br.com.example.mobile.carregaquiapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RecupActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recupsenha);
    }

    public void recSenha(View view){
        EditText email = (EditText) findViewById(R.id.email);

        if("adm@adm.com".equals(email.getText().toString())){
            Toast.makeText(this, "Senha enviada!", Toast.LENGTH_SHORT).show();
            finish();
        }
        else{
            Toast.makeText(this, "Digite o e-mail", Toast.LENGTH_SHORT).show();
        }
    }

}
