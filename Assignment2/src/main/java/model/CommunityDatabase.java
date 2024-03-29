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
    public Community getCommunity(String comm) {
        for(Community c: community){
            if(c.getCname().equals(comm)){
            return c;
        }
        }
        return null;
    }

    public void setDoctorDatabase(ArrayList<Community> community) {
        this.community = community;
    }
   
    public Community addNewCommunity(Community newCom){
        //Community newCom = new Community();
        community.add(newCom);
        return newCom;
    }
        public Community addNewCommunity(){
        Community newCom = new Community("Dorchester", 3, "Boston", "MA", "02119", "USA");
        community.add(newCom);
        return newCom;
    }
   
    public void deletedcom(Community c){
        community.remove(c);
    }
}
