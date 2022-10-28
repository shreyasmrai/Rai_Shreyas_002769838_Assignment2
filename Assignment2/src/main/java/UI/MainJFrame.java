/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.CommunityDatabase;
import model.Doctor;
import model.DoctorDatabase;
import model.HospitalDatabase;
import model.PersonDatabase;
import model.Hospital;

/**
 *
 * @author shreyasrai
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    DoctorDatabase doctordatabase;
    PersonDatabase persondatabase;
    CommunityDatabase communitydatabase;
    HospitalDatabase hospitaldatabase;
    
    
    ImageIcon myImage;
    
    public ImageIcon setIcon(String m) {
        if (m != null) {
            myImage = new ImageIcon(m);
        } 
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(442, 266, Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        return i;

    }
    public MainJFrame(DoctorDatabase doctordatabase, PersonDatabase persondatabase, CommunityDatabase communitydatabase, HospitalDatabase hospitaldatabase) {
        initComponents();
        //this.doctordatabase=doctordatabase;
        this.persondatabase=persondatabase;
        this.doctordatabase=doctordatabase;
        this.communitydatabase=communitydatabase;
        this.hospitaldatabase=hospitaldatabase;
        //jDisplayImage.setIcon(setIcon( "/Users/shreyasrai/Desktop/CO-OP/Rai_Shreyas_002769838/Assignment2/hospi.jpg"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jImage = new javax.swing.JPanel();
        jDisplayImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(50);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setText("Doctor");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(0, 204, 153));
        jButton2.setText("Hospital");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(0, 204, 153));
        jButton3.setText("Patient");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton5.setBackground(new java.awt.Color(0, 204, 153));
        jButton5.setText("Community Admin");
        jPanel1.add(jButton5);

        jButton4.setBackground(new java.awt.Color(0, 204, 153));
        jButton4.setText("System");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jSplitPane1.setTopComponent(jPanel1);

        jImage.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jImageLayout = new javax.swing.GroupLayout(jImage);
        jImage.setLayout(jImageLayout);
        jImageLayout.setHorizontalGroup(
            jImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDisplayImage, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
        );
        jImageLayout.setVerticalGroup(
            jImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDisplayImage, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jImage);

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Management System");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System1 systempanel = new System1(doctordatabase, persondatabase, communitydatabase, hospitaldatabase);
        //jSplitPane1.setRightComponent(systempanel);    // TODO add your handling code here:
        jSplitPane1.setBottomComponent(systempanel);        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Hospital1 hospitalpanel = new Hospital1(doctordatabase, persondatabase, communitydatabase, hospitaldatabase);
        jSplitPane1.setBottomComponent(hospitalpanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     Doctor1 doctorpanel = new Doctor1(doctordatabase, persondatabase, communitydatabase, hospitaldatabase);
        jSplitPane1.setBottomComponent(doctorpanel);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Patient1 patientpanel = new Patient1(doctordatabase, persondatabase, communitydatabase, hospitaldatabase);
        jSplitPane1.setBottomComponent(patientpanel);
    }//GEN-LAST:event_jButton3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jDisplayImage;
    private javax.swing.JPanel jImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
