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

		for (int i = 1; i <= 3; i++) {
			System.out.print("Type student grades: ");
			double gra = sc.nextDouble();
			list.add(gra);
		}
		System.out.println();

        Student stu = new Student(name, age, list);

		System.out.println("Student: ");
		System.out.println("Name: " + stu.getName());
		System.out.println("Age: " + stu.getAge());
		System.out.printf("Average grade:  %.2f%n", stu.avarageScore(list));

		sc.close();
	}

}
