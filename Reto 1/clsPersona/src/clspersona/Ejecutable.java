/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clspersona;


/**
 *
 * @author teis_
 */
public class Ejecutable {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaClass inst_person = new PersonaClass("Andrey", "C.C", 1054, 22, "30/06/1999", "Hombre", "Cra 8a", 30543);
        System.out.println(inst_person.consl_info_person());
        inst_person.consultar_informacion_persona();
        
                
    }
    
}
