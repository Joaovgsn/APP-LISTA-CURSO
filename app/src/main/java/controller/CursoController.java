package controller;

import java.util.ArrayList;
import java.util.List;

import model.Curso;

public class CursoController {

    private List listCurso;

    public List getlistCurso() {
        listCurso =  new ArrayList<Curso>();
        listCurso.add(new Curso("JAVA"));
        listCurso.add(new Curso("PYTHON"));
        listCurso.add(new Curso("C#"));
        listCurso.add(new Curso("C"));
        listCurso.add(new Curso("KOTLIN"));

        return listCurso;
    }
    public ArrayList<String> dadosSpinner(){
        ArrayList<String> dados = new ArrayList<>();

        for (int i = 0;i < getlistCurso().size();i++){
            Curso objeto = (Curso) getlistCurso().get(i);
            dados.add(objeto.getCursoDesejado());
        }
        return dados;
    }
}

