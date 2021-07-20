
package PersonPack;

import java.util.ArrayList;
/**
 *
 * @author teis_
 */
public class clsPosition extends clsEmployee {
    ArrayList<String> position = new ArrayList<>();
    ArrayList<String> hierarchical = new ArrayList<>();
    //String[] array = new String[7];
    //String[] nivel = new String[7];
    
    public ArrayList MostrarListaCargos(){
        this.position.add("Secretario");
        this.position.add("Ingeniero");
        this.position.add("Recepcionista");
        this.position.add("Contador");
        this.position.add("Vendedor");
        this.position.add("Representante de servicio al cliente");
        this.position.add("Portero");
        this.position.add("Entrenador");
        this.position.add("Asistente personal");
        this.position.add("Auiliar de servicios");
        this.position.add("Almacenero");
        this.position.add("Chief marketing officer");
        return this.position;
    }
    
    public ArrayList MostrarListaJerarquia(){
        this.hierarchical.add("Directivo");
        this.hierarchical.add("Ejecutivo");
        this.hierarchical.add("Asesor");
        this.hierarchical.add("Auxiliar de apoyo");
        this.hierarchical.add("Operativo");
        this.hierarchical.add("Coordinadores");
        this.hierarchical.add("Puestos operativos");
        this.hierarchical.add("Directores de departamentos");
        this.hierarchical.add("Gerentes y jefes");
        this.hierarchical.add("Supervisores");
        return this.hierarchical;
    }
    
}
