package br.com.blogspot.dbrtech.cap4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(onClickIniciar());
    }

    private View.OnClickListener onClickIniciar() {
        return new View.OnClickListener(){
            @Override
            public void onClick (View v){
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tsenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();
                if("ricardo".equals(login)&&"123".equals(senha)){
                    //navegar pra proxima tela
                    //1° opção
//                    Intent intent = new Intent (getContext(), BemVindoActivity.class);
//                    Bundle params = new Bundle();
//                    params.putString("nome", "Ricardo Lecheta");
//                    intent.putExtras(params);
//                    startActivity(intent);
                    //ou

                    Intent intent = new Intent(getContext(),BemVindoActivity.class);
                    intent.putExtra("nome", "Ricardo Lecheta");
                    startActivity(intent);
                }else{
                    alert("Login e Senha Incorretos");
                }
            }
        };
    }
    private Context getContext (){
        return  this;
    }

    private void alert (String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
