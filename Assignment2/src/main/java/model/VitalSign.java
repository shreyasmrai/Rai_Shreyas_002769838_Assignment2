/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shreyasrai
 */
public class VitalSign {

    public VitalSign(String vid, String vname, String symptoms, String severity) {
        this.vid = vid;
        this.vname = vname;
        this.symptoms = symptoms;
        this.severity = severity;
    }

    public VitalSign() {
    }
    private String vid;
    private String vname;
    private String symptoms;
    private String severity;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getSeverity() {
        return severity;
    }
    
    @Override
    public String toString(){
        return vname;
    }
    public void setSeverity(String severity) {
        this.severity = severity;
    }


    
}
