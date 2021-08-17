/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;


/**
 *
 * @author teis_
 */
public class Data_modelBD {
    public ArrayList<data_BD>getOwners(int idOwner) {
        conexion con = new conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        data_BD datosDB;
        ArrayList list = new ArrayList();
        try {
            String sql = "SELECT id, owner FROM `tb_pet_owners` WHERE 1";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa DataModelDB");
                while (rs.next()) {
                    datosDB = new data_BD();
                    datosDB.setIdOwner(rs.getInt("id"));
                    datosDB.setOwner(rs.getString("owner"));
                    list.add(datosDB);
                }
            } else {
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
    /*
    public ArrayList<data_BD>getOwners(int idOwner) {
        Pool conexion = new Pool();
        Connection connect = null;
        PreparedStatement pst;
        ResultSet rs;
        data_BD datosDB;
        ArrayList list = new ArrayList();
        try{
            connect = conexion.initilizeDataSource().getConnection();
            if(connect != null){
                String sql = "SELECT id, owner FROM tb_pet_owners WHERE 1";
                pst = connect.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next()){
                    datosDB = new data_BD();
                    datosDB.setIdOwner(rs.getInt("id"));
                    datosDB.setOwner(rs.getString("owner"));
                    list.add(datosDB);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la consulta","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e, "Error en la conexión", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                connect.close();
            }catch(SQLException ex){
                System.out.println("Error" + ex);
            }
        }
        return list;
    }
    
    public LinkedList<data_BD>getHospital(int idHosital) {
        Pool conexion = new Pool();
        Connection connect = null;
        PreparedStatement pst;
        //conexion con = new conexion();
        //Connection cn;
        //Statement st;
        ResultSet rs;
        data_BD datosDB;
        LinkedList lista = new LinkedList();
        try {
            connect = conexion.initilizeDataSource().getConnection();
            if(connect != null){
                String sql = "SELECT id, name FROM tb_hospital WHERE 1";
                pst = connect.prepareStatement(sql);
                rs = pst.executeQuery();
                while(rs.next()){
                    datosDB = new data_BD();
                    datosDB.setIdHospital(rs.getInt("id"));
                    datosDB.setHospital(rs.getString("name"));
                    lista.add(datosDB);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error en la consulta","ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e, "Error en la conexión", JOptionPane.ERROR_MESSAGE);
        }finally{
            try{
                connect.close();
            }catch(SQLException ex){
                System.out.println("Error" + ex);
            }
        }
        return lista;
    }*/
    
    public ArrayList<data_BD>getHospital(int idHosital) {
        conexion con = new conexion();
        Connection cn;
        Statement st;
        ResultSet rs;
        data_BD datosDB;
        ArrayList lista = new ArrayList();
        try {
            String sql = "SELECT id, name FROM tb_hospital WHERE 1";
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            if (cn != null) {
                System.out.println("Conexión éxitosa al DataModelDB");
                while (rs.next()) {
                    datosDB = new data_BD();
                    datosDB.setIdHospital(rs.getInt("id"));
                    datosDB.setHospital(rs.getString("name"));
                    lista.add(datosDB);
                }
            } else {
                JOptionPane.showMessageDialog(null, ".::Error al realizar la consulta::.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, ".::Error en la conexión::.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return lista;
    }

}
