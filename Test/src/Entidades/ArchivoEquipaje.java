/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.xml.bind.annotation.XmlElement;

/**
 *
 * @author ASUS
 */
public class ArchivoEquipaje {
    
    @XmlElement (name = "equipaje")
    private Equipaje equipaje = new Equipaje();

    public ArchivoEquipaje() {
        this.equipaje = new Equipaje();
    }

    public Equipaje getEquipaje() {
        return equipaje;
    }
    
   
}
