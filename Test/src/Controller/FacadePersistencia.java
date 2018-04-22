/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entidades.ArchivoClientes;
import Entidades.ArchivoParametros;
import Entidades.Cliente;
import Entidades.Equipaje;
import Entidades.Parametro;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXB;

/**
 *
 * @author Jhonnier
 */
public class FacadePersistencia {
    
    List<Parametro> parametros = new ArrayList<>();
    private static final String FILE_NAME_CLIENTES = "archivoClientes.xml";
    private static final String FILE_NAME_PARAMETROS = "archivoParametros.xml";
    Collection<Equipaje> tarifasEquipaje = new ArrayList<>();
    

    public FacadePersistencia(){
        
    }
    public Cliente leerClientesXML(int documento){
        List<Cliente> clientes= new ArrayList<>();
        try(BufferedReader input = Files.newBufferedReader(Paths.get(FILE_NAME_CLIENTES))){
            ArchivoClientes cliente = JAXB.unmarshal(input, ArchivoClientes.class);
            clientes = cliente.getCliente();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        for (Cliente cliente : clientes) {
            if(cliente.getDocumento()==documento){
                return cliente;
            }
        }
        return null;
    }
    public List<Parametro> leerParametrosXML() {
        try(BufferedReader input = Files.newBufferedReader(Paths.get(FILE_NAME_PARAMETROS))){
           ArchivoParametros parametro = JAXB.unmarshal(input, ArchivoParametros.class);
           parametros = parametro.getParametro();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        if (parametros!=null) {
            return parametros;
        }
        return null;
    }

    


    public Collection<Equipaje> getTarifasEquipaje() {
        return tarifasEquipaje;
    }
    
}
