package application;

import java.util.Scanner;

public class Program {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Create a bank account!");

            String name = "";
            do{
                System.out.print("Name: ");
                name = sc.nextLine().trim();
                if (name.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\\\s]+")){
                    System.out.println("Type a valid name.");
                    name = "";
                }

            } while (name.isEmpty());



    }
}
