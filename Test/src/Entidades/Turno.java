/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Jhonnier
 */
public class Turno {
    private int numero;
    private List<Trabajo> trabajos;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Trabajo> getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(List<Trabajo> trabajos) {
        this.trabajos = trabajos;
    }

    public Turno(int numero) {
        this.numero = numero;
        this.trabajos = new ArrayList<>();
    }
    public Trabajo buscarTrabajo(int nTr){
        for (Trabajo trabajo : trabajos) {
            if(trabajo.getNumero()==nTr){
                return trabajo;
            }
        }
        return null;
    }


    
}
