/**
 * @author Mai Duong
 * @version 3.0
 * Course: Funsies
 * Written: July 2025
 *
 * Purpose: Simulates a banking system that can shows balance, deposit, and withdraw.
 */

import java.util.Scanner;

public class BankingSystem {
    static Scanner scanner = new Scanner(System.in);

    // Shows Balance
    static void showBalance(double balance) {
        System.out.printf("$%.2f", balance);
    }

    //Allows user to deposit
    static double deposit (){
        double amount;
        System.out.print("Enter an amount to be deposit: ");
        amount = scanner.nextDouble();

        if(amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    //Allows user to withdraw
    static double withdraw (double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = scanner.nextDouble();
        if(amount > balance) {
            System.out.print("Insufficient funds");
            return 0;
        } else if(amount < 0) {
            System.out.print("Amount can't be negative");
            return 0;
        } else {
            return amount;
        }
    }

    public static void main(String[] args) {
        //Variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

        //Show Choices
        while (isRunning) {
            System.out.println();
            System.out.println("Banking Program");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");


            // Get User Choices
            System.out.print("Enter your choice(1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += balance + deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Choose Again!");
            }
        }
        scanner.close();
    }

}

