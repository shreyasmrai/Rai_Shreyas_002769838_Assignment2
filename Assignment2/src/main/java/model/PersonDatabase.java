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
public class PersonDatabase {
    private ArrayList<Person> person;
    
    public PersonDatabase() {
        this.person = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDatabase() {
        return person;
    }

    public void setDoctorDatabase(ArrayList<Person> person) {
        this.person = person;
    }
   
    public Person addNewPerson(){
        Person newPer = new Person();
        person.add(newPer);
        return newPer;
    }
   
    public void deletedper(Person p){
        person.remove(p);
    }
   
}
