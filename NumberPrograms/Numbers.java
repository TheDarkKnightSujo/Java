
/**
Given 2 positive numbers M and N , such that M is between 100 and 10000 and N is less than 100.
 Find the smallest integer that is greater than M and whose digits add up to N. 
 For example, if M=100 and N=11, then the smallest integer greater than 100 whose digits add up to 11. And also print the the total number of digits in the smallest number found.
Example 1: 
INPUT: M=100, N=11
OUTPUT: The required number: 119
Total number of digits :3

Example 2: 
INPUT: M=112, N=130
OUTPUT: INVALID INPUT

Example 3: 
INPUT: M=1500, N=25
OUTPUT: The required number: 1699
Total number of digits :4

Example 4: 
INPUT: M=99, N=11
OUTPUT: INVALID INPUT

Create a class Numbers with the following specifications.
Member Variables/Data Members:
int M,N;
Member methods:
Numbers()    Default Constructor to initialize data members.
void readNum()    To accept the valid values for M and N.
int sumOfDigits (int x)    Returns the sum of digits of x
int countOfDigits (int x)    Returns the count of digits of x
void printSmallInteger()    Print the smallest integer that is greater than M and whose digits add up to N.
void main()    Create the object of the class.Call the methods as per the requirement.
 */
import java.util.*;

public class Numbers {// start of class
                      // instance variables
    int M, N;

    // Default constructor
    Numbers() {
        M = N = 0;
    }

    void readNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M and N");
        M = sc.nextInt();
        N = sc.nextInt();

    }

    int sumOfDigits(int x) {
        int s = 0;
        while (x != 0) {
            s = s + x % 10;
            x /= 10;
        }
        return s;
    }

    int countOfDigits(int x) {
        int c = 0;
        while (x != 0) {
            c++;
            x /= 10;
        }
        return c;

    }

    void printSmallestInteger() {
        int k = 0;
        for (int i = M; i <= 10000; i++) {
            if (sumOfDigits(i) == N) {
                System.out.println("Required Number is : " + i);
                System.out.println("Total Number digits  : " + countOfDigits(i));
                k = 1;
                break;
            }
        }
        if (k == 0) {
            System.out.println("Smallest Integer is not found within the range");
        }

    }

    public static void main(String[] args) throws Exception {
        Numbers obj = new Numbers();
        obj.readNum();

        if (obj.M >= 100 && obj.M <= 10000 && obj.N > 0 && obj.N < 100)
            obj.printSmallestInteger();
        else {
            System.out.println("INVALID INPUT");
            return;
        }
    }
}// end of class
