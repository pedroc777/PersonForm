/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.sw.botones.modelo;

/**
 *
 * @author pedro
 */
public class AdministrarPersona {
    public boolean validarRFC(String rfc){
        if(rfc.length() == 10){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void registrarPersona(DatosPersona persona){
        System.out.println("Los datos de la persona son: ");
        System.out.println(persona.toString());
    }
}
