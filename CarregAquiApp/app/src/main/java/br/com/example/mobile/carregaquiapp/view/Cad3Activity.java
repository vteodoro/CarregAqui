package br.com.example.mobile.carregaquiapp.view;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import br.com.example.mobile.carregaquiapp.R;

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
