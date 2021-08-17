
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo_pkg.*;
import vista_pkg.*;
/**
 *
 * @author teis_
 */
public class controlDoctor implements ActionListener{
   
    private final Dialog_doctor view;

    public final void events() {
        view.cb_hospital.addActionListener(this);
    }

    public controlDoctor(Dialog_doctor view) {
        this.view = view;
        getHospital();
        Item2 item = (Item2) view.cb_hospital.getSelectedItem();
        events();
    }

    public final void getHospital() {
        ArrayList<data_BD> lista;
        Data_modelBD modelo = new Data_modelBD();
        lista = modelo.getHospital(0);
        if (lista.size() > 0) {
            for (int j = 0; j < lista.size(); j++) {
                int idHospital = lista.get(j).getIdHospital();
                String hospital = lista.get(j).getHospital();
                view.cb_hospital.addItem(new Item2(idHospital, hospital));
                //view.setIdHospital(lista.get(0).getIdHospital());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de hospitales", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        /*Object evt = ae.getSource();
        if (evt.equals(view.cb_hospital)) {
            Item2 item = (Item2) view.cb_hospital.getSelectedItem();
            view.setIdHospital(item.getId_hospital());
        }*/
    }
}