/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Employee;
import model.EmployeeDatabase;

/**
 *
 * @author shreyasrai
 */
public class ReadJPanel extends javax.swing.JPanel {

    /**
     * Creates new form readJPanel
     */
    EmployeeDatabase employeeDatabase;
    
    public ReadJPanel(EmployeeDatabase employeeDatabase) {
        initComponents();
        
        this.employeeDatabase=employeeDatabase;
        displayEmp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        ViewButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPhoto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jGender = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jStart_Date = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jEmployee_ID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLevel = new javax.swing.JTextField();
        jAge = new javax.swing.JTextField();
        jTeam_Info = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPosition = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jMobile = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jEmail = new javax.swing.JTextField();
        UpdateButton = new javax.swing.JButton();
        jSearch = new javax.swing.JLabel();
        jFilterText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jImage = new javax.swing.JPanel();
        jReadLabelImage = new javax.swing.JLabel();
        jBrowserRead = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCreateButton = new javax.swing.JButton();

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Shreyas Rai", "30887", "25", "Male", "10/01/22", "Trainee", "SD Group", "SDE", "8576939501", null, null},
                {"Aman Gupta", "28091", "25", "Male", "07/25/22", "Trainee", "BA Group", "SDE", "8976543210", null, null},
                {"Sanket Somalkar", "30221", "24", "Male", "01/01/22", "Associate", "SD Group", "SDE", "8206481868", null, null}
            },
            new String [] {
                "Name", "Employee_ID", "Age", "Gender", "Start Date", "Level", "Team Information", "Position Title", "Mobile", "Email", "Photo"
            }
        ));
        jScrollPane1.setViewportView(empTable);

        ViewButton.setText("VIEW");
        ViewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("DELETE");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel9.setText("Team Info");

        jLabel10.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel11.setText("Mobile");

        jLabel12.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel12.setText("Photo");

        jLabel2.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel2.setText("Name");

        jGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel3.setText("Employee_ID");

        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });

        jStart_Date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStart_DateActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel4.setText("Age");

        jLabel5.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel5.setText("Gender");

        jLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLevelActionPerformed(evt);
            }
        });

        jAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAgeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel6.setText("Start Date");

        jPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPositionActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel7.setText("Position Title");

        jLabel8.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 14)); // NOI18N
        jLabel8.setText("Level");

        UpdateButton.setText("UPDATE");
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });

        jSearch.setText("Search");

        jFilterText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFilterTextActionPerformed(evt);
            }
        });
        jFilterText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFilterTextKeyReleased(evt);
            }
        });

        jLabel1.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("YuMincho +36p Kana", 3, 24)); // NOI18N
        jLabel13.setText("EMPLOYEE DETAILS");

        javax.swing.GroupLayout jImageLayout = new javax.swing.GroupLayout(jImage);
        jImage.setLayout(jImageLayout);
        jImageLayout.setHorizontalGroup(
            jImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jImageLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jReadLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jImageLayout.setVerticalGroup(
            jImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jImageLayout.createSequentialGroup()
                .addComponent(jReadLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jBrowserRead.setText("Browse Image");
        jBrowserRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrowserReadActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Employee ID", "Mobile", "Email" }));

        jCreateButton.setText("CREATE");
        jCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTeam_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jStart_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(116, 116, 116))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jAge, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                                            .addComponent(jEmployee_ID, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextName, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBrowserRead)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(jImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCreateButton))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ViewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(UpdateButton)
                                        .addGap(55, 55, 55)
                                        .addComponent(DeleteButton))
                                    .addComponent(jFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jAge, jEmail, jGender, jLevel, jMobile, jPhoto, jPosition, jStart_Date, jTeam_Info});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFilterText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ViewButton)
                    .addComponent(UpdateButton)
                    .addComponent(DeleteButton)
                    .addComponent(jCreateButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBrowserRead))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jEmployee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jStart_Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jTeam_Info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jAge, jEmail, jEmployee_ID, jFilterText, jGender, jLevel, jMobile, jPhoto, jPosition, jStart_Date, jTeam_Info, jTextName});

    }// </editor-fold>//GEN-END:initComponents

    private void ViewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewButtonActionPerformed
         //TODO add your handling code here:
        int selected = empTable.getSelectedRow();
        
        if(selected<0){
            JOptionPane.showMessageDialog(this, "Select The Row To View");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        Employee selectedEmp = (Employee) model.getValueAt(selected, 0);
        
        jTextName.setText(selectedEmp.getName());
        jEmployee_ID.setText(selectedEmp.getEmployee_id());
        jAge.setText(String.valueOf(selectedEmp.getAge()));
        jGender.setText(selectedEmp.getGender());
        jStart_Date.setText(selectedEmp.getStart_date());
        jLevel.setText(selectedEmp.getLevel());
        jTeam_Info.setText(selectedEmp.getTeam_info());
        jPosition.setText(selectedEmp.getPosition());
        jMobile.setText(String.valueOf(selectedEmp.getMobile()));
        jEmail.setText(selectedEmp.getEmail());
        //jPhoto.setText(employee.getPhoto());
    }//GEN-LAST:event_ViewButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        int selected = empTable.getSelectedRow();
        
        if(selected<0){
            JOptionPane.showMessageDialog(this, "Select The Row To Delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        Employee selectedEmp = (Employee) model.getValueAt(selected, 0);
        
        employeeDatabase.deleteemp(selectedEmp);
        JOptionPane.showMessageDialog(this, "Entry Removed !!");
        
        displayEmp();
        jTextName.setText("");
        jEmployee_ID.setText("");
        jAge.setText("");
        jGender.setText("");
        jStart_Date.setText("");
        jLevel.setText("");
        jTeam_Info.setText("");
        jPosition.setText("");
        jMobile.setText("");
        jEmail.setText("");
        //jPhoto.setText("");

    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void jGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jGenderActionPerformed

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jStart_DateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStart_DateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jStart_DateActionPerformed

    private void jLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLevelActionPerformed

    private void jAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAgeActionPerformed

    private void jPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPositionActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
         //TODO add your handling code here:
        int i = empTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        if(i >= 0)
        {
            model.setValueAt(jTextName.getText(), i, 0);
            model.setValueAt(jEmployee_ID.getText(), i, 1);
            model.setValueAt(jAge.getText(), i, 2);
            model.setValueAt(jGender.getText(), i, 3);
            model.setValueAt(jStart_Date.getText(), i, 4);
            model.setValueAt(jLevel.getText(), i, 5);
            model.setValueAt(jTeam_Info.getText(), i, 6);
            model.setValueAt(jPosition.getText(), i, 7);
            model.setValueAt(jMobile.getText(), i, 8);
            model.setValueAt(jEmail.getText(), i, 9);
            //model.setValueAt(jPhoto.getText(), i, 10);
           
        }
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void jFilterTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFilterTextKeyReleased
        // TODO add your handling code here:
        String query = jFilterText.getText().toLowerCase();
        
        filter(query);
    }//GEN-LAST:event_jFilterTextKeyReleased

    private void jFilterTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFilterTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFilterTextActionPerformed

    private void jBrowserReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrowserReadActionPerformed
        // TODO add your handling code here:
        JFileChooser browseImage = new JFileChooser();
        FileNameExtensionFilter nameExtension = new FileNameExtensionFilter("IMAGES","png","jpeg");
        browseImage.addChoosableFileFilter(nameExtension);
        int showOpenDialogue = browseImage.showOpenDialog(null);
        if (showOpenDialogue ==JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImage.getSelectedFile();
            String imagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, imagePath);
            
            //Display
            Image displayImage = new ImageIcon(imagePath).getImage().getScaledInstance(jImage.getWidth(),jImage.getHeight(),Image.SCALE_SMOOTH);
            jReadLabelImage.setIcon(new ImageIcon(displayImage));
        }
    }//GEN-LAST:event_jBrowserReadActionPerformed

    private void jCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateButtonActionPerformed
        // TODO add your handling code here:
        Employee emp = employeeDatabase.addNewEmployee();
        emp.setName(jTextName.getText());
        emp.setEmployee_id(jEmployee_ID.getText());
        emp.setAge(Integer.parseInt(jAge.getText()));
        emp.setGender(jGender.getText());
        emp.setStart_date(jStart_Date.getText());
        emp.setLevel(jLevel.getText());
        emp.setTeam_info(jTeam_Info.getText());
        emp.setPosition(jPosition.getText());
        emp.setMobile(Integer.parseInt(jMobile.getText()));
        emp.setEmail(jEmail.getText());
        //emp.setImage(imagePath.getText());
        //emp.setImagePath(imagePath.getText());
        //Validation CHeck
        displayEmp();
        if(jTextName.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Name cannot be Null !!");
        }
        if(jEmployee_ID.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Employee ID cannot be Null !!");
        }
        if(jGender.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Gender  cannot be Null !!");
        }
        if(jMobile.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Mobile Number  cannot be Null !!");
        }
        if(jEmail.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Email address  cannot be Null !!");
        }
        if(jPosition.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Position  cannot be Null !!");
        }
        if(jTeam_Info.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Team Info  cannot be Null !!");
        }
        if(jLevel.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Level  cannot be Null !!");
        }
        if(jAge.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Age  cannot be Null !!");
        }
        if(jStart_Date.getText().trim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Start Date  cannot be Null !!");
        }
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jEmail.getText()))) 
            {
            JOptionPane.showMessageDialog(null, "Email address is invalid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        
        JOptionPane.showMessageDialog(this, "Information Saved Successfully !!");
        jTextName.setText("");
        jEmployee_ID.setText("");
        jAge.setText("");
        jGender.setText("");
        jStart_Date.setText("");
        jLevel.setText("");
        jTeam_Info.setText("");
        jPosition.setText("");
        jMobile.setText("");
        jEmail.setText("");
        //jPhoto.setText("");
        
        
        
    }//GEN-LAST:event_jCreateButtonActionPerformed
    private void filter(String query)
    {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        empTable.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JButton ViewButton;
    private javax.swing.JTable empTable;
    private javax.swing.JTextField jAge;
    private javax.swing.JButton jBrowserRead;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton jCreateButton;
    private javax.swing.JTextField jEmail;
    private javax.swing.JTextField jEmployee_ID;
    private javax.swing.JTextField jFilterText;
    private javax.swing.JTextField jGender;
    private javax.swing.JPanel jImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jLevel;
    private javax.swing.JTextField jMobile;
    private javax.swing.JTextField jPhoto;
    private javax.swing.JTextField jPosition;
    private javax.swing.JLabel jReadLabelImage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jSearch;
    private javax.swing.JTextField jStart_Date;
    private javax.swing.JTextField jTeam_Info;
    private javax.swing.JTextField jTextName;
    // End of variables declaration//GEN-END:variables

   private void displayEmp() {
      
       DefaultTableModel model = (DefaultTableModel) empTable.getModel();
       model.setRowCount(0);
       
       for(Employee emp : employeeDatabase.getEmployeeDatabase()){
           
           Object[] row1 = new Object[11];
           row1[0] = emp;
           //row1[0] = emp.getName();
           row1[1] = emp.getEmployee_id();
           row1[2] = emp.getAge();
           row1[3] = emp.getGender();
           row1[4] = emp.getStart_date();
           row1[5] = emp.getLevel();
           row1[6] = emp.getTeam_info();
           row1[7] = emp.getPosition();
           row1[8] = emp.getMobile();
           row1[9] = emp.getEmail();
           row1[10] = emp.getImage();
           
           model.addRow(row1);
       }
       
     /**   jName.setText(employeeDatabase.getName());
        jEmployee_ID.setText(employeeDatabase.getEmployee_id());
        jAge.setText(String.valueOf(employeeDatabase.getAge()));
        jGender.setText(employeeDatabase.getGender());
        jStart_Date.setText(employeeDatabase.getStart_date());
        jLevel.setText(employeeDatabase.getLevel());
        jTeam_Info.setText(employeeDatabase.getTeam_info());
        jPosition.setText(employeeDatabase.getPosition());
        jMobile.setText(String.valueOf(employeeDatabase.getMobile()));
        jEmail.setText(employeeDatabase.getEmail());
        //jPhoto.setText(employee.getPhoto());**/
    }
}