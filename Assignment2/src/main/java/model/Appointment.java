/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shreyasrai
 */
public class Appointment {

    public Appointment(String time, Community community, Hospital hospital, Doctor doctor, Patient person, VitalSign vitalsign) {
        this.time = time;
        this.community = community;
        this.hospital = hospital;
        this.doctor = doctor;
        this.person = person;
        this.vitalsign=vitalsign;
        //vital
    }
        public Appointment(String time, Community community, Hospital hospital, Doctor doctor, Patient person) {
        this.time = time;
        this.community = community;
        this.hospital = hospital;
        this.doctor = doctor;
        this.person = person;
        //vital
    }

    public Appointment() {
    }
    //private String com;
    //private String hos;
    //private String doc;
    private String time;
    //private String name;
       private Community community;
       private Hospital hospital;
       private Doctor doctor;
       private Patient person;
       private VitalSign vitalsign;

    public VitalSign getVitalsign() {
        if(vitalsign==null){
            return new VitalSign("0", "NA","NA","NA");
        }
        return vitalsign;
        
    }

    public void setVitalsign(VitalSign vitalsign) {
        this.vitalsign = vitalsign;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPerson() {
        return person;
    }

    public void setPerson(Patient person) {
        this.person = person;
    }
       

    
    
}
