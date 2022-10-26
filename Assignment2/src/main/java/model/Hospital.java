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
    private String hname;
    private int hPIN;
    private String hcommunity;
    private int hphone;
    private String hemail;
    private int hid;
    private String hcity;
    private String hstate;

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public int gethPIN() {
        return hPIN;
    }

    public void sethPIN(int hPIN) {
        this.hPIN = hPIN;
    }

    public String getHcommunity() {
        return hcommunity;
    }

    public void setHcommunity(String hcommunity) {
        this.hcommunity = hcommunity;
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
        return hcity;
    }

    public void setHcity(String hcity) {
        this.hcity = hcity;
    }

    public String getHstate() {
        return hstate;
    }

    public void setHstate(String hstate) {
        this.hstate = hstate;
    }
    
    
    @Override
    public String toString(){
        return hname;
    }
    
    
}
