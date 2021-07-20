
package PersonPack;

//import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author teis_
 */
public class clsPerson {
    private String nombre;
    private String apellido;
    private int nro_doc;
    private String email;
    
    private static Scanner data_person = new Scanner(System.in);
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

    public clsPerson() {
    }

    public clsPerson(String nombre, String apellido, int nro_doc, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nro_doc = nro_doc;
        this.email = email;
    }
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNro_doc() {
        return nro_doc;
    }

    public String getEmail() {
        return email;
    }
    
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @param nro_doc the nro_doc to set
     */
    public void setNro_doc(int nro_doc) {
        this.nro_doc = nro_doc;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void CRUD_persona(){
        clsEmployee empleado = new clsEmployee();
        clsClient cliente = new clsClient();
        boolean fin_persona = false;
        
        while(!fin_persona){
            System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ANSI_RESET);
            System.out.println(ANSI_BLUE + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println("Deseas registrar:\n      1. Empleados\n      2. Clientes\n"+ANSI_RED+"      3. Salir"+ANSI_RESET);
            System.out.print(ANSI_BLUE + "Ingresa tu respuesta\n  R/: " + ANSI_RESET);
            int opcion = Integer.parseInt(data_person.nextLine());
            
            switch(opcion){
                case 1:
                    empleado.CRUD_empleado();
                    break;
                case 2:
                    cliente.CRUD_cliente();
                    break;
                case 3:
                    fin_persona = true;
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~SALIENDO DEL MENU PERSONA~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~~~OPCIÓN INVÁLIDA!~~~~~~~~~~~~~~~~~~~~~~~~~"+ ANSI_RESET);
            }
        }
        
    }
    
    
}
