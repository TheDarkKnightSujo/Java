import java.util.Scanner;

/**
 * Design a class ArmNum to check if a given number is an Armstrong number or
 * not. [A number is said to be Armstrong if sum of its digits raised to the
 * power of length of the number is equal to the number]
 * Example:
 * 371 = 33 + 73 + 13
 * 1634 = 14 + 64 + 34 + 44
 * 54748 = 55 + 45 + 75 + 45 + 85
 * Thus, 371, 1634 and 54748 are all examples of Armstrong numbers.
 * Some of the members of the class are given below:
 * Class name: ArmNum
 * Data members/instance variables:
 * n: to store the number
 * 1: to store the length of the number
 * Methods/Member functions:
 * ArmNum (int nn): parameterized constructor to initialize the data member n =
 * nn
 * int sum_pow(int i): returns the sum of each digit raised to the power of the
 * length of the number using recursive technique eg., 34 will return 32 + 42
 * (as the length of the number is 2:
 * void isArmstrong(): checks whether the given number is an Armstrong number by
 * invoking the function sum_pow () and displays the result with an appropriate
 * message.
 * Specify the class ArmNum giving details of the constructor( ), int
 * sum_pow(int) and void isArmstrong( ). Define a main() function to create an
 * object and call the functions accordingly to enable the task.
 */
public class ArmNum {
    int n, l;

    ArmNum(int nn) {
        n = nn;
    }

    int sum_pow(int k) {
        if (k == 0)
            return 0;
        else
            return sum_pow(k / 10) + (int) Math.pow(k % 10, l);
    }

    void Armstrong() {
        int j = sum_pow(n);
        if (j == n)
            System.out.println("The number is armstrong number");
        else
            System.out.println("The number is not armstrong number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int a = sc.nextInt();
        ArmNum obj = new ArmNum(a);
        int t = a;
        int c = 0;
        for (; t > 0;) {
            c++;
            t = t / 10;
        }
        obj.l = c;
        obj.Armstrong();
    }
}
