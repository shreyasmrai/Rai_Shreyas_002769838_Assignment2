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
public class HospitalDatabase {
    private ArrayList<Hospital> hospital;
    
    public HospitalDatabase() {
        this.hospital = new ArrayList<Hospital>();
    }

    public ArrayList<Hospital> getHospitalDatabase() {
        return hospital;
    }
    
    /*public Hospital getHospital(String username, String pswd){
        for(Hospital h: hospital){
            if(h.getHname().equals(username) && h.getHpswd().equals(pswd)){
                return h;
            }
        }
        return null;
    }*/
    
    public Hospital getHospi(String username, String pswd){
        for(Hospital h: hospital){
            if(h.getHname().equals(username) && h.getHpswd().equals(pswd)){
                return h;
            }
        }
        return null;
    }

    public void setHospitalDatabase(ArrayList<Hospital> hospital) {
        this.hospital = hospital;
    }
   
    public Hospital addNewHospital(){
        Hospital newHos = new Hospital();
        hospital.add(newHos);
        return newHos;
    }
   
    public void deletedhos(Hospital h){
        hospital.remove(h);
    }
}
