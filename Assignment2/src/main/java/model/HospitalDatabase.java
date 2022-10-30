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

    public void setHospitalDatabase(ArrayList<Hospital> hospital) {
        this.hospital = hospital;
    }
   
    public Hospital addNewHospital(Hospital newHos){
      //  Hospital newHos = new Hospital();
        hospital.add(newHos);
        return newHos;
    }
        public Hospital addNewHospital(){
        Hospital newHos = new Hospital();
        hospital.add(newHos);
        return newHos;
    }

    public ArrayList<Hospital> getHospital(Community community) {
        ArrayList<Hospital> hospital=new ArrayList<>();
        for(Hospital h: hospital){
            if(h.getCommunity().equals(community)){
                hospital.add(h);
            }
        }
        return hospital;
    }
       public ArrayList<Hospital> getHospital(int cpin) {
        ArrayList<Hospital> hospital=new ArrayList<>();
        for(Hospital h: hospital){
            if(h.getCommunity().getCpin()==cpin){
                hospital.add(h);
            }
        }
        return hospital;
    }
    
    public ArrayList<Hospital> getHospitals(String community) {
        ArrayList<Hospital> hospitals=new ArrayList<>();
        for(Hospital h: hospital){
            if(h.getCommunity().getCname().equals(community)){
                hospitals.add(h);
            }
        }
        return hospitals;
    }    
    
    public Hospital getHospital(String hos) {
        for(Hospital h: hospital){
            if(h.getHname().equals(hos)){
                return h;
            }
        }
        return null;
    } 
   
    public void deletedhos(Hospital h){
        hospital.remove(h);
    }
    public Hospital getHospital(String username, String pswd){
        for(Hospital h: hospital){
            if(h.getHname().equals(username) && h.getHpswd().equals(pswd)){
                return h;
            }
        }
        return null;
    }
}
