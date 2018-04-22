/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.Cliente;
import Entidades.Recargo;
import Entidades.Taxi;
import Entidades.Trabajo;
import Entidades.Turno;
import Enumeration.Denominacion;
import Enumeration.TipoDocumento;
import Vista.Excepciones;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Jhonnier
 */
public class FacadeTurno {
    private Taxi taxi;
    private FacadePersistencia persistencia;
    private Denominacion demoninaciones;

    public FacadeTurno() {
        this.persistencia = new FacadePersistencia();
    }
    
    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public Denominacion getDemoninaciones() {
        return demoninaciones;
    }

    public void setDemoninaciones(Denominacion demoninaciones) {
        this.demoninaciones = demoninaciones;
    }
    
    public boolean crearTaxi(String placa){
        taxi = new Taxi (placa);
        if (taxi == null) {
            return false;
        }
        return true;
    }
    
    public boolean crearTurno(int nTu){
        Turno turno = new Turno(nTu);
        if(taxi.getTurnos().size()>0){    
            if (taxi.buscarTurno(nTu)!=null) {
                return false;
            }
            taxi.getTurnos().add(turno);
        }else{    
        taxi.getTurnos().add(turno);
        }
        return true;
    }
    
    public boolean iniciarTrabajo(int nTr) throws Exception{
        int i = taxi.getTurnos().size()-1;
        Turno t1 = this.taxi.getTurnos().get(i);
        Trabajo tr1 = new Trabajo (nTr);
        List<Cliente> clientes = new ArrayList<>();
        Cliente c1 = persistencia.leerClientesXML(1000);
        try{
            c1.setTipoDocumento(TipoDocumento.CEDULA);
            if (t1.buscarTrabajo(nTr)!=null) {
                t1.getTrabajos().add(tr1);
                return true;
            }else{
                throw new Excepciones("Ya existe el trabajo ");
            }
        } catch( NullPointerException n){
            System.out.println("Error " +n.toString());
        }
        
        return false;
     }
    public boolean agregarRecargo(int nT, int nTr, Recargo recargo){
           
        Turno turno = taxi.buscarTurno(nT);
        Trabajo trabajo= turno.buscarTrabajo(nTr);
            
        if(trabajo.getRecargos().contains(recargo)==false){
            trabajo.getRecargos().add(recargo);
            return true;
        }
        return false; 
    
    }
    
    public Recargo removerRecargo(int nT, int nTr, int nCon){
         
        Turno turno = taxi.buscarTurno(nT);
        Trabajo trabajo= turno.buscarTrabajo(nTr);
         for (Recargo recargo : trabajo.getRecargos()) {
             if(recargo.getConsecutivo()==nCon){
                trabajo.getRecargos().remove(recargo);
                return recargo;  
             }
        }
        return null;
    }
    
    public void finalizarTrabajo(Trabajo trabajo, LocalDateTime fechaFinal){
        trabajo.setFechaHoraFinal(fechaFinal);
        long minutes = ChronoUnit.MINUTES.between(trabajo.getFechaHoraInicio(), fechaFinal);
    }
}
