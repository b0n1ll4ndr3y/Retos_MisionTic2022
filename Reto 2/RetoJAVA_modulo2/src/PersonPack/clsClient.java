
package PersonPack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author teis_
 */
public class clsClient extends clsPerson {
    private String direccion;
    private int telefono;
    
    private static Scanner data_client = new Scanner(System.in);
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

    public clsClient() {
    }

    public clsClient(String nombre, String apellido, int nro_doc, String email, String direccion, int telefono) {
        super(nombre, apellido, nro_doc, email);
        this.direccion = direccion;
        this.telefono = telefono;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    public void CRUD_cliente(){
        ArrayList<clsClient> list_clientes = new ArrayList();
        boolean fin_cliente= false;
        
        while (!fin_cliente){
            System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ANSI_RESET);
            System.out.println(ANSI_BLUE + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println("    1. Crear cliente");
            System.out.println("    2. Consultar cliente");
            System.out.println("    3. Editar cliente");
            System.out.println("    4. Eliminar cliente");
            System.out.println(ANSI_RED + "    5. SALIR" + ANSI_RESET);
            System.out.print(ANSI_BLUE + "Ingresa tu respuesta\n  R/: " + ANSI_RESET);
            int option = Integer.parseInt(data_client.nextLine());
            
            switch (option) {
                case 1:
                    System.out.print(ANSI_BLUE+"Cuántos clientes deseas añadir?\n  R/: "+ANSI_RESET);
                    int nro_empresa = Integer.parseInt(data_client.nextLine());
                    System.out.println("\n" + ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ANSI_RESET);
                    System.out.println(ANSI_BLUE + "REGISTRO DE CLIENTES" + ANSI_RESET);
                    for (int i = 1; i <= nro_empresa; i++) {
                        System.out.println("\n" + ANSI_CYAN + "      Cliente " + i + ANSI_RESET);
                        System.out.println(ANSI_BLUE + ">Nombres:" + ANSI_RESET);
                        String name = data_client.nextLine();

                        System.out.println(ANSI_BLUE + ">Apellidos:" + ANSI_RESET);
                        String surname = data_client.nextLine();

                        System.out.println(ANSI_BLUE + ">Documento:" + ANSI_RESET);
                        int doc = Integer.parseInt(data_client.nextLine());
                        
                        System.out.println(ANSI_BLUE + ">Correo Electrónico:" + ANSI_RESET);
                        String email = data_client.nextLine();
                        
                        System.out.println(ANSI_BLUE+">Dirección:"+ANSI_RESET);
                        String address = data_client.nextLine();
                                
                        System.out.println(ANSI_BLUE + ">Telefono:" + ANSI_RESET);
                        int phone = Integer.parseInt(data_client.nextLine());
                        
                        clsClient cliente = new clsClient(name, surname, doc, email, address, phone);
                        list_clientes.add(cliente);
                        System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~CLIENTE CREADO CON ÉXITO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_BLUE + "LISTA DE CLIENTES "+ ANSI_RESET);
                    for (int i = 0; i < list_clientes.size(); i++) {
                        System.out.println("\n" + ANSI_CYAN + "       Cliente " + (i + 1) + ANSI_RESET);
                        clsClient cliente = list_clientes.get(i);
                        System.out.println(ANSI_BLUE+">Nombres: "+ANSI_RESET + cliente.getNombre());
                        System.out.println(ANSI_BLUE+">Apellidos: "+ANSI_RESET + cliente.getApellido());
                        System.out.println(ANSI_BLUE+">Documento: "+ANSI_RESET + cliente.getNro_doc());
                        System.out.println(ANSI_BLUE+">Correo Electrónico: "+ANSI_RESET + cliente.getEmail());
                        System.out.println(ANSI_BLUE+">Dirección: "+ANSI_RESET + cliente.getDireccion());
                        System.out.println(ANSI_BLUE+">Telefono: "+ANSI_RESET + cliente.getTelefono());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "EDITAR INFORMACIÓN DEL CLIENTE" + ANSI_RESET);
                    System.out.print("Ingresa el indice del cliente a Editar\n  R/: ");
                    int index = Integer.parseInt(data_client.nextLine());
                    if (index >= 0 && index <= list_clientes.size()) {
                        clsClient client = list_clientes.get(index);
                        System.out.println(ANSI_CYAN + "~~~~~~~~~~~~~~~~~~~~~~~INFORMACIÓN ACTUAL DEL EMPLEADO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     >Nombres: " + ANSI_RESET + client.getNombre());
                        System.out.println(ANSI_BLUE + "     >Apellidos: " + ANSI_RESET + client.getApellido());
                        System.out.println(ANSI_BLUE + "     >Documento: " + ANSI_RESET + client.getNro_doc());
                        System.out.println(ANSI_BLUE + "     >Correo Electrónico: " + ANSI_RESET + client.getEmail());
                        System.out.println(ANSI_BLUE + "     >Dirección: " + ANSI_RESET + client.getDireccion());
                        System.out.println(ANSI_BLUE + "     >Telefono: " + ANSI_RESET + client.getTelefono());
                        System.out.println("Que campo deseas editar?\n      1. Nombres\n      2. Apellidos\n      3. Documento\n      4. Correo Electrónico\n      5. Dirección\n      6. Telefono");
                        System.out.print(ANSI_CYAN + "Ingresa tu respuesta\n  R/: " + ANSI_RESET);
                        int edit_field = Integer.parseInt(data_client.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.print(ANSI_CYAN + "Nombres nuevos\n  R/: " + ANSI_RESET);
                                String names = data_client.nextLine();
                                client.setNombre(names);
                                break;
                            case 2:
                                System.out.print(ANSI_CYAN + "Apellidos nuevos\n  R/: " + ANSI_RESET);
                                String surnames = data_client.nextLine();
                                client.setApellido(surnames);
                                break;
                            case 3:
                                System.out.print(ANSI_CYAN + "Documento nuevo\n  R/: " + ANSI_RESET);
                                int docu = Integer.parseInt(data_client.nextLine());
                                client.setNro_doc(docu);
                                break;
                            case 4:
                                System.out.print(ANSI_CYAN + "Correo nuevo\n  R/: " + ANSI_RESET);
                                String email = data_client.nextLine();
                                client.setEmail(email);
                                break;
                            case 5:
                                System.out.print(ANSI_CYAN + "Dirección nueva\n  R/: " + ANSI_RESET);
                                String address = data_client.nextLine();
                                client.setDireccion(address);
                                break;
                            case 6:
                                System.out.print(ANSI_CYAN + "Telefono nuevo\n  R/: " + ANSI_RESET);
                                int phone = Integer.parseInt(data_client.nextLine());
                                client.setTelefono(phone);
                                break;
                                
                        }
                        System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~LA INFORMACIÓN DEL CLIENTE SE HA ACTUALIZADO EXITOSAMENTE~~~~~~~~~~~~~~~~~"+ANSI_RESET);
                    }

                    break;
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR CLIENTE" + ANSI_RESET);
                    System.out.print("Ingresa el indice deL cliente a Eliminar\n  R/: ");
                    int client_remove = Integer.parseInt(data_client.nextLine());
                    if (client_remove >= 0 && client_remove <= list_clientes.size()) {
                        clsClient cliente = list_clientes.get(client_remove);
                        System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~INFORMACIÓN DEL CLIENTE~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                        System.out.println(ANSI_CYAN + "     >Documento: " + ANSI_RESET + cliente.getNro_doc());
                        System.out.println(ANSI_CYAN + "     >Nombre: " + ANSI_RESET + cliente.getNombre() +" "+ cliente.getApellido());
                        System.out.print("Estás seguro que deseas eliminar a " + ANSI_BLUE + cliente.getNombre() +" "+ cliente.getApellido()+ "? (Si, No)\n  R/: " + ANSI_RESET);
                        String remove = data_client.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            list_clientes.remove(client_remove);
                        } else {
                            System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~PROCESO CANCELADO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                        }
                        System.out.println(ANSI_BLUE + "lISTA DE CLIENTES ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < list_clientes.size(); i++) {
                            System.out.println("\n" + ANSI_CYAN + "       Cliente " + (i + 1) + ANSI_RESET);
                            clsClient cliente_nuevo = list_clientes.get(i);
                            System.out.println(ANSI_BLUE + ">Nombres: " + ANSI_RESET + cliente_nuevo.getNombre());
                            System.out.println(ANSI_BLUE + ">Apellidos: " + ANSI_RESET + cliente_nuevo.getApellido());
                            System.out.println(ANSI_BLUE + ">Documento: " + ANSI_RESET + cliente_nuevo.getNro_doc());
                            System.out.println(ANSI_BLUE + ">Correo Electrónico: " + ANSI_RESET + cliente_nuevo.getEmail());
                            System.out.println(ANSI_BLUE + ">Dirección: " + ANSI_RESET + cliente_nuevo.getDireccion());
                            System.out.println(ANSI_BLUE + ">Telefono: " + ANSI_RESET + cliente_nuevo.getTelefono());
                        }
                    }

                    break;
                case 5:
                    fin_cliente=true;
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~SALIENDO DEL MENU CLIENTE~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~~~OPCIÓN INVÁLIDA!~~~~~~~~~~~~~~~~~~~~~~~~~"+ ANSI_RESET);
            }
        }
    }
    
    
}
