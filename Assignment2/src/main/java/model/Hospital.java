/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shreyasrai
 */
public class Hospital {
   
    public Hospital() {
    }

    public Hospital(String hname, int hphone, String hemail, int hid, String hpswd, Community community) {
        this.hname = hname;
        this.hphone = hphone;
        this.hemail = hemail;
        this.hid = hid;
        this.hpswd = hpswd;
        this.community = community;
    }

    private String hname;
    private int hphone;
    private String hemail;
    private int hid;
    private String hpswd;
    private Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
   

    public String getHpswd() {
        return hpswd;
    }

    public void setHpswd(String hpswd) {
        this.hpswd = hpswd;
    }


    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public int gethPIN() {
        return community.getCpin();
    }

    public String getHcommunity() {
        return community.getCname();
    }

    public int getHphone() {
        return hphone;
    }

    public void setHphone(int hphone) {
        this.hphone = hphone;
    }

    public String getHemail() {
        return hemail;
    }

    public void setHemail(String hemail) {
        this.hemail = hemail;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHcity() {
        return community.getCcity();
    }

    public String getHstate() {
        return community.getCstate();
    }

    @Override
    public String toString(){
        return hname;
    }
    @Override
    public boolean equals(Object obj) {
        final Hospital h = (Hospital) obj;
        return this.hname.equals(h.hname) && this.hpswd.equals(h.hpswd);
    }
    
    
}
