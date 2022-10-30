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
   
    public Doctor addNewDoctor(Doctor newDoc){
        //Doctor newDoc = new Doctor();
        doctor.add(newDoc);
        return newDoc;
    }
    public Doctor addNewDoctor(){
        Doctor newDoc = new Doctor();
        doctor.add(newDoc);
        return newDoc;
    }
    public ArrayList<Doctor> getDoctor(Hospital hospital) {
        ArrayList<Doctor> doctors=new ArrayList<>();
        for(Doctor d: doctor){
            if(d.getHospital().equals(hospital)){
                doctors.add(d);
            }
        }
        return doctors;
    }    
    
    public ArrayList<Doctor> getDoctors(String hospital) {
        ArrayList<Doctor> doctors=new ArrayList<>();
        for(Doctor d: doctor){
            if(d.getHospital().getHname().equals(hospital)){
                doctors.add(d);
            }
        }
        return doctors;
    }    
    
    public Doctor getDoctor(String doc) {
        for(Doctor d: doctor){
            if(d.getDocname().equals(doc)){
                return d;
            }
        }
        return null;
    } 
   
    public void deletedoc(Doctor d){
        doctor.remove(d);
    }
        public Doctor getDoctor(String username, String pswd){
        for(Doctor d: doctor){
            if(d.getDocname().equals(username) && d.getDpswd().equals(pswd)){
                return d;
            }
        }
        return null;
    }
   
}
