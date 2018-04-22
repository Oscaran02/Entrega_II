/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Jhonnier
 */
public abstract class Efectivo extends Pago{

    private int demoninacion;
    
    


    public int getDemoninacion() {
        return demoninacion;
    }

    public void setDemoninacion(int demoninacion) {
        this.demoninacion = demoninacion;
    }

    
}
