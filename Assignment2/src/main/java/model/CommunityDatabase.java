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
public class CommunityDatabase {
    private ArrayList<Community> community;
    
    public CommunityDatabase() {
        this.community = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityDatabase() {
        return community;
    }

    public void setDoctorDatabase(ArrayList<Community> community) {
        this.community = community;
    }
   
    public Community addNewDoctor(){
        Community newCom = new Community();
        community.add(newCom);
        return newCom;
    }
   
    public void deletedper(Community c){
        community.remove(c);
    }
}
