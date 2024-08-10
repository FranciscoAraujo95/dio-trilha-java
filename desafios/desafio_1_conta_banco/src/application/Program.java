package application;

import entities.AccountTerminal;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        //Defining system localization and instantiating the Scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Capturing the user input via terminal
        System.out.print("Please enter your account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Please enter your agency number: ");
        sc.nextLine();
        String agencyNumber = sc.nextLine();
        System.out.print("Please enter the account holder: ");
        String accountHolder = sc.nextLine();
        System.out.print("Please enter your initial balance: ");
        double accountBalance = sc.nextDouble();

        //Instantiating the new account using the variables from above
        AccountTerminal account = new AccountTerminal(accountNumber, agencyNumber, accountHolder, accountBalance);

        //Printing the results on the console
        System.out.println();
        System.out.println(account);

        //Closing the scanner
        sc.close();

    }
}