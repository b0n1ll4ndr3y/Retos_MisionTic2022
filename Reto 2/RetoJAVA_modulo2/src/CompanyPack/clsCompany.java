
package CompanyPack;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author teis_
 */
public class clsCompany {
    private int NIT;
    private String razon_social;
    private String direccion;
    //private String employee;
    
    private static Scanner data_company = new Scanner(System.in);
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

    public clsCompany() {
    }
    
    

    public clsCompany(int NIT, String razon_social, String direccion) {
        this.NIT = NIT;
        this.razon_social = razon_social;
        this.direccion = direccion;
    }
    
    /**
     * @return the NIT
     */
    public int getNIT() {
        return NIT;
    }

    /**
     * @param NIT the NIT to set
     */
    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    /**
     * @return the razon_social
     */
    public String getRazon_social() {
        return razon_social;
    }

    /**
     * @param razon_social the razon_social to set
     */
    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
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
    
    public void CRUD_empresa(){
        ArrayList<clsCompany> list_empresa = new ArrayList();
        boolean fin_programa = false;
        
        while (!fin_programa){
            System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ANSI_RESET);
            System.out.println(ANSI_BLUE + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println("    1. Crear empresa");
            System.out.println("    2. Consultar empresa");
            System.out.println("    3. Editar empresa");
            System.out.println("    4. Eliminar empresa");
            System.out.println(ANSI_RED + "    5. SALIR" + ANSI_RESET);
            System.out.print(ANSI_BLUE + "Ingresa tu respuesta\n  R/: " + ANSI_RESET);
            int option = Integer.parseInt(data_company.nextLine());
            
            switch (option) {
                case 1:
                    System.out.print(ANSI_BLUE+"Cuántas empresas deseas añadir?\n  R/: "+ANSI_RESET);
                    int nro_empresa = Integer.parseInt(data_company.nextLine());
                    System.out.println("\n" + ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ANSI_RESET);
                    System.out.println(ANSI_BLUE + "REGISTRO DE EMPRESA" + ANSI_RESET);
                    for (int i = 1; i <= nro_empresa; i++) {
                        System.out.println("\n" + ANSI_CYAN + "      Empresa " + i + ANSI_RESET);
                        System.out.println(ANSI_BLUE + ">NIT:" + ANSI_RESET);
                        int nit = Integer.parseInt(data_company.nextLine());

                        System.out.println(ANSI_BLUE + ">Razón Social:" + ANSI_RESET);
                        String razon = data_company.nextLine();

                        System.out.println(ANSI_BLUE + ">Dirección:" + ANSI_RESET);
                        String direc = data_company.nextLine();

                        clsCompany empresa = new clsCompany(nit, razon, direc);
                        list_empresa.add(empresa);
                        System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~EMPRESA CREADA CON ÉXITO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_BLUE + "LISTA DE EMPRESAS" + ANSI_RESET);
                    for (int i = 0; i < list_empresa.size(); i++) {
                        System.out.println("\n" + ANSI_CYAN + "       Empresa " + (i + 1) + ANSI_RESET);
                        clsCompany empresa = list_empresa.get(i);
                        System.out.println(ANSI_BLUE + ">NIT: " + ANSI_RESET + empresa.getNIT());
                        System.out.println(ANSI_BLUE + ">Razón Social: " + ANSI_RESET + empresa.getRazon_social());
                        System.out.println(ANSI_BLUE + ">Dirección: " + ANSI_RESET + empresa.getDireccion());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "EDITAR INFORMACIÓN DE LA EMPRESA" + ANSI_RESET);
                    System.out.println("Ingresa el indice de la empresa a Editar");
                    int index = Integer.parseInt(data_company.nextLine());
                    if (index >= 0 && index <= list_empresa.size()) {
                        clsCompany empresa = list_empresa.get(index);
                        System.out.println(ANSI_CYAN + "~~~~~~~~~~~~~~~~~~~~~~~INFORMACIÓN ACTUAL DE LA EMPRESA~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     >NIT: " + ANSI_RESET + empresa.getNIT());
                        System.out.println(ANSI_BLUE + "     >Razón Social: " + ANSI_RESET + empresa.getRazon_social());
                        System.out.println(ANSI_BLUE + "     >Dirección: " + ANSI_RESET + empresa.getDireccion());
                        System.out.println("Que campo deseas editar?\n      1. NIT\n      2. Razón Social\n      3. Dirección");
                        System.out.print(ANSI_BLUE + "Ingresa tu respuesta\n  R/: " + ANSI_RESET);
                        int edit_field = Integer.parseInt(data_company.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.print(ANSI_CYAN + "NIT nuevo\n  R/: " + ANSI_RESET);
                                int nit = Integer.parseInt(data_company.nextLine());
                                empresa.setNIT(nit);
                                break;
                            case 2:
                                System.out.print(ANSI_CYAN + "Razón Social nueva\n  R/: " + ANSI_RESET);
                                String name = data_company.nextLine();
                                empresa.setRazon_social(name);
                                break;
                            case 3:
                                System.out.print(ANSI_CYAN + "Dirección nueva\n  R/: " + ANSI_RESET);
                                String direc = data_company.nextLine();
                                empresa.setDireccion(direc);
                                break;
                        }
                        System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~LA INFORMACIÓN DE LA EMPRESA SE HA ACTUALIZADO EXITOSAMENTE~~~~~~~~~~~~~~~~~"+ANSI_RESET);
                    }

                    break;
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR EMPRESA" + ANSI_RESET);
                    System.out.print("Ingresa el indice de la empresa a Eliminar\n  R/: ");
                    int emp_remove = Integer.parseInt(data_company.nextLine());
                    if (emp_remove >= 0 && emp_remove <= list_empresa.size()) {
                        clsCompany empresa = list_empresa.get(emp_remove);
                        System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~INFORMACIÓN DE LA EMPRESA~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     >NIT: " + ANSI_RESET + empresa.getNIT());
                        System.out.println(ANSI_BLUE + "     >Razón Social: " + ANSI_RESET + empresa.getRazon_social());
                        System.out.print("Estás seguro que deseas eliminar a " + ANSI_BLUE + empresa.getRazon_social()+ "? (Si, No)\n  R/: " + ANSI_RESET);
                        String remove = data_company.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            list_empresa.remove(emp_remove);
                        } else {
                            System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~PROCESO CANCELADO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                        }
                        System.out.println(ANSI_BLUE + "lISTA DE EMPRESAS ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < list_empresa.size(); i++) {
                            System.out.println("\n" + ANSI_CYAN + "       Empresa " + (i + 1) + ANSI_RESET);
                            clsCompany empresa_nueva = list_empresa.get(i);
                            System.out.println(ANSI_BLUE + ">NIT: " + ANSI_RESET + empresa_nueva.getNIT());
                            System.out.println(ANSI_BLUE + ">Razón Social: " + ANSI_RESET + empresa_nueva.getRazon_social());
                            System.out.println(ANSI_BLUE + ">Dirección: " + ANSI_RESET + empresa_nueva.getDireccion());
                        }
                    }

                    break;
                case 5:
                    fin_programa=true;
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~SALIENDO DEL MENU EMPRESA~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~~~OPCIÓN INVÁLIDA!~~~~~~~~~~~~~~~~~~~~~~~~~"+ ANSI_RESET);
            }
        }
    }
}
