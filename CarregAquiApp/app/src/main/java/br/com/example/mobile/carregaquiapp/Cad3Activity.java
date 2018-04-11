package br.com.example.mobile.carregaquiapp;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Cad3Activity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro03);
    }

    public void registrar(View view){
        startActivity(new Intent(this, HomeActivity.class));
        finish();
    }

}
