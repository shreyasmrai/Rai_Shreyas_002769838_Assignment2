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
public class EmployeeDatabase {
  private ArrayList<Employee> employeeDatabase;
    
    public EmployeeDatabase() {
        this.employeeDatabase = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeDatabase() {
        return employeeDatabase;
    }

    public void setEmployeeDatabase(ArrayList<Employee> employeeDatabase) {
        this.employeeDatabase = employeeDatabase;
    }
    public Employee addNewEmployee(){
        Employee newEmployee = new Employee();
        employeeDatabase.add(newEmployee);
        return newEmployee;
    }
   
    public void deleteemp(Employee emp){
        employeeDatabase.remove(emp);
    }
}
