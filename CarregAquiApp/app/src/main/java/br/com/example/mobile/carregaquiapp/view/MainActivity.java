package br.com.example.mobile.carregaquiapp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.example.mobile.carregaquiapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void entrar(View view){
        EditText login = (EditText) findViewById(R.id.login);
        EditText senha = (EditText) findViewById(R.id.senha);
        login.setText("admin");
        senha.setText("123");

        if("admin".equals(login.getText().toString()) && "123".equals(senha.getText().toString())){
            startActivity(new Intent(this, HomeActivity.class));
        }
        else{
            Toast.makeText(this, "Login ou senha inválida!", Toast.LENGTH_SHORT).show();
        }
        login.setText(null);
        senha.setText(null);

    }

    public void cadastrar(View view){
        startActivity(new Intent(this, Cad1Activity.class));
    }

}