package com.gesad.qwerty.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        String [] alunos = {"Eliaquim" , "Messias" ,"Jefferson","Eliaquim" , "Messias" ,"Jefferson","Eliaquim" , "Messias" ,"Jefferson"};
        ListView listaAlunos = (ListView) findViewById(R.id.lista_aluno);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,alunos);
        listaAlunos.setAdapter(adapter);

        Button novoAluno = (Button) findViewById(R.id.novo_aluno);
        novoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentvaiProFormulario   = new Intent(ListaAlunosActivity.this,FormularioActivity.class);
                startActivity(intentvaiProFormulario);
            }
        });

    }
}
