
package retojava_modulo2;

import PersonPack.*;
import CompanyPack.clsCompany;
//import java.util.ArrayList;
import java.util.Scanner;
//import javax.swing.JOptionPane;

/**
 *
 * @author teis_
 */
public class Main {
    private static Scanner data_main = new Scanner(System.in);
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    private static final String ANSI_RESET = "\u001B[0m";
    private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    
    public static void main(String[] args) {
                
        clsCompany employee = new clsCompany();
        clsPerson person = new clsPerson();
        boolean fin_programa = false;
        
        while(!fin_programa){
            System.out.println(ANSI_PURPLE+"******************************************************************"+ ANSI_RESET);
            System.out.println(ANSI_PURPLE +"                         MISIÓN TIC 2022                           "+ ANSI_RESET);
            System.out.println(ANSI_PURPLE+"******************************************************************"+ ANSI_RESET);
            System.out.println("Deseas trabajar con:\n      1. Empresa\n      2. Persona\n"+ANSI_RED+"      3. Salir"+ANSI_RESET);
            System.out.print(ANSI_BLUE + "Ingresa tu respuesta\n  R/: " + ANSI_RESET);
            int opcion = Integer.parseInt(data_main.nextLine());
            
            switch(opcion){
                case 1:
                    employee.CRUD_empresa();
                    break;
                case 2:
                    person.CRUD_persona();
                    break;
                case 3:
                    fin_programa = true;
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~FIN DEL PROGRAMA~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~~~OPCIÓN INVÁLIDA!~~~~~~~~~~~~~~~~~~~~~~~~~"+ ANSI_RESET);
            }
        }
        
        
    }
    
}
