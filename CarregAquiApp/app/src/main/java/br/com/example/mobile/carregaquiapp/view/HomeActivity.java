package br.com.example.mobile.carregaquiapp.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import br.com.example.mobile.carregaquiapp.R;
import br.com.example.mobile.carregaquiapp.model.Saldo;

public class HomeActivity extends Activity {

    Saldo sd = new Saldo();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        TextView s1 = findViewById(R.id.saldo1Home);
        TextView s2 = findViewById(R.id.saldo2Home);

        double saldo1 = sd.getSaldo01();
        double saldo2 = sd.getSaldo02();

        s1.setText((int)saldo1);
        s2.setText((int)saldo2);

    }

    public void recarregar(View view){
        startActivity(new Intent(this, RecarActivity.class));
    }

//    public void atualizar(View view){
//        TextView s1 = findViewById(R.id.saldo1Home);
//        TextView s2 = findViewById(R.id.saldo2Home);
//        Bundle bundle = getIntent().getExtras();
//        String saldo1H = bundle.getString("s1");
//        String saldo2H = bundle.getString("s2");
//        s1.setText("R$" + saldo1H);
//        s2.setText("R$" + saldo2H);
//    }

    public void addCard(View view){
        Toast.makeText(this, "Em desenvolvimento", Toast.LENGTH_SHORT).show();
    }

}