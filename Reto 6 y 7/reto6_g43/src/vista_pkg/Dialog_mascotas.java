
package vista_pkg;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import modelo_pkg.conexion;
import Controlador.controlador;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author teis_
 */
public class Dialog_mascotas extends javax.swing.JDialog {
    conexion con = new conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    private final controlador Controlador;
    //int idowners;

    /**
     * Creates new form Dialog_mascotas
     */
    public Dialog_mascotas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        show_mascotas();
        Controlador = new controlador(this);
    }
    public Dialog_mascotas(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        show_mascotas();
        Controlador = new controlador(this);
    }
    /*
    public void setIdowners(int id){
        this.idowners = id;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nameM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nac = new javax.swing.JTextField();
        cb_raza = new javax.swing.JComboBox<>();
        cb_salud = new javax.swing.JComboBox<>();
        btn_agregar_mascota = new javax.swing.JButton();
        btn_editar_mascota = new javax.swing.JButton();
        btn_borrar_mascota = new javax.swing.JButton();
        cb_idDuenoM = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txt_idMascota = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_pets = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("FORMULARIO REGISTRO DE MASCOTAS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        txt_nameM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Raza");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("Año de nacimiento");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Estado de salud");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Dueño");

        txt_nac.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        cb_raza.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cb_raza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Bulldog", "Bulldog frances", "Pastor Aleman", "Pincher", "Boxer", "Criollo", "Cocker spaniel", "Pug", "Rottweiler", "Chihuhua" }));

        cb_salud.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cb_salud.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción", "Cita médica", "En hospitalización", "En laboratorio", "En control de vacunas" }));

        btn_agregar_mascota.setBackground(new java.awt.Color(153, 255, 153));
        btn_agregar_mascota.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_agregar_mascota.setText("Agregar mascota");
        btn_agregar_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_mascotaActionPerformed(evt);
            }
        });

        btn_editar_mascota.setBackground(new java.awt.Color(153, 153, 255));
        btn_editar_mascota.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_editar_mascota.setText("Editar mascota");
        btn_editar_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editar_mascotaActionPerformed(evt);
            }
        });

        btn_borrar_mascota.setBackground(new java.awt.Color(255, 153, 153));
        btn_borrar_mascota.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btn_borrar_mascota.setText("Eliminar mascota");
        btn_borrar_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar_mascotaActionPerformed(evt);
            }
        });

        cb_idDuenoM.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel7.setText("ID");

        txt_idMascota.setEditable(false);
        txt_idMascota.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/public_pkg/mascotas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(157, 157, 157))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cb_raza, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_nameM, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cb_salud, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_idDuenoM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_editar_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_borrar_mascota))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(btn_agregar_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_agregar_mascota)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_borrar_mascota)
                            .addComponent(btn_editar_mascota)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_nameM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_nac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txt_idMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cb_salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cb_idDuenoM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("HISTORIAL DE MASCOTAS");

        tb_pets.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tb_pets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "RAZA", "AÑO NACIMIENTO", "ESTADO", "DUEÑO"
            }
        ));
        tb_pets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_petsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_pets);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(225, 225, 225))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregar_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_mascotaActionPerformed
        // TODO add your handling code here:
        anadir_mascota();
    }//GEN-LAST:event_btn_agregar_mascotaActionPerformed

    private void btn_editar_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editar_mascotaActionPerformed
        // TODO add your handling code here:
        editar_mascota();
    }//GEN-LAST:event_btn_editar_mascotaActionPerformed

    private void btn_borrar_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar_mascotaActionPerformed
        // TODO add your handling code here:
        borrar_mascota();
    }//GEN-LAST:event_btn_borrar_mascotaActionPerformed

    private void tb_petsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_petsMouseClicked
        // TODO add your handling code here:
        int row = tb_pets.getSelectedRow();
        System.out.println(row);
        if(row < 0){
            JOptionPane.showMessageDialog(this, "Debes seleccionar una mascota");
        }else{
            int id  = Integer.parseInt((String)tb_pets.getValueAt(row, 0).toString());
            String name  = (String)tb_pets.getValueAt(row, 1);
            String breed = (String)tb_pets.getValueAt(row, 2);
            int born_year  = Integer.parseInt((String)tb_pets.getValueAt(row, 3).toString());
            String health = (String)tb_pets.getValueAt(row, 4);
            int id_owner  = Integer.parseInt((String)tb_pets.getValueAt(row, 5).toString());
          
            System.out.println(id + " - " + name + " - " + breed + " - " + born_year + " - " + health + " - " + id_owner);
            txt_idMascota.setText("" + id);
            txt_nameM.setText(name);
            cb_raza.setSelectedItem(breed);
            txt_nac.setText("" + born_year);
            cb_salud.setSelectedItem(health);
            cb_idDuenoM.setSelectedIndex(id_owner-1);
        }

    }//GEN-LAST:event_tb_petsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dialog_mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dialog_mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dialog_mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dialog_mascotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Dialog_mascotas frame = new Dialog_mascotas(new javax.swing.JFrame(), true);
                Dialog_mascotas dialog = new Dialog_mascotas(new javax.swing.JDialog(), true);
                frame.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                frame.setVisible(true);
                dialog.setVisible(true);
            }
        });
    }
    
    void show_mascotas() {
        String sql = "SELECT * FROM tb_pet";
        try {
            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            //Los datos que devuelve la consulta se muestran en la tabla
            Object[]mascota = new Object[6];
            modelo = (DefaultTableModel) tb_pets.getModel();
            while (rs.next()) {
                mascota[0] = rs.getInt("id");
                mascota[1] = rs.getString("name");
                mascota[2] = rs.getString("breed");
                mascota[3] = rs.getInt("born_year");
                mascota[4] = rs.getString("health_state");
                mascota[5] = rs.getInt("id_owner_pet");
                modelo.addRow(mascota);
                System.out.println(rs.getInt("id"));
            }
            tb_pets.setModel(modelo);
        } catch (SQLException e) {

        }
    }
    
    void anadir_mascota(){
        String nameMascota = txt_nameM.getText();
        String breedMascota = cb_raza.getSelectedItem().toString();
        int year = Integer.parseInt(txt_nac.getText());
        String health = cb_salud.getSelectedItem().toString();
        int ownerId = cb_idDuenoM.getSelectedIndex();
        
        if (nameMascota.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta ingresar el nombre de la mascota");
        }else{
            System.out.println(nameMascota + " - " + breedMascota + " - " + year + " - " + health + " - " + ownerId);
            String query = "INSERT INTO `tb_pet`(`name`, `breed`, `born_year`, `health_state`, `id_owner_pet`) VALUES ('" + nameMascota + "', '" + breedMascota + "', '" + year + "', '" + health + "', '" + ownerId + "')";
           
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "La mascota ha sido creada con éxito");
                //clear_rows_table();
                show_mascotas();
            }catch(HeadlessException | SQLException e){
              JOptionPane.showMessageDialog(this, "No se pudo crear la mascota");
            }
        }   
    }
    
    void editar_mascota(){
        int id = Integer.parseInt(txt_idMascota.getText());
        String nameM = txt_nameM.getText();
        String breedM = cb_raza.getSelectedItem().toString();
        int yearM = Integer.parseInt(txt_nac.getText());
        String healthM = cb_salud.getSelectedItem().toString();
        int ownerM = cb_idDuenoM.getSelectedIndex();
        if (nameM.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Falta ingresar el nombre de la mascota");
        }else{
            String query = "UPDATE tb_pet SET name = '" + nameM + "', breed = '" + breedM + "', born_year = '" + yearM + "', health_state = '" + healthM + "', id_owner_pet = '" + ownerM + "' WHERE id = " + id;
            //UPDATE tb_persons SET dni =dni, nombre= 'name' WHERE id = id
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "La información de la mascota ha sido actualizada con éxito");
                clear_rows_table();
                show_mascotas();
            }catch(HeadlessException | SQLException e){
              JOptionPane.showMessageDialog(this, "No se pudo actualizar la información de la mascota");
            }
        }   
    }
    
    void borrar_mascota(){
        int fila = tb_pets.getSelectedRow();
        int id = Integer.parseInt(txt_idMascota.getText());
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "No has seleccionado una mascota");
        }else{
            
            System.out.println("ID: " + id);
            String query = "DELETE FROM tb_pet WHERE id = " + id;
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "La mascota ha sido eliminada del historial con exito!");
                clear_rows_table();
                show_mascotas();
            }catch(HeadlessException | SQLException e){
            }
        }
    }

    
    void clear_rows_table(){
        for (int i = 0; i < tb_pets.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i-1;
        }
        txt_idMascota.setText("");
        txt_nameM.setText("");
        cb_raza.setSelectedIndex(0);
        txt_nac.setText("");
        cb_salud.setSelectedIndex(0);
        cb_idDuenoM.setSelectedIndex(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_mascota;
    private javax.swing.JButton btn_borrar_mascota;
    private javax.swing.JButton btn_editar_mascota;
    public javax.swing.JComboBox<Object> cb_idDuenoM;
    private javax.swing.JComboBox<String> cb_raza;
    private javax.swing.JComboBox<String> cb_salud;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_pets;
    private javax.swing.JTextField txt_idMascota;
    private javax.swing.JTextField txt_nac;
    private javax.swing.JTextField txt_nameM;
    // End of variables declaration//GEN-END:variables
}