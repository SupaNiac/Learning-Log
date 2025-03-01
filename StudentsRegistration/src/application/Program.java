package application;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String name = "";
		do {
				System.out.print("Type student name: ");
				name = sc.nextLine().trim();

				if (!name.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\s]+")) {
					System.out.println("Invalid name! Please enter only letters.");
					name = "";
				}
		} while (name.isEmpty());


		int age = -1;
		do {
			try {
				System.out.print("Type student age: ");
				age = sc.nextInt();

				if (age <= 0) {
					System.out.println("Invalid age, try again!");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, try again!");
				sc.nextLine();
			}
		} while (age <= 0);

		int q = -1;
		do {
			try {
				System.out.print("How many grades do you want to add? ");
				q = sc.nextInt();
				if (q <= 0) {
					System.out.println("Invalid number!");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("Invalid input, try again!");
				sc.nextLine();
			}
		} while (q <= 0);

		ArrayList<Double> grades = new ArrayList<>();
			for (int i = 0; i < q; i++) {
				double grade = -1;
				do {
					try {
						System.out.println("Type students grade " + (i + 1) + ":");
						grade = sc.nextDouble();

						if (grade < 0 || grade > 10) {
							System.out.println("Try a number between 0 and 10!");
						}
					}catch (InputMismatchException e) {
						System.out.println("Invalid input, try again!");
						sc.nextLine();
					}
				} while (grade < 0 || grade > 10);
				grades.add(grade);
			}

		System.out.println();

        Student stu = new Student(name, age, grades);

		System.out.println("Student: ");
		System.out.println("Name: " + stu.getName());
		System.out.println("Age: " + stu.getAge());

		if (stu.averageScore() <= 5){
			System.out.printf("Average grade:  %.2f%n - Failed.%n", stu.averageScore());
		}
		else {
			System.out.printf("Average grade:  %.2f%n - Passed.%n", stu.averageScore());
		}
		sc.close();
	}

}
