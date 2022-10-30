/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shreyasrai
 */
public class Patient {

    public Patient() {
    }

    public Patient(String pname, int page, String pgender, int pphone, String pemail, String pbg, int pw, int pid, String ppswd, Doctor doctor) {
        this.patientName = pname;
        this.patientAge = page;
        this.patientGender = pgender;
        this.patientPhone = pphone;
        this.patientEmail = pemail;
        this.patientBG = pbg;
        this.pw = pw;
        this.pid = pid;
        this.ppswd = ppswd;
        this.doctor = doctor;
    }

    public Patient(String pname, int page, String pgender, int pphone, String pemail, String pbg, int pw, int pid, String ppswd) {
        this.patientName = pname;
        this.patientAge = page;
        this.patientGender = pgender;
        this.patientPhone = pphone;
        this.patientEmail = pemail;
        this.patientBG = pbg;
        this.pw = pw;
        this.pid = pid;
        this.ppswd = ppswd;
        
    }
    private String patientName;
    private int patientAge;
    private String patientGender;
    private int patientPhone;
    private String patientEmail;
    private String patientBG;
    private int pw;
    private int pid;
    private String ppswd;
    private Doctor doctor;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getPpswd() {
        return ppswd;
    }

    public void setPpswd(String ppswd) {
        this.ppswd = ppswd;
    }


    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(int patientAge) {
        this.patientAge = patientAge;
    }

    public String getPatientGender() {
        return patientGender;
    }

    public void setPatientGender(String patientGender) {
        this.patientGender = patientGender;
    }

    public int getPatientPhone() {
        return patientPhone;
    }

    public void setPatientPhone(int patientPhone) {
        this.patientPhone = patientPhone;
    }

    public String getPatientEmail() {
        return patientEmail;
    }

    public void setPatientEmail(String patientEmail) {
        this.patientEmail = patientEmail;
    }

    public String getPatientBG() {
        return patientBG;
    }

    public void setPatientBG(String patientBG) {
        this.patientBG = patientBG;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
    @Override
    public String toString(){
        return patientName;
    }
    @Override
    public boolean equals(Object obj) {
        final Patient p = (Patient) obj;
        return this.patientName==p.patientName && this.ppswd==p.ppswd;
    }
}
