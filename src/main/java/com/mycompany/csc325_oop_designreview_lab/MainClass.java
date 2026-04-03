/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 // create scanner to take in user input
	 Scanner scnr = new Scanner(System.in);

	 	//create objects for student, freshman, and senior
	 	Student std1= new Student("James", (short)20, 30);
		Student std2 = new Freshman("James", (short)20, 12); // name, age, credits
	 	Student std3 = new Senior("John", (short)30, 90);

		// ask user input for each student GPA and set it using setter method
	 	System.out.println("Enter GPA for student 1: ");
		std1.setGpa(scnr.nextDouble());

		System.out.println("Enter GPA for student 2: ");
		std2.setGpa(scnr.nextDouble());

		System.out.println("Enter GPA for student 3: ");
		std3.setGpa(scnr.nextDouble());

		//print all student info
		System.out.println(std1);
		System.out.println(std2);
	 	System.out.println(std3);

	}

}

