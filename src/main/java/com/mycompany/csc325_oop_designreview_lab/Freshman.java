package com.mycompany.csc325_oop_designreview_lab;

// Freshman class inherits from Student
public class Freshman extends Student {
    public Freshman(String name, short age, int credits) {
        super(name, age, credits);
    }

    //returns freshman into as a string
    @Override
    public String toString() {
        return "Freshman student: " + getName() + ", age: " + getAge() + ", credits: " + getCredits() + ", GPA: " + getGpa();
    }
}
