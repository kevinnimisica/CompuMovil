package com.example.fibonacci;

import androidx.annotation.NonNull;

public class Pais{
    private String nombrePais;
    private String capital;
    private String nomPaInt;
    private String sigla;


    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getNomPaInt() {
        return nomPaInt;
    }

    public void setNomPaInt(String nomPaInt) {
        this.nomPaInt = nomPaInt;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public Pais(String nombrePais, String capital, String nomPaInt, String sigla) {
        this.nombrePais = nombrePais;
        this.capital = capital;
        this.nomPaInt = nomPaInt;
        this.sigla = sigla;
    }

    @NonNull
    @Override
    public String toString() {
        String Pais ="";
        Pais = "Nombre: " + nombrePais +"\nSigla: " + sigla + "\nCapital: " + capital;
        return Pais;
    }
}
