package com.gesad.qwerty.agenda;

import android.widget.EditText;
import android.widget.RatingBar;

import com.gesad.qwerty.agenda.modelo.Aluno;

/**
 * Created by qwerty on 06/03/18.
 */

public class FormularioHelper {

    private final EditText campoNome;
    private final EditText campoEndereco;
    private final EditText campoTelefone;
    private final EditText campoSite;
    private final RatingBar campoNota;

    public FormularioHelper(FormularioActivity activity){
        campoNome = (EditText)activity.findViewById(R.id.formulario_nome);
        campoEndereco = (EditText)activity.findViewById(R.id.formulario_endereco);
        campoTelefone = (EditText)activity.findViewById(R.id.formulario_telefone);
        campoSite = (EditText)activity.findViewById(R.id.formulario_site);
        campoNota = (RatingBar) activity.findViewById(R.id.formulario_nota);


    }

    public Aluno pegaAluno() {

        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setTelefone(campoTelefone.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));
        return  aluno;

    }
}
