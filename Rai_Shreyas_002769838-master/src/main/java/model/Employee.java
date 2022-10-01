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
public class Employee {
    private String name;
    private String employee_id;
    private int age;
    private String gender;
    private String team_info;
    private String position;
    private int mobile;
    private String email;
    private String start_date;
    private String image;
    /**private String imagePath;
    //private photo;

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }**/

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeam_info() {
        return team_info;
    }

    public void setTeam_info(String team_info) {
        this.team_info = team_info;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }
    private String level;
    
    @Override
    public String toString(){
        return name;
    }
}
