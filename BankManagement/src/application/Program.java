package application;

import entities.Client;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Create a bank account!");

            String name = "";
            do{
                System.out.print("Name: ");
                name = sc.nextLine().trim();

                if (!name.matches("[A-Za-zÀ-ÖØ-öø-ÿ\\\\s]+")){
                    System.out.println("Type a valid name.");
                    name = "";
                }

            } while (name.isEmpty());

            int id = -1;
            do{
                try {
                    System.out.print("Type an Id: ");
                    id = sc.nextInt();
                    if (id < 0){
                        System.out.println("Invalid id, try again.");

                    }
                } catch (InputMismatchException e ){
                        System.out.println("Invalid number, try again.");
                        id = -1;
                        sc.nextLine();
                }
            } while (id < 0);

            Client client = new Client(name, id);

            System.out.println("Account created!");
            System.out.println("Name: " + client.getName()  + " Id: " + client.getNumber());




            sc.close();


    }
}
