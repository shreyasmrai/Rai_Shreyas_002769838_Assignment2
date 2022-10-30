/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shreyasrai
 */
public class Person {

    public Person() {
    }

    public Person(String pname, int page, String pgender, int pphone, String pemail, String pbg, int pw, int pid, String ppswd, Doctor doctor) {
        this.pname = pname;
        this.page = page;
        this.pgender = pgender;
        this.pphone = pphone;
        this.pemail = pemail;
        this.pbg = pbg;
        this.pw = pw;
        this.pid = pid;
        this.ppswd = ppswd;
        this.doctor = doctor;
    }

    public Person(String pname, int page, String pgender, int pphone, String pemail, String pbg, int pw, int pid, String ppswd) {
        this.pname = pname;
        this.page = page;
        this.pgender = pgender;
        this.pphone = pphone;
        this.pemail = pemail;
        this.pbg = pbg;
        this.pw = pw;
        this.pid = pid;
        this.ppswd = ppswd;
        
    }
    private String pname;
    private int page;
    private String pgender;
    private int pphone;
    private String pemail;
    private String pbg;
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


    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getPgender() {
        return pgender;
    }

    public void setPgender(String pgender) {
        this.pgender = pgender;
    }

    public int getPphone() {
        return pphone;
    }

    public void setPphone(int pphone) {
        this.pphone = pphone;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public String getPbg() {
        return pbg;
    }

    public void setPbg(String pbg) {
        this.pbg = pbg;
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
        return pname;
    }
    @Override
    public boolean equals(Object obj) {
        final Person p = (Person) obj;
        return this.pname==p.pname && this.ppswd==p.ppswd;
    }
}
