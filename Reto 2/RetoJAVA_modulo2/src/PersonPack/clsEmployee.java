
package PersonPack;

import java.util.ArrayList;
import java.util.Scanner;
import CompanyPack.clsCompany;

/**
 *
 * @author teis_
 */
public class clsEmployee extends clsPerson{
        private int salario;
        private String cargo;
        private String jerarquia;
        private static Scanner data_employee = new Scanner(System.in);
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

    public clsEmployee() {
    }

    public clsEmployee(String nombre, String apellido, int nro_doc, String email, int salario, String cargo, String jerarquia) {
        super(nombre, apellido, nro_doc, email);
        this.salario = salario;
        this.cargo = cargo;
        this.jerarquia = jerarquia;
    }

    
    public clsEmployee(String nombre, String apellido, int nro_doc, String email, int salario) {
        super(nombre, apellido, nro_doc, email);
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }
    /**
     * @return the salario
     */
    public int getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public void CRUD_empleado(){
        clsPosition posyhie = new clsPosition();
        clsAdminEmployee adm_emp = new clsAdminEmployee();
        ArrayList position = posyhie.MostrarListaCargos();
        ArrayList hierarchical = posyhie.MostrarListaJerarquia();
        ArrayList<clsEmployee> list_empleados = new ArrayList<>();
        ArrayList<clsAdminEmployee> adminEmployee = new ArrayList<>();
        boolean fin_empleado = false;
        
        while (!fin_empleado){
            System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ANSI_RESET);
            System.out.println(ANSI_BLUE + "SELECCIONA UNA OPCIÓN DEL MENÚ" + ANSI_RESET);
            System.out.println("    1. Crear empleado");
            System.out.println("    2. Consultar empleado");
            System.out.println("    3. Editar empleado");
            System.out.println("    4. Eliminar empleado");
            System.out.println(ANSI_RED + "    5. SALIR" + ANSI_RESET);
            System.out.print(ANSI_BLUE + "Ingresa tu respuesta\n  R/: " + ANSI_RESET);
            int option = Integer.parseInt(data_employee.nextLine());
            
            switch (option) {
                case 1:
                    System.out.print(ANSI_BLUE+"Cuántos empleados deseas añadir?\n  R/: "+ANSI_RESET);
                    int nro_empresa = Integer.parseInt(data_employee.nextLine());
                    System.out.println("\n" + ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ANSI_RESET);
                    System.out.println(ANSI_BLUE + "REGISTRO DE EMPLEADOS" + ANSI_RESET);
                    for (int i = 1; i <= nro_empresa; i++) {
                        System.out.println("\n" + ANSI_CYAN + "      Empleado " + i + ANSI_RESET);
                        System.out.println(ANSI_BLUE + ">Nombres:" + ANSI_RESET);
                        String name = data_employee.nextLine();

                        System.out.println(ANSI_BLUE + ">Apellidos:" + ANSI_RESET);
                        String surname = data_employee.nextLine();

                        System.out.println(ANSI_BLUE + ">Documento:" + ANSI_RESET);
                        int doc = Integer.parseInt(data_employee.nextLine());
                        
                        System.out.println(ANSI_BLUE + ">Correo Electrónico:" + ANSI_RESET);
                        String email = data_employee.nextLine();
                        
                        System.out.println(ANSI_BLUE + ">Salario:" + ANSI_RESET);
                        int salary = Integer.parseInt(data_employee.nextLine());
                        
                        System.out.println(ANSI_BLUE+">Seleccione el cargo y nivel jerarquico del empleado:"+ANSI_RESET);
                        System.out.println(ANSI_BLUE+"    Lista de cargos"+ANSI_RESET);
                        for (int j = 0; j < position.size(); j++) {
                            System.out.println(">" + j + " " + position.get(j));
                        }
                        System.out.println(ANSI_BLUE+"    Niveles jerarquicos"+ANSI_RESET);
                        for (int h = 0; h < hierarchical.size(); h++) {
                            System.out.println(">"+h+" Nivel " + hierarchical.get(h));
                        }
                        System.out.print(ANSI_BLUE+"Selecciona el cargo\n  R/: "+ANSI_RESET);
                        int pos = Integer.parseInt(data_employee.nextLine());
                        System.out.print(ANSI_BLUE+"Selecciona el nivel jerarquico\n  R/: "+ANSI_RESET);
                        int jerar = Integer.parseInt(data_employee.nextLine());
                        for (int c = 0; c < position.size(); c++) {
                            for (int h = 0; h < hierarchical.size(); h++) {
                                if (pos == c && jerar == h){
                                    String cargo1 = (String) position.get(pos);
                                    String jer = (String) hierarchical.get(jerar);
                                    
                                    System.out.print(ANSI_BLUE + "El empleado tiene cargo administrativo? (Si/No):\n  R/: ");
                        String option1 = data_employee.nextLine();
                        
                        if(option1.toLowerCase().equals("si") || option1.toLowerCase().equals("sí")){
                            System.out.println(ANSI_BLUE+">Categoria:"+ANSI_RESET);
                            String category = data_employee.nextLine();
                            
                            System.out.println(ANSI_BLUE+"Nro. de Subordinados:"+ANSI_RESET);
                            int num_sub = Integer.parseInt(data_employee.nextLine());
                            
                            clsAdminEmployee admin_employee = new clsAdminEmployee(name, surname, doc, email, salary, cargo1, jer, category, num_sub);
                            list_empleados.add(admin_employee);
                        }else{
                            clsAdminEmployee admin_employee = new clsAdminEmployee(name, surname, doc, email, salary, cargo1, jer, "Ninguno", 00);
                            list_empleados.add(admin_employee);
                        }
                                    //clsEmployee empleado = new clsEmployee(name, surname, doc, email, salary, cargo1, jer);
                                    //list_empleados.add(empleado);
                                }
                            }
                        }
                        
                        
                        //clsEmployee empleado = new clsEmployee(name, surname, doc, email, salary);
                        //list_empleados.add(empleado);
                        
                        System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~~~~~~~EMPLEADO CREADO CON ÉXITO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                    }
                    break;
                case 2:
                    System.out.println(ANSI_BLUE + "LISTA DE EMPLEADOS "+ ANSI_RESET);
                    for (int i = 0; i < list_empleados.size(); i++) {
                        System.out.println("\n" + ANSI_CYAN + "       Empleado " + (i + 1) + ANSI_RESET);
                        clsEmployee empleado = list_empleados.get(i);
                        clsAdminEmployee amsemp = (clsAdminEmployee) list_empleados.get(i);
                        System.out.println(ANSI_BLUE + ">Nombres: " + ANSI_RESET + empleado.getNombre());
                        System.out.println(ANSI_BLUE + ">Apellidos: " + ANSI_RESET + empleado.getApellido());
                        System.out.println(ANSI_BLUE + ">Documento: " + ANSI_RESET + empleado.getNro_doc());
                        System.out.println(ANSI_BLUE + ">Correo Electrónico: " + ANSI_RESET + empleado.getEmail());
                        System.out.println(ANSI_BLUE + ">Salario: " + ANSI_RESET + empleado.getSalario());
                        System.out.println(ANSI_BLUE + ">Categoria: " + ANSI_RESET + amsemp.getCategoria());
                        System.out.println(ANSI_BLUE + ">Nro. de Subordinados: " + ANSI_RESET + amsemp.getNro_subordinados());
                        System.out.println(ANSI_BLUE + ">Cargo: " + ANSI_RESET + empleado.getCargo());
                        System.out.println(ANSI_BLUE + ">Nivel jerarquico: " + ANSI_RESET + empleado.getJerarquia());
                    }
                    break;
                case 3:
                    System.out.println(ANSI_BLUE + "EDITAR INFORMACIÓN DEL EMPLEADO" + ANSI_RESET);
                    System.out.print("Ingresa el indice del empleado a Editar\n  R/: ");
                    int index = Integer.parseInt(data_employee.nextLine());
                    if (index >= 0 && index <= list_empleados.size()) {
                        clsEmployee empleado = list_empleados.get(index);
                        clsAdminEmployee amsemp = (clsAdminEmployee) list_empleados.get(index);
                        System.out.println(ANSI_CYAN + "~~~~~~~~~~~~~~~~~~~~~~~INFORMACIÓN ACTUAL DEL EMPLEADO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                        System.out.println(ANSI_BLUE + "     >Nombres: " + ANSI_RESET + empleado.getNombre());
                        System.out.println(ANSI_BLUE + "     >Apellidos: " + ANSI_RESET + empleado.getApellido());
                        System.out.println(ANSI_BLUE + "     >Documento: " + ANSI_RESET + empleado.getNro_doc());
                        System.out.println(ANSI_BLUE + "     >Correo Electrónico: " + ANSI_RESET + empleado.getEmail());
                        System.out.println(ANSI_BLUE + "     >Salario: " + ANSI_RESET + empleado.getSalario());
                        System.out.println(ANSI_BLUE + "     >Categoria: " + ANSI_RESET + amsemp.getCategoria());
                        System.out.println(ANSI_BLUE + "     >Nro. de Subordinados: " + ANSI_RESET + amsemp.getNro_subordinados());
                        System.out.println(ANSI_BLUE + "     >Cargo: " + ANSI_RESET + empleado.getCargo());
                        System.out.println(ANSI_BLUE + "     >Nivel jerarquico: " + ANSI_RESET + empleado.getJerarquia());
                        System.out.println("Que campo deseas editar?\n      1. Nombres\n      2. Apellidos\n      3. Documento\n      4. Correo Electrónico\n"
                                           + "      5. Salario\n      6. Categoria\n      7. Nro. de Subordinados\n      8. Cargo\n      9. Nivel jerarquico");
                        System.out.print(ANSI_CYAN + "Ingresa tu respuesta\n  R/: " + ANSI_RESET);
                        int edit_field = Integer.parseInt(data_employee.nextLine());
                        switch (edit_field) {
                            case 1:
                                System.out.print(ANSI_CYAN + "Nombres nuevos\n  R/: " + ANSI_RESET);
                                String names = data_employee.nextLine();
                                empleado.setNombre(names);
                                break;
                            case 2:
                                System.out.print(ANSI_CYAN + "Apellidos nuevos\n  R/: " + ANSI_RESET);
                                String surnames = data_employee.nextLine();
                                empleado.setApellido(surnames);
                                break;
                            case 3:
                                System.out.print(ANSI_CYAN + "Documento nuevo\n  R/: " + ANSI_RESET);
                                int docu = Integer.parseInt(data_employee.nextLine());
                                empleado.setNro_doc(docu);
                                break;
                            case 4:
                                System.out.print(ANSI_CYAN + "Correo nuevo\n  R/: " + ANSI_RESET);
                                String email = data_employee.nextLine();
                                empleado.setEmail(email);
                                break;
                            case 5:
                                System.out.print(ANSI_CYAN + "Salario nuevo\n  R/: " + ANSI_RESET);
                                int sal = Integer.parseInt(data_employee.nextLine());
                                empleado.setSalario(sal);
                                break;
                            case 6:
                                System.out.print(ANSI_CYAN + "Categoria nueva\n  R/: " + ANSI_RESET);
                                String cate = data_employee.nextLine();
                                amsemp.setCategoria(cate);
                                break;
                            case 7:
                                System.out.print(ANSI_CYAN + "Nuevo nro. de subordinados\n  R/: " + ANSI_RESET);
                                int new_sub = Integer.parseInt(data_employee.nextLine());
                                amsemp.setNro_subordinados(new_sub);
                                break;
                            case 8:
                                System.out.println(ANSI_CYAN + "    Selecciona Cargo nuevo" + ANSI_RESET);
                                for (int c = 0; c < position.size(); c++) {
                                    System.out.println(">" + c + " " + position.get(c));
                                }
                                System.out.print(ANSI_CYAN+"  R/: "+ANSI_RESET);
                                int new_cargo = Integer.parseInt(data_employee.nextLine());
                                for (int n = 0; n < position.size(); n++) {
                                    if (new_cargo == n){
                                        String newCargo = (String) position.get(new_cargo);
                                        empleado.setCargo(newCargo);
                                    }
                                }
                                break;
                            case 9:
                                System.out.println(ANSI_CYAN + "    Selecciona Nivel de jerarquia nuevo" + ANSI_RESET);
                                for (int j = 0; j < hierarchical.size(); j++) {
                                    System.out.println(">"+j+" Nivel " + hierarchical.get(j));
                                }
                                System.out.print(ANSI_CYAN+"  R/: "+ANSI_RESET);
                                int new_jerar = Integer.parseInt(data_employee.nextLine());
                                for (int m = 0; m < hierarchical.size(); m++) {
                                    if (new_jerar == m){
                                        String newJerarquia = (String) hierarchical.get(new_jerar);
                                        empleado.setJerarquia(newJerarquia);
                                    }
                                }
                                break;
                                
                        }
                        System.out.println(ANSI_GREEN+"~~~~~~~~~~~~~~~~~LA INFORMACIÓN DEL EMPLEADO SE HA ACTUALIZADO EXITOSAMENTE~~~~~~~~~~~~~~~~~"+ANSI_RESET);
                    }

                    break;
                case 4:
                    System.out.println(ANSI_RED + "ELIMINAR EMPLEADO" + ANSI_RESET);
                    System.out.print("Ingresa el indice deL empleado a Eliminar\n  R/: ");
                    int empl_remove = Integer.parseInt(data_employee.nextLine());
                    if (empl_remove >= 0 && empl_remove <= list_empleados.size()) {
                        clsEmployee empleado = list_empleados.get(empl_remove);
                        clsAdminEmployee amsemp = (clsAdminEmployee) list_empleados.get(empl_remove);
                        System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~INFORMACIÓN DEL EMPLEADO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                        System.out.println(ANSI_CYAN + "     >Documento: " + ANSI_RESET + empleado.getNro_doc());
                        System.out.println(ANSI_CYAN + "     >Nombre: " + ANSI_RESET + empleado.getNombre() +" "+ empleado.getApellido());
                        System.out.print("Estás seguro que deseas eliminar a " + ANSI_PURPLE + empleado.getNombre() +" "+ empleado.getApellido()+ ANSI_RESET+"? (Si, No)\n"+ANSI_BLUE+"  R/: "+ANSI_RESET);
                        String remove = data_employee.nextLine();
                        if (remove.toUpperCase().equals("SI") || remove.toUpperCase().equals("SÍ")) {
                            list_empleados.remove(empl_remove);
                        } else {
                            System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~PROCESO CANCELADO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                        }
                        System.out.println(ANSI_BLUE + "lISTA DE EMPLEADOS ACTUALIZADA" + ANSI_RESET);
                        for (int i = 0; i < list_empleados.size(); i++) {
                            System.out.println("\n" + ANSI_CYAN + "       Empleado " + (i + 1) + ANSI_RESET);
                            clsEmployee empleado_nuevo = list_empleados.get(i);
                            clsAdminEmployee amsemp_nuevo = (clsAdminEmployee) list_empleados.get(i);
                            System.out.println(ANSI_BLUE + ">Nombres: " + ANSI_RESET + empleado_nuevo.getNombre());
                            System.out.println(ANSI_BLUE + ">Apellidos: " + ANSI_RESET + empleado_nuevo.getApellido());
                            System.out.println(ANSI_BLUE + ">Documento: " + ANSI_RESET + empleado_nuevo.getNro_doc());
                            System.out.println(ANSI_BLUE + ">Correo Electrónico: " + ANSI_RESET + empleado_nuevo.getEmail());
                            System.out.println(ANSI_BLUE + ">Salario: " + ANSI_RESET + empleado_nuevo.getSalario());
                            System.out.println(ANSI_BLUE + ">Categoria: " + ANSI_RESET + amsemp_nuevo.getCategoria());
                            System.out.println(ANSI_BLUE + ">Nro. de Subordinados: " + ANSI_RESET + amsemp_nuevo.getNro_subordinados());
                            System.out.println(ANSI_BLUE + ">Cargo: " + ANSI_RESET + empleado_nuevo.getCargo());
                            System.out.println(ANSI_BLUE + ">Nivel jerarquico: " + ANSI_RESET + empleado_nuevo.getJerarquia());
                        }
                    }

                    break;
                case 5:
                    fin_empleado=true;
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~SALIENDO DEL MENU EMPLEADO~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET);
                    break;
                default:
                    System.out.println(ANSI_RED + "~~~~~~~~~~~~~~~~~~~~~~~~~OPCIÓN INVÁLIDA!~~~~~~~~~~~~~~~~~~~~~~~~~"+ ANSI_RESET);
            }
        }
        
        
    }

    
        
}
