package br.com.blogspot.dbrtech.cap4;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by diogo on 29/10/2016.
 */

public class DebugActivity extends Activity {
    protected static final String TAG ="livro";

    protected void onCreate(Bundle incicle){
        super.onCreate(incicle);
        Log.i(TAG, getLocalClassName()+" .onCreate () chamado");
    }

    protected void onStart(){
        super.onStart();
        Log.i(TAG, getLocalClassName()+".onStart() chamado");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, getLocalClassName()+ ".onRestart() chamado");
    }

    protected void onResume (){
        super.onResume();
        Log.i(TAG, getLocalClassName()+".onResume() chamado");
    }

    protected  void onPause (){
        super.onPause();
        Log.i(TAG, getLocalClassName()+".onPause() chamado");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG, getLocalClassName()+".onSaveInstanceState () chamado");
    }

    protected void onStop(){
        super.onStop();
        Log.i(TAG, getLocalClassName()+".onStop () chamado");
    }

    protected void onDestroy (){
        super.onDestroy();
        Log.i(TAG, getLocalClassName()+".onDestroy() chamado");
    }

    private String getClassName(){
        //retorna o nome da classe do pacote
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }

}
