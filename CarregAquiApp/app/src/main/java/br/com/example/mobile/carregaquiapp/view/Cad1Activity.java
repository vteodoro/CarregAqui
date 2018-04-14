package br.com.example.mobile.carregaquiapp.view;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.example.mobile.carregaquiapp.R;

public class Cad1Activity extends Activity{

    private Button cad1;
    final Context ctx = this;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro01);

        cad1 = findViewById(R.id.btnP1);
        cad1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ctx, Cad2Activity.class));
                finish();
            }
        });

    }

}