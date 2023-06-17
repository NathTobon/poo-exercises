import java.util.Scanner;

import Entity.Account;
import Services.AccountServices;

public class Menu {
    public static void main(String[] args) {

        // EXERCISE 05
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the account number");
        int accountNumber = read.nextInt();
        System.out.println("Enter the client DNI");
        long clientDni = read.nextLong();
        System.out.println("Enter the current balance");
        int currentBalance = read.nextInt();

        // Instantiate services
        AccountServices accServices = new AccountServices();
        // Instantiate object
        Account account = accServices.createAccount(accountNumber, clientDni, currentBalance);
        System.out.println("Account successfully loaded");
        // Do methods
        boolean logOut = false;
        do {
            System.out.println("MENU");
            System.out.println("1. Make a deposit.");
            System.out.println("2. Make a withdrawal.");
            System.out.println("3. Make a fast withdrwal, 20% of your current balance.");
            System.out.println("4. Check the balance of your account.");
            System.out.println("5. Check all your account data.");
            System.out.println("6. Log out.");
            System.out.println("Enter your choice");
            int choiceInput = read.nextInt();
            switch (choiceInput) {
                case 1:
                    // Deposit money
                    System.out.println("Enter the amount that you want to deposit to your account");
                    double depositValue = read.nextDouble();
                    accServices.deposit(account, depositValue);
                    break;
                case 2:
                    // Withdraw money
                    System.out.println("Enter the amount that you want to withdraw from your account");
                    double withdrawValue = read.nextDouble();
                    accServices.withdraw(account, withdrawValue);
                    break;
                case 3:
                    // Fast withdrawal
                    System.out.println("The fast withdrawal will be applied to your account");
                    accServices.fastWithdraw(account);
                    break;

                case 4:
                    // Check the balance
                    currentBalance = accServices.checkBalance(account);
                    System.out.println("The current balance is: " + currentBalance);
                    break;

                case 5:
                    // Check the data
                    String accountData = accServices.checkData(account);
                    System.out.println("The saved data:\n" + accountData);
                    break;

                case 6:
                    // Log out
                    logOut = true;
                    break;
            }

        } while (logOut == false);

        read.close();
    }
}
