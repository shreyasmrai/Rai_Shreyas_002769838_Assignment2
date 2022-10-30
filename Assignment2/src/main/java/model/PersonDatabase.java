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
   
    public Person addNewPerson(Person newPer){
       // Person newPer = new Person();
        person.add(newPer);
        return newPer;
    }
        public Person addNewPerson(){
        Person newPer = new Person();
        person.add(newPer);
        return newPer;
    }
   
    public void deletedper(Person p){
        person.remove(p);
    }
    public ArrayList<Person> getPerson(Doctor doctor) {
        ArrayList<Person> persons=new ArrayList<>();
        for(Person p: person){
            if(p.getDoctor().equals(doctor)){
                persons.add(p);
            }
        }
        return persons;
    }    
    
    public ArrayList<Person> getPersons(String doctor) {
        ArrayList<Person> persons=new ArrayList<>();
        for(Person p: person){
            if(p.getDoctor().getDocname().equals(doctor)){
                persons.add(p);
            }
        }
        return persons;
    } 
    
    public Person getPerson(String per) {
        for(Person p: person){
            if(p.getPname().equals(per)){
                return p;
            }
        }
        return null;
    } 
    public Person getPerson(String username, String pswd){
        for(Person p: person){
            if(p.getPname().equals(username) && p.getPpswd().equals(pswd)){
                return p;
            }
        }
        return null;
    }
   
}
