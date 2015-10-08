/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOXE Y LEITER
 */
public class Persona {
    private Rol rol;
    public void setrol(Rol r){
    this.rol=r;
    
    }
    
    public void negociar(){
    
    
    rol.negociar();
    }

}
