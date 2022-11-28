package com.example.veterinaria;

public class Mascota {

    private String Nombre;
    private String Tipo;
    private String Sexo;

    public Mascota() {
    }

    @Override
    public String toString() {
        return "Mascota{}";
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }
}
