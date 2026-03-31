/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    //stores gpa and address
    private double gpa;
    private String address;

    //initializes name, age, and GPA
    public Student(String name, short age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    //returns address
    @Override
    public String getAddress(){
        return address;
    }

    //sets address
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    //returns GPA
    public double getGpa() {
        return gpa;
    }

    //sets GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}