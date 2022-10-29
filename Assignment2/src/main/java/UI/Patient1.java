/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import model.AppointmentDatabase;
import model.CommunityDatabase;
import model.DoctorDatabase;
import model.HospitalDatabase;
import model.Person;
import model.PersonDatabase;

/**
 *
 * @author shreyasrai
 */
   

public class Patient1 extends javax.swing.JPanel {

    /**
     * Creates new form Patient
     */
    DoctorDatabase doctordatabase;
    PersonDatabase persondatabase;
    CommunityDatabase communitydatabase;
    HospitalDatabase hospitaldatabase;
    AppointmentDatabase appointmentdatabase;
    
    public Patient1(DoctorDatabase doctordatabase, PersonDatabase persondatabase, CommunityDatabase communitydatabase, HospitalDatabase hospitaldatabase, AppointmentDatabase appointmentdatabase) {
        initComponents();
        
        this.doctordatabase=doctordatabase;
        this.persondatabase=persondatabase;
        this.communitydatabase=communitydatabase;
        this.hospitaldatabase=hospitaldatabase;
        this.appointmentdatabase=appointmentdatabase;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userP = new javax.swing.JTextField();
        pswdP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Patient Login");

        jLabel2.setText("User Name");

        jLabel3.setText("Password");

        pswdP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswdPActionPerformed(evt);
            }
        });

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
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userP, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(pswdP))
                .addContainerGap(309, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(userP)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pswdP))
                .addGap(106, 106, 106)
                .addComponent(jButton1)
                .addGap(180, 180, 180))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pswdPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswdPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswdPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username = userP.getText();
        String pswd = pswdP.getText();
        Person p = persondatabase.getPerson(username, pswd);
        
        /*if( userP.getText().matches("patient") && pswdP.getText().matches("patient")){
        Patient2 patient = new Patient2(doctordatabase, persondatabase, communitydatabase, hospitaldatabase);
        patient.setVisible(true);
        }*/
         if(p!=null){
             Patient2 patient = new Patient2(p,doctordatabase, persondatabase, communitydatabase, hospitaldatabase, appointmentdatabase);
             patient.setVisible(true);
            //MainJFrame mjf = new MainJFrame(doctordatabase, persondatabase, communitydatabase, hospitaldatabase); 
            //mjf.setVisible(false);
            
        }else{
            JOptionPane.showMessageDialog(this, "Incorrect credential");
        }  
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField pswdP;
    private javax.swing.JTextField userP;
    // End of variables declaration//GEN-END:variables
}
