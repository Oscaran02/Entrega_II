/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Enumeration.TipoDocumento;

/**
 *
 * @author Jhonnier
 */
public class Cliente {
    private int documento;
    private String nombre;
    private double saldoPrepago;
    private TipoDocumento tipoDocumento;

    public Cliente(int documento, String nombre, double saldoPrepago) {
        this.documento = documento;
        this.nombre = nombre;
        this.saldoPrepago = saldoPrepago;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldoPrepago() {
        return saldoPrepago;
    }

    public void setSaldoPrepago(double saldoPrepago) {
        this.saldoPrepago = saldoPrepago;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    
    
}
