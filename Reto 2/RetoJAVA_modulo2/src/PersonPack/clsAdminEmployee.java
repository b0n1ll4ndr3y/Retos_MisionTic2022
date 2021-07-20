
package PersonPack;

/**
 *
 * @author teis_
 */
public class clsAdminEmployee extends clsEmployee{
    private String categoria;
    private int nro_subordinados;

    public clsAdminEmployee() {
    }

    public clsAdminEmployee(String nombre, String apellido, int nro_doc, String email, int salario, String cargo, String jerarquia, String categoria, int nro_subordinados) {
        super(nombre, apellido, nro_doc, email, salario, cargo, jerarquia);
        this.categoria = categoria;
        this.nro_subordinados = nro_subordinados;
    }
        
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNro_subordinados() {
        return nro_subordinados;
    }

    public void setNro_subordinados(int nro_subordinados) {
        this.nro_subordinados = nro_subordinados;
    }
    
    public void CRUD_AdminEmployee(){
        
    }
    
    
    
    
    
}
