package br.com.example.mobile.carregaquiapp.view;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.example.mobile.carregaquiapp.R;

public class Cad3Activity extends Activity{

    private Button cad3;
    final Context ctx = this;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro03);

        cad3 = findViewById(R.id.btnP3);
        cad3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ctx, HomeActivity.class));
                finish();
            }
        });

    }
}
