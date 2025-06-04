
/*
Design a class Perfect to check if a given number is a perfect number or not. [A number is said to be perfect if sum of the factors of the number excluding itself is equal to the original number]
Example: 6 = 1 + 2 + 3 (where 1, 2 and 3 are factors of 6, excluding itself) [10]
Some of the members of the class are given below:
Class name: Perfect
Data members/instance variables:
num: to store the number
Methods/Member functions:
Perfect (int nn): parameterized constructor to initialize the data member num=nn
int sum_of_factors(int i): returns the sum of the factors of the number(num), excluding itself, using a recursive technique
void check(): checks whether the given number is perfect by invoking the function sum_of_factors() and displays the result with an appropriate message
Specify the class Perfect giving details of the constructor(), int sum_of_factors(int) and void check(). Define a main() function to create an object and call the functions accordingly to enable the task.
*/
import java.util.*;

public class Perfect {
    int num;

    Perfect(int nn) {
        num = nn;
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to check");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Perfect obj = new Perfect(a);
        obj.check();
    }

    int sum_of_factors(int i) {
        if (i == num)
            return 0;
        else {
            if (num % i == 0)
                return i + sum_of_factors(i + 1);
            else
                return sum_of_factors(i + 1);
        }
    }

    void check() {
        int v = sum_of_factors(1);
        if (v == num)
            System.out.println("It is a perfect number");
        else
            System.out.println("It is not a perfect number");
    }
}
