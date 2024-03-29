/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CommunityDatabase;
import model.Doctor;
import model.VitalSignDatabase;
import model.HospitalDatabase;
import model.Patient;
import model.PatientDatabase;
import model.AppointmentDatabase;
import model.Appointment;
import model.Community;
import model.DoctorDatabase;
import model.Hospital;


/**
 *
 * @author shreyasrai
 */
public class PatientMain extends javax.swing.JFrame {

    /**
     * Creates new form PatientMain
     */
    DoctorDatabase doctordatabase;
    CommunityDatabase communitydatabase;
    HospitalDatabase hospitaldatabase;
    PatientDatabase persondatabase;
    AppointmentDatabase appointmentdatabase;
    VitalSignDatabase vitalsigndatabase;
    
    Patient person;
    
    public PatientMain(Patient person, DoctorDatabase doctordatabase, PatientDatabase persondatabase1, CommunityDatabase communitydatabase, HospitalDatabase hospitaldatabase, AppointmentDatabase appointmentdatabase) {
        initComponents();
        this.persondatabase = persondatabase;
        this.appointmentdatabase=appointmentdatabase;
        this.person = person;
        this.communitydatabase = communitydatabase;
        this.doctordatabase = doctordatabase;
        this.hospitaldatabase = hospitaldatabase;
        this.vitalsigndatabase=vitalsigndatabase;
        
        fillPersonDetails();
        fillDropDown();
        displayApp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        cTable = new javax.swing.JTable();
        plogout2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        pmobile = new javax.swing.JTextField();
        pgender = new javax.swing.JTextField();
        page = new javax.swing.JTextField();
        pw = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pemail = new javax.swing.JTextField();
        pbg = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        plogout = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        dropcomm = new javax.swing.JComboBox<>();
        drophosp = new javax.swing.JComboBox<>();
        dropdoc = new javax.swing.JComboBox<>();
        droptime = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        com = new javax.swing.JTextField();
        hos = new javax.swing.JTextField();
        doc = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        plogout1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("ENCOUNTER HISTORY");

        cTable.setBackground(new java.awt.Color(0, 153, 153));
        cTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Hospital", "Community", "Date", "Patient Name", "Vital Signs"
            }
        ));
        jScrollPane4.setViewportView(cTable);

        plogout2.setBackground(new java.awt.Color(204, 204, 204));
        plogout2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        plogout2.setText("BACK");
        plogout2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plogout2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel8)
                .addContainerGap(262, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plogout2)
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(plogout2)
                .addContainerGap(181, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Encounter History", jPanel3);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setBackground(new java.awt.Color(184, 212, 239));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("PATIENT DETAILS");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel4.setText("AGE");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel5.setText("GENDER");

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel6.setText("MOBILE");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel7.setText("WEIGHT");

        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel3.setText("ID");

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel12.setText("BLOOD GROUP");

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel13.setText("EMAIL");

        plogout.setBackground(new java.awt.Color(204, 204, 204));
        plogout.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        plogout.setText("BACK");
        plogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pid)
                                    .addComponent(pemail, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pmobile)
                                    .addComponent(pgender)))
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pw, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(pbg))))
                .addGap(203, 203, 203))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(plogout)
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(106, 106, 106)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(791, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {page, pemail, pgender, pid, pmobile, pname});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(pbg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pmobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(31, 31, 31)
                .addComponent(plogout)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(100, 100, 100)
                    .addComponent(jLabel2)
                    .addGap(66, 66, 66)
                    .addComponent(jLabel4)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {page, pemail, pgender, pid, pmobile, pname});

        jTabbedPane1.addTab("Patient Details", jPanel1);

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel14.setText("COMMUNITY");

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel15.setText("HOSPITAL");

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel16.setText("DOCTOR");

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel17.setText("DATE AND TIME");

        dropcomm.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        dropcomm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dropcommItemStateChanged(evt);
            }
        });

        drophosp.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        drophosp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                drophospItemStateChanged(evt);
            }
        });

        dropdoc.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        dropdoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dropdocItemStateChanged(evt);
            }
        });

        droptime.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        droptime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12/01/2021 -  4pm", "09/22/2021 -  6pm", "01/08/2021 -  1pm", "06/12/2021 -  8pm", " " }));
        droptime.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                droptimeItemStateChanged(evt);
            }
        });
        droptime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                droptimeActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 153, 153));
        jLabel18.setText("BOOK APPOINTMENT");

        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton1.setText("CONFIRM");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        plogout1.setBackground(new java.awt.Color(204, 204, 204));
        plogout1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        plogout1.setText("BACK");
        plogout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plogout1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(102, 102, 102))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(118, 118, 118)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(125, 125, 125)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(84, 84, 84)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(drophosp, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dropdoc, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(droptime, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(dropcomm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(com, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                    .addComponent(hos)
                    .addComponent(doc)
                    .addComponent(time))
                .addContainerGap(127, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(354, 354, 354)
                        .addComponent(plogout1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(198, 198, 198))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(dropcomm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(drophosp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(dropdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(droptime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(plogout1))
                .addContainerGap(170, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Book Appointment", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean valid = validateData();
        
        if (valid){
        model.Appointment app = appointmentdatabase.addNewAppointment();
        
        
        app.setCommunity(communitydatabase.getCommunity(com.getText()));
        app.setHospital(hospitaldatabase.getHospital(hos.getText()));
        app.setTime(time.getText());
        app.setDoctor(doctordatabase.getDoctor(doc.getText()));
      
        app.setPerson(person);
        //app.setVitalsign(vitalsigndatabase.getVitalSign(vital.getText()));
        
        JOptionPane.showMessageDialog(this, "Information Saved Successfully !!");
        
        displayApp();
        com.setText("");
        hos.setText("");
        time.setText("");
        doc.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
     person.setPatientName(pname.getText());
     person.setPatientEmail(pemail.getText());
     person.setPatientAge(Integer.parseInt(page.getText()));
     person.setPatientGender(pgender.getText());
     person.setPid(Integer.parseInt(pid.getText()));
     person.setPatientPhone(Integer.parseInt(pmobile.getText()));
     person.setPw(Integer.parseInt(pw.getText()));
     person.setPatientBG(pbg.getText());
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void plogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plogoutActionPerformed
        // TODO add your handling code here:
         dispose();
       // MainJFrame1 mjf = new MainJFrame1(doctordatabase, persondatabase, communitydatabase, hospitaldatabase);
       // mjf.setVisible(true);
    }//GEN-LAST:event_plogoutActionPerformed

    private void dropcommItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dropcommItemStateChanged
        // TODO add your handling code here:
        
        setToTextField();
        
        ArrayList<Hospital> hospitals = hospitaldatabase.getHospitals(dropcomm.getSelectedItem().toString());
        fillHospitalDropDown(hospitals);
          setToTextField1();
          drophospItemStateChanged(evt);
    }//GEN-LAST:event_dropcommItemStateChanged

    private void drophospItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_drophospItemStateChanged
        // TODO add your handling code here:
        setToTextField1();
        
          ArrayList<Doctor> doctors = doctordatabase.getDoctors(drophosp.getSelectedItem().toString());
         if(doctors!=null && doctors.size()>0){
             DefaultComboBoxModel model = new DefaultComboBoxModel<String>();
            for(Doctor d: doctors){
               model.addElement(d.getDocname());             
            }
            dropdoc.setModel(model);
       }
         setToTextField2();
    }//GEN-LAST:event_drophospItemStateChanged

    private void dropdocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dropdocItemStateChanged
        // TODO add your handling code here:
        
          setToTextField2();
          droptimeItemStateChanged(evt);
        

    }//GEN-LAST:event_dropdocItemStateChanged

    private void droptimeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_droptimeItemStateChanged
        // TODO add your handling code here:
        setToTextField3();
    }//GEN-LAST:event_droptimeItemStateChanged

    private void plogout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plogout1ActionPerformed
        // TODO add your handling code here:
                 dispose();

    }//GEN-LAST:event_plogout1ActionPerformed

    private void plogout2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plogout2ActionPerformed
        // TODO add your handling code here:
                 dispose();

    }//GEN-LAST:event_plogout2ActionPerformed

    private void droptimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_droptimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_droptimeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable cTable;
    private javax.swing.JTextField com;
    private javax.swing.JTextField doc;
    private javax.swing.JComboBox<String> dropcomm;
    private javax.swing.JComboBox<String> dropdoc;
    private javax.swing.JComboBox<String> drophosp;
    private javax.swing.JComboBox<String> droptime;
    private javax.swing.JTextField hos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField page;
    private javax.swing.JTextField pbg;
    private javax.swing.JTextField pemail;
    private javax.swing.JTextField pgender;
    private javax.swing.JTextField pid;
    private javax.swing.JButton plogout;
    private javax.swing.JButton plogout1;
    private javax.swing.JButton plogout2;
    private javax.swing.JTextField pmobile;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pw;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
private void fillPersonDetails() {
    pname.setText(person.getPatientName());
    pid.setText(Integer.toString(person.getPid()));
    page.setText(Integer.toString(person.getPatientAge()));
    pgender.setText(person.getPatientGender());
    pmobile.setText(Integer.toString(person.getPatientPhone()));
    pemail.setText(person.getPatientEmail());
    pw.setText(Integer.toString(person.getPw()));
    pbg.setText(person.getPatientBG());
}

    private void setToTextField() {
        com.setText(dropcomm.getSelectedItem().toString());
    }
    
    private void setToTextField1(){
        hos.setText(drophosp.getSelectedItem().toString());
    }
    
    private void setToTextField2(){
        doc.setText(dropdoc.getSelectedItem().toString());
    }
    
    private void setToTextField3(){
        time.setText(droptime.getSelectedItem().toString());
    }

    private void displayApp() {
        DefaultTableModel model = (DefaultTableModel) cTable.getModel();
       model.setRowCount(0);
       
       for(Appointment app : appointmentdatabase.getAppointmentDatabase(person)){
           
           Object[] row2 = new Object[6];
           row2[0] = app.getDoctor().getDocname();
           //row1[1] = per.getPname();
           row2[1] = app.getHospital().getHname();
           row2[2] = app.getCommunity().getCname();
           row2[3] = app.getTime();

           row2[4]=app.getPerson().getPatientName();
           row2[5]=app.getVitalsign().getVname();

          // row2[5]=app.getVitalsign().getVname();
           model.addRow(row2);
           
       }
    }

    private void fillDropDown() {
        ArrayList<Community> communities = communitydatabase.getCommunityDatabase();
        //dropcomm.setModel(new DefaultComboBoxModel<String>(communities.toArray(new String[0])));
        if(communities!=null && communities.size()>0){
        for(Community c: communities){
            dropcomm.addItem(c.getCname());
        }
       }
    }

    private void fillHospitalDropDown(ArrayList<Hospital> hospitals) {
        if(hospitals!=null && hospitals.size()>0){
             DefaultComboBoxModel model = new DefaultComboBoxModel<String>();
            for(Hospital h: hospitals){
                model.addElement(h.getHname());
            }
            drophosp.setModel(model);
        }    }
    private boolean validateData() {
                if (doc.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Doctor");
            return false;
        }
                if (time.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Time");
            return false;
        }
                        if (hos.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Hospital");
            return false;
        }
                                if (com.getText().length() < 1) {
            JOptionPane.showMessageDialog(this, "Enter Community");
            return false;
        }
return true;    }
}
