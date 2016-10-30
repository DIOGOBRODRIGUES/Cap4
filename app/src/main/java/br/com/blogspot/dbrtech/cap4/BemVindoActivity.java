package br.com.blogspot.dbrtech.cap4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class BemVindoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bem_vindo);// layout desta Activity


        //Recebe o nome enviado por  parâmetro
        //primeirto modo
//        Bundle args = getIntent().getExtras();
//        String nome = args.getString("nome");
        //segundo modo
        Intent intent = getIntent();
        String nome = intent.getStringExtra("nome");

        //vamos atualizar o texto do TextView vom uma mensagem de bem-vindo
        TextView text = (TextView) findViewById(R.id.text);
        text.setText(nome+", seja bem vindo!");
        //adicionar o botão upnavigation
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    public  boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();
        if(id==android.R.id.home){
            //metodo finish() vai encerrar essa activity
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
