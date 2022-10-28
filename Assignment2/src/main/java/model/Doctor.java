/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shreyasrai
 */
public class Doctor {

    
    private String docname;
    private String dochospital;
    private String docphone;
    private String docemail;
    private String docgender;
    private String docage;
    private String docspeciality;
    private String docexperience;
    private int did;
    private String dpswd;

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

    public String getDochospital() {
        return dochospital;
    }

    public void setDochospital(String dochospital) {
        this.dochospital = dochospital;
    }

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
