/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import model.AppointmentDatabase;
import model.CommunityDatabase;
import model.DoctorDatabase;
import model.VitalSignDatabase;
import model.HospitalDatabase;
import model.PatientDatabase;

/**
 *
 * @author shreyasrai
 */
public class SystemLogin extends javax.swing.JPanel {

    /**
     * Creates new form SystemLogin
     */
    DoctorDatabase doctordatabase;
    PatientDatabase persondatabase;
    CommunityDatabase communitydatabase;
    HospitalDatabase hospitaldatabase;
    AppointmentDatabase appointmentdatabase;
    VitalSignDatabase vitalsigndatabase;
    
    public SystemLogin(DoctorDatabase doctordatabase, VitalSignDatabase vitalsigndatabase, PatientDatabase persondatabase, CommunityDatabase communitydatabase, HospitalDatabase hospitaldatabase, AppointmentDatabase appointmentdatabase) {
        initComponents();
        
        this.doctordatabase=doctordatabase;
        this.persondatabase=persondatabase;
        this.communitydatabase=communitydatabase;
        this.hospitaldatabase=hospitaldatabase;
        this.appointmentdatabase=appointmentdatabase;
        this.vitalsigndatabase=vitalsigndatabase;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        unamed = new javax.swing.JLabel();
        pswdd = new javax.swing.JLabel();
        userD = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pswdD = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setBackground(new java.awt.Color(187, 216, 246));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER SYSTEM LOGIN DETAILS");

        unamed.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        unamed.setText("User Name");

        pswdd.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        pswdd.setText("Password");

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(142, 142, 142))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unamed)
                            .addComponent(pswdd))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pswdD)
                            .addComponent(userD, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unamed)
                    .addComponent(userD))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdd)
                    .addComponent(pswdD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addGap(173, 173, 173))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    if( userD.getText().matches("system") && pswdD.getText().matches("system")){
        //h
        SystemMain system = new SystemMain(doctordatabase,vitalsigndatabase, persondatabase, communitydatabase, hospitaldatabase, appointmentdatabase);
        system.setVisible(true);
        LoginPage mjf = new LoginPage(doctordatabase, vitalsigndatabase, persondatabase, communitydatabase, hospitaldatabase, appointmentdatabase); 
        mjf.setVisible(false);
        //system.dispose();
        }
    else{
            JOptionPane.showMessageDialog(this, "Incorrect credential");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField pswdD;
    private javax.swing.JLabel pswdd;
    private javax.swing.JLabel unamed;
    private javax.swing.JTextField userD;
    // End of variables declaration//GEN-END:variables
}