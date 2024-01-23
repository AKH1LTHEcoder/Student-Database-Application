package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
	
		// Ask how many new students we want to add
		System.out.print( "INSTRUCTIONS: " +
				"\n 1. TURN ON CAPS LOCK" +
				"\n 2. ONLY TYPE THE COURSES DISPLAYED IN THE LIST" + 
				"\n 3. ONLY NUMBERS ARE ALLOWED TO ENTER ACADEMIC YEAR" +
				"\n 3. COST PER COURSE IS $600, ANY REMAINING FEE IS TO BE PAID BY AGAIN LOGINING TO THE WEBSITE" +
				"\n 4. ENTER THE CORRECT AMMOUNT TO BE PAID" +
				"\n 5. IF YOU FACE ANY PROBLEMS OR HAVE ANY QUESTIONS SEND A MAIL TO THE OFFCIAL INSTITUTE MAIL ID" +
				"\n Now you may Start the enrollment process.");
		System.out.print("\n Enter number of new student to enroll: ");
		Scanner in = new Scanner(System.in);
		int numofStudents = in.nextInt();
		Student[] students = new Student[numofStudents];
		
		// Create n number of new Students 
		for (int n = 0; n < numofStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTution();
			System.out.println(students[n].showInfo());
		}
		
		
	}	
	

}
