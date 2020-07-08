package com.appfrasesdodia.componentesandroidcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //criando as variaveis globais
    private CheckBox checkVerde, checkVermelho, checkBranco;
    private TextView textResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //relacionando cada checkbox
        checkVerde      = findViewById(R.id.checkVerde);
        checkVermelho   = findViewById(R.id.checkVermelho);
        checkBranco     = findViewById(R.id.checkBranco);
        textResultado   = findViewById(R.id.textResultado);
    }

    public void checkbox(){

        /*Primeira forma#1
        boolean verificacheckverde = checkVerde.isChecked();
        boolean verificacheckvermelho = checkVermelho.isChecked();
        textResultado.setText("verde  " + verificacheckverde + " vermelho "+ verificacheckvermelho);*/

        //Segunda forma utilizando IF
        String texto = "";
        if (checkVerde.isChecked() ){
            texto = "Verde Selecionado-";
        }
        if (checkVermelho.isChecked() ){
            //outra forma pegando o texto do checkbox
            String corSelecionada = checkVermelho.getText().toString();
            texto = corSelecionada;
            //texto = texto + "Vermelho Selecionado-";
        }
        if (checkBranco.isChecked() ){
            texto = texto + "Branco Selecionado-";
        }
        textResultado.setText(texto);
    }

    public void enviar(View view){
        checkbox();
    }


}
