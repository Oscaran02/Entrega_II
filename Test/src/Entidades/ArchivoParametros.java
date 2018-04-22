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
public class ArchivoParametros {
    @XmlElement (name = "parametro")
    private List<Parametro> parametro = new ArrayList<>();
    
    public ArchivoParametros (List<Parametro> parametro){
        this.parametro = parametro;
    }

    public List<Parametro> getParametro() {
        return parametro;
    }
    
    public ArchivoParametros(){
    }
}

