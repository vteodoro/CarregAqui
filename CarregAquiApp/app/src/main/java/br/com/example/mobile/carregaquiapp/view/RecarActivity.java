package br.com.example.mobile.carregaquiapp.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import br.com.example.mobile.carregaquiapp.R;
import br.com.example.mobile.carregaquiapp.model.Saldo;
import br.com.example.mobile.carregaquiapp.view.HomeActivity;

public class RecarActivity extends Activity{
    Saldo sd = new Saldo();

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recarregar);

    }

    public void recarCard (View view){
//
//        EditText saldo1 = findViewById(R.id.saldo1Rec);
//        EditText saldo2 = findViewById(R.id.saldo2Rec);
//
//
//        if((saldo1.getText().toString().isEmpty())&&(saldo2.getText().toString().isEmpty())){
//            Toast.makeText(this, "Insira um valor", Toast.LENGTH_SHORT).show();
//        }
//        else{
//            Toast.makeText(this, "Valor creditado", Toast.LENGTH_SHORT).show();
//
//            Bundle bundle = new Bundle();
//            bundle.putString("s1", saldo1.getText().toString());
//            bundle.putString("s2", saldo2.getText().toString());
//

            sd.setSaldo01(R.id.saldo1Rec);
            sd.setSaldo02(R.id.saldo2Rec);
            
            Intent intent = new Intent(this, HomeActivity.class);
            //intent.putExtras(bundle);
            startActivity(intent);

            finish();
        }
    }
//}
