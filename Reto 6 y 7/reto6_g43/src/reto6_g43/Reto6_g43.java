
package reto6_g43;

import modelo_pkg.*;
import vista_pkg.*;
//import Controlador.*;

/**
 *
 * @author teis_
 */
public class Reto6_g43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conexion inst_connect = new conexion();
        Data_modelBD model = new Data_modelBD();
        Frame_Hospital inst_frame = new Frame_Hospital();
        inst_connect.getConnection();
        model.getOwners(0);
        model.getHospital(0);
        inst_frame.setVisible(true);
        

    }
    
}
