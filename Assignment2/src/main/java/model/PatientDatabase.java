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
public class PatientDatabase {
    private ArrayList<Patient> person;
    
    public PatientDatabase() {
        this.person = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPersonDatabase() {
        return person;
    }

    public void setPersonDatabase(ArrayList<Patient> person) {
        this.person = person;
    }
   
    public Patient addNewPerson(Patient newPer){
       // Patient newPer = new Patient();
        person.add(newPer);
        return newPer;
    }
        public Patient addNewPerson(){
        Patient newPer = new Patient();
        person.add(newPer);
        return newPer;
    }
   
    public void deletedper(Patient p){
        person.remove(p);
    }
    public ArrayList<Patient> getPerson(Doctor doctor) {
        ArrayList<Patient> persons=new ArrayList<>();
        for(Patient p: person){
            if(p.getDoctor().equals(doctor)){
                persons.add(p);
            }
        }
        return persons;
    }    
    
    public ArrayList<Patient> getPersons(String doctor) {
        ArrayList<Patient> persons=new ArrayList<>();
        for(Patient p: person){
            if(p.getDoctor().getDocname().equals(doctor)){
                persons.add(p);
            }
        }
        return persons;
    } 
    
    public Patient getPerson(String per) {
        for(Patient p: person){
            if(p.getPatientName().equals(per)){
                return p;
            }
        }
        return null;
    } 
    public Patient getPerson(String username, String pswd){
        for(Patient p: person){
            if(p.getPatientName().equals(username) && p.getPpswd().equals(pswd)){
                return p;
            }
        }
        return null;
    }
   
}
