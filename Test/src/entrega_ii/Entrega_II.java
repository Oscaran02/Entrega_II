/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entrega_ii;

import Controller.FacadeTurno;
import Entidades.Trabajo;


/**
 *
 * @author Jhonnier
 */
public class Entrega_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* FacadeTurno t = new FacadeTurno();
        t.crearTaxi("1003");
        t.crearTurno(1);
        t.iniciarTrabajo(2);*/
       Trabajo t = new Trabajo(12);
       System.out.println("Hora inicial " + t.getFechaHoraInicio());
       System.out.println("Hora final " + t.getFechaHoraFinal().plusMinutes(50));
    }
    
}
