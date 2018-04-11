package br.com.example.mobile.carregaquiapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cad1Activity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro01);

    }

    public void next1(View view){
        startActivity(new Intent(this, Cad2Activity.class));
        finish();
    }

}