import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount("XYZ", "BA0001");
        obj1.showMenu();
    }
}
class BankAccount {
    int balance; //money you have
    int previousTransaction; //last amount  withdrawn or deposited
    String customerName;
    String customerID;

    BankAccount(String cname, String cid) {
        //constructor
        customerName = cname;
        customerID = cid;

    }

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if (amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if(previousTransaction > 0) {
            System.out.println("Desposited: " + previousTransaction);
        }
        else if(previousTransaction < 0) {
            System.out.println("Withdrawn: " + previousTransaction);
        }
        else {
            System.out.println("There was no transaction.");
        }
    }

    void showMenu() {
        //this method will show the menu to user
        char option = '\0';
        Scanner scanner = new Scanner(System.in); //creating class Scanner
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerID);
        System.out.println("\n");

        do {
            System.out.println("=====================================================================");
            System.out.println("Enter an option");
            System.out.println("A. Check balance");
            System.out.println("B. Deposit");
            System.out.println("C. Withdraw");
            System.out.println("D. Previous transaction");
            System.out.println("E. Exit");
            System.out.println("=====================================================================");
            option = scanner.next().charAt(0); //user will enter something we will read
            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("=====================================================================");
                    System.out.println("Balance = " + balance);
                    System.out.println("=====================================================================");
                    System.out.printf("\n");
                    break;

                case 'B':
                    System.out.println("=====================================================================");
                    System.out.println("Enter an amount to  deposit: ");
                    System.out.println("=====================================================================");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("=====================================================================");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("=====================================================================");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("=====================================================================");
                    getPreviousTransaction();
                    System.out.println("=====================================================================");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("=====================================================================");
                    break;

                default:
                    System.out.println("Wrong option! Please enter the letter again.");
                    break;
            }
        }
        while(option != 'E');
        System.out.println("Thank you for using our seevices.");
    }
}