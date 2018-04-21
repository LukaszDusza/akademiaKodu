package demo;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double balance;
    private int accountType;

    public  static final int CHECKING = 1;
    public static final int SAVINGS = 2 ;

    public BankAccount(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType = accountType;
    }


    //Argument branch jest prawdziwy, jezeli klient wykonuje transakcje w oddziale
    // falsz - jezeli w ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }


    public double withdraw(double amount, boolean branch) {

        if((amount > 500.00) && !branch) {
            throw new IllegalArgumentException();
        }

        balance-= amount;

        return balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public boolean isChecking() {
        return accountType ==  CHECKING;
      }
    }

