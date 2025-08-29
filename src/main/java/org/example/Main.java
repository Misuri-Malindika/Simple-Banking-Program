package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //Declaring variables
        double balance= 0;
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
                case 1-> showBalance(balance);
                case 2-> balance = balance + deposit();
                case 3-> System.out.println("Withdraw");
                case 4-> isRunning = false;
                default -> System.out.println("Invalid choice.");

            }

        }

        //withdraw()

        //Exit Message

        scanner.close();
    }
    //showBalance()
   static void showBalance(double balance){
       System.out.println("****************");
        System.out.printf("$%.2f\n", balance);
    }
    //deposit()
   static double deposit() {
       double amount;

       System.out.print("Enter amount to deposit: ");
       amount = scanner.nextDouble();

       if (amount <= 0) {
           System.out.println("Amount can not be zero or negative.");
           return amount;
       } else {
           return amount;
       }
   }
}