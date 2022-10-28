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

    public void setPersonDatabase(ArrayList<Person> person) {
        this.person = person;
    }
    
    //public boolean validatePerson(Person p){
    //    return person.contains(p);
    //}
    
    public Person getPerson(String username, String pswd){
        for(Person p: person){
            if(p.getPname().equals(username) && p.getPpswd().equals(pswd)){
                return p;
            }
        }
        return null;
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
