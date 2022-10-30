/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author smitiagrawal
 */
public class Community {

    public Community() {
    }

    public Community(String cname, int cid, String ccity, String cstate, int cpin, String ccountry) {
        this.cname = cname;
        this.cid = cid;
        this.ccity = ccity;
        this.cstate = cstate;
        this.cpin = cpin;
        this.ccountry = ccountry;
    }
    private String cname;
    private int cid;
    private String ccity;
    private String cstate;
    private int cpin;
    private String ccountry;
    private String housename;

    public String getHousename() {
        return housename;
    }

    public void setHousename(String housename) {
        this.housename = housename;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCcity() {
        return ccity;
    }

    public void setCcity(String ccity) {
        this.ccity = ccity;
    }

    public String getCstate() {
        return cstate;
    }

    public void setCstate(String cstate) {
        this.cstate = cstate;
    }

    public int getCpin() {
        return cpin;
    }

    public void setCpin(int cpin) {
        this.cpin = cpin;
    }

    public String getCcountry() {
        return ccountry;
    }

    public void setCcountry(String ccountry) {
        this.ccountry = ccountry;
    }
     @Override
    public String toString(){
        return cname;
    }
}
