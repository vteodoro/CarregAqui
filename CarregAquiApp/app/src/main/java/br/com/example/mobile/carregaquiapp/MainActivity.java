package br.com.example.mobile.carregaquiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar(View view){
        EditText login = (EditText) findViewById(R.id.login);
        EditText senha = (EditText) findViewById(R.id.senha);

        if("admin".equals(login.getText().toString()) && "123".equals(senha.getText().toString())){
            startActivity(new Intent(this, HomeActivity.class));
        }
        else{
            Toast.makeText(this, "Login ou senha inválida!", Toast.LENGTH_SHORT).show();
        }
        login.setText(null);
        senha.setText(null);

    }

    public void recup(View view){
        startActivity(new Intent(this, RecupActivity.class));
    }

    public void cadastrar(View view){
        startActivity(new Intent(this, Cad1Activity.class));
    }

}