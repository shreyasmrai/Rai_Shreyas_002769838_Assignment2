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
public class AppointmentDatabase {
        private ArrayList<Appointment> appointment;
    
    public AppointmentDatabase() {
        this.appointment = new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getAppointmentDatabase() {
        return appointment;
    }

    public ArrayList<Appointment> getAppointmentDatabase(Doctor doctor) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        for(Appointment a: appointment){
            if(a.getDoctor().equals(doctor)){
                appointments.add(a);
            }
        }
        return appointments;
    }

    public ArrayList<Appointment> getAppointmentDatabase(Patient person) {
        ArrayList<Appointment> appointments = new ArrayList<>();
        for(Appointment p: appointment){
            if(p.getPerson().equals(person)){
                appointments.add(p);
            }
        }
        return appointments;    }    

    public void setDoctorDatabase(ArrayList<Appointment> appointment) {
        this.appointment = appointment;
    }
   
    public Appointment addNewAppointment(){
        Appointment newApp = new Appointment();
        appointment.add(newApp);
        return newApp;
    }
    
    public Appointment addNewAppointment(Appointment newApp){
        appointment.add(newApp);
        return newApp;
    }
   
    public void deletedapp(Appointment a){
        appointment.remove(a);
    }
}
