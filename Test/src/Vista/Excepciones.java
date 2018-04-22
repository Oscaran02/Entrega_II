/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Jhonnier
 */
public class Excepciones extends Exception{

    public Excepciones() {
    }

    public Excepciones(String string) throws ArithmeticException{
        
        super(string);
    }

    public Excepciones(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public Excepciones(Throwable thrwbl) {
        super(thrwbl);
    }

    public Excepciones(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
