import java.util.*;
import java.time.*;

public class Account {

    // data member
    private int id;
    private double balance;
    private static double annualInterestRate = 7.0;
    private Date accoutCreatedDate;

    // default constructor for intialize Account with some specifice value.
    public Account() {
        this.id = 0;
        this.balance = 500.0;
        this.accoutCreatedDate = new Date();
    }

    // parameterized constructor for intialize Account with some specifice value.
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.accoutCreatedDate = new Date();
    }

    // set id for account
    public void setId(int id) {
        this.id = id;
    }

    // set balance of account
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // set interest rate for all the accounts.
    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    // get account id
    public int getId() {
        return id;
    }

    // get account balance
    public double getBalance() {
        return balance;
    }

    // get interest rate for the all accounts
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // get date of account creation
    public Date getaccoutCreatedDate() {
        return accoutCreatedDate;
    }

    // get monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // get monthly interest.
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    // withdrawal function
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }

    // deposite function.
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // saw account information.
    public void displayAccountDetails() {
        System.out.println("Account ID: " + id);
        System.out.println("Balance: " + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
        System.out.println("Date Created: " + accoutCreatedDate);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to create new Account.");
        System.out.println("Enetr 2 to withdraw amount.");
        System.out.println("Enter 3 to deposit amount.");
        System.out.println("Enter 4 to display Account details.");
        System.out.println("Enter 5 to Exit  Appilication.");
        System.out.println("");

        System.out.println("");

        // Vector<Account> vector = new Vector<>();
        Account[] accounts = new Account[500];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account();
        }

        int AccountNo = 0;

        int choice = 0;
        boolean isExit = false;

        do {

            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Account defaultAccount = new Account();
                    accounts[AccountNo] = new Account();

                    System.out.println("Enter Account ID : ");
                    int newId = sc.nextInt();

                    System.out.println("Enter Account Balance(500 is already in account!) : ");
                    double newBalance = sc.nextDouble();

                    accounts[AccountNo] = new Account(newId, newBalance + 500);

                    AccountNo++;
                    break;

                case 2:

                    System.out.print("Enter Account Id : ");
                    int id = sc.nextInt();

                    for (Account account : accounts) {

                        if (id == account.getId()) {
                            System.out.println("Enter Amount to withdraw : ");
                            double amount = sc.nextDouble();
                            account.withdraw(amount);
                            break;
                        } else {
                            System.out.println("Account not found");
                        }

                    }

                    break;

                case 3:

                    System.out.print("Enetr Account Id : ");
                    int DepositeID = sc.nextInt();
                    for (Account account : accounts) {
                        if (DepositeID == account.getId()) {
                            System.out.println("Enter Amount to deposit : ");
                            double amount = sc.nextDouble();
                            account.deposit(amount);
                            break;
                        } else {
                            System.out.println("Account not found");
                        }
                    }

                    break;

                case 4:

                    System.out.println("Enter Account Id : ");
                    int informationID = sc.nextInt();
                    for (Account account : accounts) {
                        if (informationID == account.getId()) {
                            System.out.println("Account Details : ");
                            System.out.println("");
                            account.displayAccountDetails();
                        }
                    }

                    break;

                case 5:
                    isExit = true;

                default:
                    break;
            }

        } while (!isExit);

        // System.out.print("Enter your choice : ");
        // choice=sc.nextInt();

        // switch (choice) {

        // case 1:
        // // Account defaultAccount = new Account();
        // accounts[AccountNo]=new Account();

        // System.out.println("Enter Account ID : ");
        // int newId=sc.nextInt();

        // System.out.println("Enter Account Balance(500 is already in account!) : ");
        // double newBalance=sc.nextDouble();

        // accounts[AccountNo]= new Account(newId,newBalance);

        // AccountNo++;
        // break;

        // case 2:

        // System.out.print("Enter Account Id : ");
        // int id=sc.nextInt();

        // for(Account account : accounts){

        // if(id==account.getId())
        // {
        // System.out.println("Enter Amount to withdraw : ");
        // double amount=sc.nextDouble();
        // account.withdraw(amount);
        // break;
        // }
        // else{
        // System.out.println("Account not found");
        // }

        // }

        // break;

        // case 3:

        // System.out.print("Enetr Account Id : ");
        // int DepositeID =sc.nextInt();
        // for(Account account : accounts){
        // if(DepositeID==account.getId())
        // {
        // System.out.println("Enter Amount to deposit : ");
        // double amount=sc.nextDouble();
        // account.deposit(amount);
        // break;
        // }
        // else{
        // System.out.println("Account not found");
        // }
        // }

        // break;

        // case 4:

        // System.out.println("Enter Account Id : ");
        // int informationID=sc.nextInt();
        // for(Account account : accounts){
        // if(informationID==account.getId())
        // {
        // System.out.println("Account Details : ");
        // System.out.println("");
        // account.displayAccountDetails();
        // }
        // }

        // break;

        // case 5:
        // isExit=true;

        // default:
        // break;
        // }

    }

}
