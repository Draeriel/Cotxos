package org.mvpigs.cotxos;

import java.util.ArrayList;

public class Conductor {
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0d;
    private ArrayList<Byte> valoraciones = new ArrayList<Byte>();
    private boolean ocupado = false;


    public Conductor(){

    }


    public Conductor(String nombre){
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setValoracion(byte valor){
        setValoraciones(valor);
        setValoracionMedia();
    }

    public void setValoraciones(byte valoraciones) {
        this.valoraciones.add(valoraciones);
    }

    public void setValoracionMedia() {
        double total = 0d;
        for (int valor : valoraciones){
            total += valor;
        }
        this.valoracionMedia = total/valoraciones.size();
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getValoracion() {
        return valoracionMedia;
    }




}
