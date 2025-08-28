package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Declaring variables

        Scanner scanner = new Scanner(System.in);
        double balance;
        boolean isRunning = true;
        int choice;

        //Display Menu

        while (isRunning){
            System.out.println("*******************");
            System.out.println("Banking System");
            System.out.println("*******************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*******************");

            //Get and Process User Choice

            System.out.print("Enter your choice:(1-4) ");
            choice = scanner.nextInt();

            switch (choice){
                case 1-> System.out.println("Show Balance");
                case 2-> System.out.println("Deposit");
                case 3-> System.out.println("Withdraw");
                case 4-> isRunning = false;
                default -> System.out.println("Invalid choice. Please try again.");

            }

        }



        //showBalance()

        //deposit()

        //withdraw()

        //Exit Message

        scanner.close();




    }
}