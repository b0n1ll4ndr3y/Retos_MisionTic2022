/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo_pkg.*;
import vista_pkg.*;


/**
 *
 * @author teis_
 */
public class controlador implements ActionListener{

    private final Dialog_mascotas vista;
    
    public final void events() {
        vista.cb_idDuenoM.addActionListener(this);
        
    }

    public controlador(Dialog_mascotas vista) {
        this.vista = vista;
        getOwners();
        item Item = (item) vista.cb_idDuenoM.getSelectedItem();
        events();
    }
     public final void getOwners() {
        ArrayList<data_BD> list;
        Data_modelBD model = new Data_modelBD();
        list = model.getOwners(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idOwner = list.get(i).getIdOwner();
                String owner = list.get(i).getOwner();
                vista.cb_idDuenoM.addItem(new item(idOwner, owner));
                //vista.setIdowners(list.get(0).getIdOwner());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de dueños", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        /*Object evt = ae.getSource();
        if (evt.equals(vista.cb_idDuenoM)) {
            item Item = (item) vista.cb_idDuenoM.getSelectedItem();
            vista.setIdowners(Item.getId_Owner());
        }*/
    }

    
}
