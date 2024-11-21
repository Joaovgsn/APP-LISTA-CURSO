package controller;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.teste04.R;

import model.Pessoa;

public class

PessoaController {

    SharedPreferences preferences;


    @Override
    public String toString() {
        Log.d("mvc-controller", "CONTROLLER INICIADA");
        return "PessoaController{}";
    }
    public void  SALVAR(Pessoa pessoa) {
        Log.d("mvc-controller", "DADOS SALVOS: " + pessoa.toString());


    }
}
