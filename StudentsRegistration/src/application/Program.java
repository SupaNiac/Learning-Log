package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Type student name: ");
		String name = sc.nextLine();

		int age = -1;
		do {
			try {
				System.out.print("Type student age: ");
				age = sc.nextInt();

				if (age <= 0) {
					System.out.println("Invalid age, try again!");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input, try again!");
				sc.nextLine();
			}
		} while (age <= 0) ;

		ArrayList<Double> grades = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			System.out.print("Type student grades " + i + ":");
			double grade = sc.nextDouble();
			grades.add(grade);
		}
		System.out.println();

        Student stu = new Student(name, age, grades);

		System.out.println("Student: ");
		System.out.println("Name: " + stu.getName());
		System.out.println("Age: " + stu.getAge());
		System.out.printf("Average grade:  %.2f%n", stu.averageScore());

		sc.close();
	}

}
