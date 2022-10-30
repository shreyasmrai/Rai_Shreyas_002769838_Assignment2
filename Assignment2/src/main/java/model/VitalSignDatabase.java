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
public class VitalSignDatabase extends javax.swing.JPanel {
    private ArrayList<VitalSign> vitalsign;
    
    public VitalSignDatabase() {
        this.vitalsign = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalSignDatabase() {
        return vitalsign;
    }

   
    public VitalSign addNewVitalSign(VitalSign newVital){
        vitalsign.add(newVital);
        return newVital;
    } 
    
        public VitalSign addNewVitalSign(){
        VitalSign newVital = new VitalSign();
        vitalsign.add(newVital);
        return newVital;
    } 
            public VitalSign getVitalSign(String vs) {
        for(VitalSign v: vitalsign){
            if(v.getVname().equals(vs)){
                return v;
            }
        }
        return null;
    } 

   
}
