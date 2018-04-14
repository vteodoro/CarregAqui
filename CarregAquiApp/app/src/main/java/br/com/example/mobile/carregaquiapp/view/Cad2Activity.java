package br.com.example.mobile.carregaquiapp.view;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.example.mobile.carregaquiapp.R;

public class Cad2Activity extends Activity{

    private Button cad2;
    final Context ctx = this;


    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro02);

        cad2 = findViewById(R.id.btnP2);
        cad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ctx, Cad3Activity.class));
                finish();
            }
        });

    }
}