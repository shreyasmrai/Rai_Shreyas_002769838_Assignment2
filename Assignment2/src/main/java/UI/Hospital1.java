/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import model.CommunityDatabase;
import model.Doctor;
import model.Hospital;
import model.VitalSignDatabase;
import model.HospitalDatabase;
import model.Person;
import model.PersonDatabase;
import model.Appointment;
import model.AppointmentDatabase;
import model.DoctorDatabase;

/**
 *
 * @author shreyasrai
 */
public class Hospital1 extends javax.swing.JPanel {
DoctorDatabase doctordatabase;
    PersonDatabase persondatabase;
    CommunityDatabase communitydatabase;
    HospitalDatabase hospitaldatabase;
        AppointmentDatabase appointmentdatabase;  
            VitalSignDatabase vitalsigndatabase;

        
    /**
     * Creates new form Hospital1
     * @param doctordatabase
     * @param persondatabase
     * @param communitydatabase
     * @param hospitaldatabase
     */
    public Hospital1(DoctorDatabase doctordatabase,VitalSignDatabase vitalsigndatabase, PersonDatabase persondatabase, CommunityDatabase communitydatabase, HospitalDatabase hospitaldatabase, AppointmentDatabase appointmentdatabase) {
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

        jLabel2 = new javax.swing.JLabel();
        unamed = new javax.swing.JLabel();
        pswdd = new javax.swing.JLabel();
        userP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pswdP = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTER HOPITAL LOGIN DETAILS");

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 905, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unamed)
                            .addComponent(pswdd))
                        .addGap(99, 99, 99)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userP)
                            .addComponent(pswdP, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unamed)
                    .addComponent(userP))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdd)
                    .addComponent(pswdP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addGap(194, 194, 194))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = userP.getText();
        String pswd = pswdP.getText();
        Hospital h = hospitaldatabase.getHospital(username, pswd);
        
        //if( userP.getText().matches("patient") && pswdP.getText().matches("patient")){
         //   Patient2 patient = new Patient2(doctordatabase, persondatabase, communitydatabase, hospitaldatabase);
         //   patient.setVisible(true);
         if(h!=null){
             Hospital2 hospital = new Hospital2(h,doctordatabase, persondatabase, communitydatabase, hospitaldatabase);
             hospital.setVisible(true);
            MainJFrame1 mjf = new MainJFrame1(doctordatabase,vitalsigndatabase, persondatabase, communitydatabase, hospitaldatabase, appointmentdatabase); 
            mjf.setVisible(false);
            
        }else{
            JOptionPane.showMessageDialog(this, "Incorrect credential");
        }  
         
           // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField pswdP;
    private javax.swing.JLabel pswdd;
    private javax.swing.JLabel unamed;
    private javax.swing.JTextField userP;
    // End of variables declaration//GEN-END:variables
}
