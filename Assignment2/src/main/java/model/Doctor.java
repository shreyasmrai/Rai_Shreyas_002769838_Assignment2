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
public class Doctor extends javax.swing.JPanel {
    private ArrayList<Person> doctor;
    
    public Doctor() {
        this.doctor = new ArrayList<Person>();
    }

    public ArrayList<Person> getEmployeeDatabase() {
        return doctor;
    }

    public void setEmployeeDatabase(ArrayList<Person> employeeDatabase) {
        this.doctor = employeeDatabase;
    }
    public Person addNewEmployee(){
        Person newPerson = new Person();
        doctor.add(newPerson);
        return newPerson;
    }
   
    public void deleteemp(Person p){
        doctor.remove(p);
    }
}
