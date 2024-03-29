/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shreyasrai
 */
public class Doctor extends Appointment {

    public Doctor() {
    }

    public Doctor(String docname, String docphone, String docemail, String docgender, String docage, String docspeciality, String docexperience, int did, String dpswd, Hospital hospital) {
        this.docname = docname;
        this.docphone = docphone;
        this.docemail = docemail;
        this.docgender = docgender;
        this.docage = docage;
        this.docspeciality = docspeciality;
        this.docexperience = docexperience;
        this.did = did;
        this.dpswd = dpswd;
        this.hospital = hospital;
    }

    
    private String docname;
    private String docphone;
    private String docemail;
    private String docgender;
    private String docage;
    private String docspeciality;
    private String docexperience;
    private int did;
    private String dpswd;
    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public String getDpswd() {
        return dpswd;
    }

    public void setDpswd(String dpswd) {
        this.dpswd = dpswd;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }
    
    public String getDocage() {
        return docage;
    }

    public void setDocage(String docage) {
        this.docage = docage;
    }

    public String getDocspeciality() {
        return docspeciality;
    }

    public void setDocspeciality(String docspeciality) {
        this.docspeciality = docspeciality;
    }

    public String getDocexperience() {
        return docexperience;
    }

    public void setDocexperience(String docexperience) {
        this.docexperience = docexperience;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname;
    }

//    public String getDochospital() {
//        return hospital.getHname();
//    }

    public String getDocphone() {
        return docphone;
    }

    public void setDocphone(String docphone) {
        this.docphone = docphone;
    }

    public String getDocemail() {
        return docemail;
    }

    public void setDocemail(String docemail) {
        this.docemail = docemail;
    }

    public String getDocgender() {
        return docgender;
    }

    public void setDocgender(String docgender) {
        this.docgender = docgender;
    }
    
    @Override
    public String toString(){
        return docname;
    }
        @Override
    public boolean equals(Object obj) {
        final Doctor d = (Doctor) obj;
        return this.docname==d.docname && this.dpswd==d.dpswd;
    }
}

