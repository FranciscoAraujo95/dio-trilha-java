package entities;

/**
 * <h1>Bank Account</h1>
 * <p>This program will simulate a bank account, we can inform the number, agency, holder and balance of the account to make some tests and see how the basic works</p>
 *
 * @author Francisco Arauio
 * @version 1.0
 * @since 08/08/2024
 */

public class AccountTerminal {

    //Class attributes
    private int number;
    private String agency, holder;
    private double balance;

    //Empty constructor
    public AccountTerminal() {
    }

    /**
     * <h2>These are the parameters of the account</h2>
     * <p>Parameters being used by the constructor</p>
     *
     * @param number  Define the number of the account
     * @param agency  Define the number of the agency
     * @param holder  Define the holder of the account
     * @param balance Define the balance of the account
     */
    public AccountTerminal(int number, String agency, String holder, double balance) {
        this.number = number;
        this.agency = agency;
        this.holder = holder;
        this.balance = balance;
    }

    //Getters & Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //toString method
    public String toString() {
        return "Hello "
                + getHolder()
                + ", thanks for opening an account in our bank, your agency is "
                + getAgency()
                + ",\n your account number is "
                + getNumber()
                + " and your balance $"
                + String.format("%.2f", getBalance())
                + " it is now available for withdraw.";
    }
}
