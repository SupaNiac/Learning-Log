package application;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		ArrayList<Double> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Type student name: ");
		String name = sc.nextLine();
		
		System.out.print("Type student age: ");
		int age = sc.nextInt();
		
		System.out.print("Type student grades: ");
		double gra = sc.nextDouble();
		
		Student stu = new Student(name, age, gra);

		System.out.println("Student: ");
		System.out.println("Name: " + stu.getName());
		System.out.println("Age: " + stu.getAge());
		for (int i = 0; i == 3; i++) {
			System.out.println("Grades: " + list.add(stu.getGrades()));
		}
		sc.close();
	}

}
