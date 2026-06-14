package org.example;

import java.util.Scanner;

class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance.");
        }
        else {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
        }
    }

    void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
}

 class ATMInterface {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(10000);

        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                account.checkBalance();
            }
            else if (choice == 2) {
                System.out.print("Enter deposit amount: ");
                double amount = sc.nextDouble();
                account.deposit(amount);
            }
            else if (choice == 3) {
                System.out.print("Enter withdraw amount: ");
                double amount = sc.nextDouble();
                account.withdraw(amount);
            }
            else if (choice == 4) {
                System.out.println("Thank you for using ATM.");
            }
            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
