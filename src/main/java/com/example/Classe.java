package com.example;

import java.util.ArrayList;

public class Classe {
    
    int anno;
    String sezione;
    ArrayList<Alunno> listaAlunni = new ArrayList<>();

    public Classe(){
    }
    
    public Classe(int anno, String sezione, ArrayList<Alunno> alunni) {
        this.anno = anno;
        this.sezione = sezione;
        this.listaAlunni = alunni;
    }

    public int getAnno() {
        return anno;
    }

    public String getSezione() {
        return sezione;
    }
    
    public ArrayList<Alunno> getListaAlunni() {
        return listaAlunni;
    }
    
    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public void setListaAlunni(ArrayList<Alunno> listaAlunni) {
        this.listaAlunni = listaAlunni;
    }

    public void AggiungiAlunno(Alunno a) {
        listaAlunni.add(a);
    }
}
