/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author JOXE Y LEITER
 */
public class Estrategia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Persona karen= new Persona();
        karen.setrol(new Comprador());
        karen.negociar();
    }
    
}
