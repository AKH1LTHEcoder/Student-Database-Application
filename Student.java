package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int acadYear;
	private String studentID;
	private String courses = "";
	private int tuitionFee = 0;
	private static int costOfCourse = 600; //FYI: static means its true for all objects not just one. 
	private static int id = 1000; 
	
	
	// Constructor: prompt user to enter student's name and year 
	public Student() {		
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter Student's first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Student's last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen(1st year)\n2 - Sophmore(2nd year)\n3 - Pre Final Year(3rd year)\n4 - Senior(4th year)\nEnter Student's Academic Year: ");
		this.acadYear = in.nextInt();
		
		setstudentID();
		
		
		
	} 
	
	// Generate an ID
	private void setstudentID() {
		// Academic Year + ID 
		id++;
		this.studentID = acadYear + "" + id;
		
		
	}
	
	// Enroll in courses 
	public void enroll() {
		// Inside of a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (press Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionFee = tuitionFee + costOfCourse;
			}
			else { break; }
		}	while (1 != 0);
		
		System.out.println("Selected Courses: "+ courses);
		System.out.println("TOTAL TUITION FEE: " + tuitionFee + "($600 per course)"); 
		
	}
	
	
	
	// Pay Tuition fee
	public void payTution() {
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionFee = tuitionFee - payment;
		System.out.println("PAYMENT SUCCESSFUL OF: $" +payment);
	}
		
		
	
	// Show status 
	public String showInfo() {
		return "FINAL CHECKOUT" +
				"\n Name: " + firstName + " " + lastName + 
				"\n Academic Year: " + acadYear +
				"\n Student ID: " + studentID +
				"\n Courses Enrolled: " +    courses + 
				"\n Remaining Fees to be paid: " + tuitionFee;
	}

}
