
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sunanda
 */
public class UpdateTutor extends javax.swing.JFrame {

    /**
     * Creates new form UpdateTutor
     */
    String name;
    public UpdateTutor(String n) {
        name = n;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton_Cancel2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_FN = new javax.swing.JTextField();
        jTextField_LN = new javax.swing.JTextField();
        jTextField_UN = new javax.swing.JTextField();
        jPasswordField_PASS = new javax.swing.JPasswordField();
        jTextField_add = new javax.swing.JTextField();
        jTextField_ins = new javax.swing.JTextField();
        jTextField_inst = new javax.swing.JTextField();
        jTextField_OC = new javax.swing.JTextField();
        jTextField_Fees = new javax.swing.JTextField();
        jButton_Cancel = new javax.swing.JButton();
        jButton_Previous = new javax.swing.JButton();
        jTextField_qua = new javax.swing.JTextField();
        jButton_Update = new javax.swing.JButton();
        AC_delete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Upadate");

        jButton_Cancel2.setBackground(new java.awt.Color(0, 0, 0));
        jButton_Cancel2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton_Cancel2.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel2.setText("Return to Home");
        jButton_Cancel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("First Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Last Name:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Username:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Password:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Address:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Institution:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("In Short:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("Qualification:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setText("Offered courses:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 21)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Fees:");

        jTextField_FN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextField_LN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextField_UN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jPasswordField_PASS.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField_add.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextField_ins.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextField_inst.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextField_OC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jTextField_Fees.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jButton_Cancel.setBackground(new java.awt.Color(204, 0, 0));
        jButton_Cancel.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton_Cancel.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Cancel.setText("Cancel");
        jButton_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CancelActionPerformed(evt);
            }
        });

        jButton_Previous.setBackground(new java.awt.Color(51, 0, 255));
        jButton_Previous.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton_Previous.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Previous.setText("See Previous Data");
        jButton_Previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PreviousActionPerformed(evt);
            }
        });

        jTextField_qua.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        jButton_Update.setBackground(new java.awt.Color(51, 153, 0));
        jButton_Update.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jButton_Update.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        AC_delete.setForeground(new java.awt.Color(255, 255, 255));
        AC_delete.setText("Delete my account");
        AC_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AC_deleteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Cancel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton_Cancel)
                                        .addComponent(jLabel8)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_add, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addComponent(jLabel16))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(jLabel13))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel12))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel14))
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_inst, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_ins, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_OC, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Fees, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_qua, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(jButton_Previous, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton_Update))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(423, 423, 423)
                                .addComponent(AC_delete)))
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_Cancel2)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTextField_LN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField_FN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jTextField_UN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jPasswordField_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addComponent(jTextField_ins, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jTextField_inst, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jTextField_qua, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_OC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField_add, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(jTextField_Fees, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Cancel)
                    .addComponent(jButton_Previous)
                    .addComponent(jButton_Update))
                .addGap(29, 29, 29)
                .addComponent(AC_delete)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Cancel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel2ActionPerformed
        FrontPage fp = new FrontPage();
        fp.setVisible(true);
        fp.pack();
        fp.setLocationRelativeTo(null);
        fp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton_Cancel2ActionPerformed

    private void jButton_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton_CancelActionPerformed

    private void jButton_PreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PreviousActionPerformed
       PreparedStatement ps;
        ResultSet rs;
        String query = "SELECT * FROM `tutor profile` WHERE `Uname` =?";
        try {
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();
            
            if(rs.next()){
                jTextField_FN.setText(rs.getString("Fname")); 
                jTextField_LN.setText(rs.getString("Lname")); 
                jTextField_UN.setText(rs.getString("Uname")); 
                jPasswordField_PASS.setText(rs.getString("Pass"));
                jTextField_add.setText(rs.getString("Address"));
                jTextField_ins.setText(rs.getString("Institution"));
                jTextField_inst.setText(rs.getString("InShort"));
                jTextField_qua.setText(rs.getString("Qualification"));
                jTextField_OC.setText(rs.getString("Offererd Courses"));
                jTextField_Fees.setText(rs.getString("Fees"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UpdateTutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_PreviousActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        PreparedStatement ps;
        String uname = jTextField_UN.getText();
        String fname = jTextField_FN.getText();
        String lname = jTextField_LN.getText();
        String pass = jPasswordField_PASS.getText();
        String add = jTextField_add.getText();
        String ins = jTextField_ins.getText();
        String inst = jTextField_inst.getText();
        String qua = jTextField_qua.getText();
        String oc = jTextField_OC.getText();
        String fees = jTextField_Fees.getText();
        String query1;
        query1 = "UPDATE `tutor profile` SET `Fname` =?,`Lname` =?,`Uname` =?, `Pass` =?, `Address` =?, `Institution` =?, `InShort` =?, `Qualification` =?, `Offererd Courses` =?, `Fees` =? WHERE `Uname` =?";
        try {

            ps = MyConnection.getConnection().prepareStatement(query1);
            ps.setString(1, fname);
            ps.setString(2, lname);
            ps.setString(3, uname);
            ps.setString(4, pass);
            ps.setString(5, add);
            ps.setString(6, ins);
            ps.setString(7, inst);
            ps.setString(8, qua);
            ps.setString(9, oc);
            ps.setString(10, fees);
            ps.setString(11, name);
            ps.executeUpdate();
            PassSuccess mf = new PassSuccess();
            mf.setVisible(true);
            mf.pack();
            mf.setLocationRelativeTo(null);
            mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.dispose();

        }catch(SQLException ex) {
            Logger.getLogger(UpdateTutor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void AC_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AC_deleteMouseClicked
        Delete_T mf = new Delete_T(name);
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        mf.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.dispose();
    }//GEN-LAST:event_AC_deleteMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AC_delete;
    private javax.swing.JButton jButton_Cancel;
    private javax.swing.JButton jButton_Cancel2;
    private javax.swing.JButton jButton_Previous;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_PASS;
    private javax.swing.JTextField jTextField_FN;
    private javax.swing.JTextField jTextField_Fees;
    private javax.swing.JTextField jTextField_LN;
    private javax.swing.JTextField jTextField_OC;
    private javax.swing.JTextField jTextField_UN;
    private javax.swing.JTextField jTextField_add;
    private javax.swing.JTextField jTextField_ins;
    private javax.swing.JTextField jTextField_inst;
    private javax.swing.JTextField jTextField_qua;
    // End of variables declaration//GEN-END:variables
}
