package studentdatabaseapp;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class StudentDatabaseApp {
	
	public static void main(String[] args) {
		// Ask how many users we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents]; 
		
		// create n number of new students
		for (int n=0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].viewBalance();
			students[n].payTuition();
		}
		System.out.println("\nSTUDENT DIRECTORY: \n----------------- \n");
		for (int n=0; n < numOfStudents; n++) {
		System.out.println(students[n].toString());
		System.out.println("\n----------------- \n ");
		}
	}

}
