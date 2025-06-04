
/*A super class Bank has been defined to store the details of a customer. Define a sub-class Account that enables transactions for the customer with the bank. The details of both the classes are given below:
Class name: Bank
stores the name of the customer
Data member/instance variable:
 Name:Stores the name of the customer
accno: stores the account number
p:stores the principal amount in decimals

Member functions/methods:
Bank(...)
parameterized constructor to assign values to the instance variables
void display()
displays the details of the customer
Class name: Account
Data member/instance variable:
 Amt: Strores the transaction amount in decimals

Member functions/methods: 
Account(...)
parameterized constructor to assign values to the instance variables of both the classes
void deposit()
accepts the amount and updates the principal as p=p+amt
void withdraw)
accepts the amount and updates the principal as p=p-amt
void display()
Displays the details of the customer.
*/
import java.util.Scanner;

public class Account extends Bank {
    double amt;

    public Account(String n, String a, double pr, double am) {
        super(n, a, pr);
        amt = am;
    }

    public void deposit() {
        p = p + amt;
    }

    public void withdraw() {
        if (amt > p) {
            System.out.println("Insufficient Balance");

        } else {
            p = p - amt;
            if (p < 500) {
                p = p - (500 - p) / 10;
            }

        }
    }

    public void display() {
        super.display();
        System.out.println("Amount to be deposited/withdraw " + amt);
        System.out.println("Amount after amount deposited/withdraw " + p);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String n = sc.nextLine();
        System.out.println("Enter account number");
        String ac = sc.nextLine();
        System.out.println("Enter principal amount");
        double pr = sc.nextInt();
        System.out.println("Enter 1 for deposit and 2 for withdraw");
        int i = sc.nextInt();
        int a;

        if (i == 1) {
            System.out.println("Enter amount to be deposited");
            a = sc.nextInt();
            Account obj = new Account(n, ac, pr, a);
            obj.deposit();
            obj.display();
        } else if (i == 2) {
            System.out.println("Enter amount to be withdraw");
            a = sc.nextInt();
            Account obj = new Account(n, ac, pr, a);
            obj.withdraw();
            obj.display();
        } else {
            System.out.println("INVALID INPUT");
        }
    }
}
