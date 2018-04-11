package br.com.example.mobile.carregaquiapp;

import android.app.Activity;
import android.content.Intent;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void recarregar(View view){
        startActivity(new Intent(this, RecarActivity.class));
    }

    public void atualizar(View view){
        TextView s1 = (TextView) findViewById(R.id.saldo1Home);
        TextView s2 = (TextView) findViewById(R.id.saldo2Home);
        Bundle bundle = getIntent().getExtras();
        String saldo1H = bundle.getString("s1");
        String saldo2H = bundle.getString("s2");
        s1.setText("R$" + saldo1H);
        s2.setText("R$" + saldo2H);
    }

    public void addCard(View view){
        Toast.makeText(this, "Em desenvolvimento", Toast.LENGTH_SHORT).show();
    }

}