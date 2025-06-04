
/*
A superclass Number is defined to calculate the factorial of a number. Define a subclass Series to find the sum of the series S = 1! + 2! + 3! + 4! + ………. + n! [5]
The details of the members of both classes are given below:
Class name: Number
Data member/instance variable:
n: to store an integer number
Member functions/methods:
Number(int nn): parameterized constructor to initialize the data member n=nn
int factorial(int a): returns the factorial of a number
(factorial of n = 1 × 2 × 3 × …… × n)
void display()
Class name: Series
Data member/instance variable:
sum: to store the sum of the series
Member functions/methods:
Series(…) : parameterized constructor to initialize the data members of both the classes
void calsum(): calculates the sum of the given series
void display(): displays the data members of both the classes
Assume that the superclass Number has been defined. Using the concept of inheritance, specify the class Series giving the details of the constructor(…), void calsum() and void display().
The superclass, main function and algorithm need NOT be written.
*/
import java.util.Scanner;

public class Series extends Number {
    int sum;

    Series(int n) {
        super(n);
        sum = 0;
    }

    void calsum() {
        for (int i = 1; i <= n; i++) {
            sum = sum + factorial(i);
        }
    }

    void display() {
        super.display();
        System.out.println("Sum of factorial " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        Series obj = new Series(n);
        obj.calsum();
        obj.display();
    }
}
