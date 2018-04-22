/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author Jhonnier
 */
public class ArchivoClientes {
    @XmlElement (name = "cliente")
    private List<Cliente> cliente = new ArrayList<>();
    
    public ArchivoClientes (List<Cliente> cliente){
        this.cliente = cliente;
    }

    public List<Cliente> getCliente() {
        return cliente;
    }
    
    public ArchivoClientes(){
        
    }
}
