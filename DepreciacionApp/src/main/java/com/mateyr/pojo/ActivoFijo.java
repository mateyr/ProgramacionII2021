/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mateyr.pojo;

/**
 *
 * @author Sistemas-07
 */
public class ActivoFijo {
    
    private String nombre;
    private int valorActivo;
    private int valorSalv;
    private int tipo;

    public ActivoFijo(String nombre, int valorActivo, int valorSalv, int tipo) {
        this.nombre = nombre;
        this.valorActivo = valorActivo;
        this.valorSalv = valorSalv;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getValorActivo() {
        return valorActivo;
    }

    public void setValorActivo(int valorActivo) {
        this.valorActivo = valorActivo;
    }

    public int getValorSalv() {
        return valorSalv;
    }

    public void setValorSalv(int valorSalv) {
        this.valorSalv = valorSalv;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
