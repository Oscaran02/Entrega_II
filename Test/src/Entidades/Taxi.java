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
public class Taxi {
    private String placa;
    private List<Turno> turnos;

    public Taxi() {
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public Taxi(String placa) {
        this.placa = placa;
        this.turnos= new ArrayList<>();
    }
    public Turno buscarTurno(int nT){
        for (Turno turno : turnos) {
            if(turno.getNumero()==nT){
                return turno;
            }
        }
        return null;
    }


    
}
