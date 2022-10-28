/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shreyasrai
 */
public class DoctorDatabase extends javax.swing.JPanel {
    private ArrayList<Doctor> doctor;
    
    public DoctorDatabase() {
        this.doctor = new ArrayList<Doctor>();
    }

    public ArrayList<Doctor> getDoctorDatabase() {
        return doctor;
    }

    public void setDoctorDatabase(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }
    
    public Doctor getDoctor(String username, String pswd){
        for(Doctor d: doctor){
            if(d.getDocname().equals(username) && d.getDpswd().equals(pswd)){
                return d;
            }
        }
        return null;
    }
   
    public Doctor addNewDoctor(){
        Doctor newDoc = new Doctor();
        doctor.add(newDoc);
        return newDoc;
    }
   
    public void deletedoc(Doctor d){
        doctor.remove(d);
    }
   
}
