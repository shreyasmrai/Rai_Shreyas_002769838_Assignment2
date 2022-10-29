/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author smiti
 */
public class AppointmentDatabase {
        private ArrayList<Appointment> appointment;
    
    public AppointmentDatabase() {
        this.appointment = new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getAppointmentDatabase() {
        return appointment;
    }

    public void setDoctorDatabase(ArrayList<Appointment> appointment) {
        this.appointment = appointment;
    }
   
    public Appointment addNewAppointment(){
        Appointment newApp = new Appointment();
        appointment.add(newApp);
        return newApp;
    }
   
    public void deletedapp(Appointment a){
        appointment.remove(a);
    }
}
