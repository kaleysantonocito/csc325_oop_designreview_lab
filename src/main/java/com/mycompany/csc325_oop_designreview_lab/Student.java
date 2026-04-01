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
    //stores gpa, address, and credits
    private double gpa;
    private String address;
    private int credits;

    //initializes name, age, and GPA
    public Student(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
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

    //returns credits
    public double getCredits(int credits) {
        return credits;
    }

    //set credits
    public void setCredits(int credits) {
        this.credits = credits;
    }

    //return student info
    @Override
    public String toString() {
        return "Student name: " + getName() + ", age: " + getAge() + ",credits: " + credits + ", GPA: " + getGpa();
    }
}