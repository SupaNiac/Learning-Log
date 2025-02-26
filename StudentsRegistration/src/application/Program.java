package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type student name: ");
		String name = sc.nextLine();
		
		System.out.print("Type student age: ");
		int age = sc.nextInt();

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
