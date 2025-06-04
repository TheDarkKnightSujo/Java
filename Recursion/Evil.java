import java.util.*;

/**
 * An Evil Number is a number which contains even number of 1’s in its binary
 * equivalent.
 * Example: Binary equivalent of 10 = 1010 which contains even number on 1’s.
 * Thus, 10 is an Evil Number.
 * Design a class Evil to check if a given number is an Evil number or not. Some
 * of the
 * members of the class are given below: .
 * 
 * Class name : Evil
 * Data members/instance variables:
 * nnum : to store a positive integer number
 * bin : to store the binary equivalent
 * Methods / Member functions:
 * Evil( ) : default constructor to initialize the data member
 * with legal initial value
 * void acceptNum( ) : to accept a positive integer number
 * void rec_bin (int x) : to convert the decimal number into its binary
 * equivalent using recursive technique
 * void check( ) : to check whether the given number is an Evil
 * number by invoking the function rec_bin() and
 * to display the result with an appropriate
 * message
 * Specify the class Evil giving details of the constructor( ), void acceptNum(
 * ),
 * void rec_bin(int) and void check( ). Define a main( ) function to create an
 * object and call
 * all the functions accordingly to enable the task.
 */
public class Evil {
    int num;
    String bin;

    public static void main(String[] args) {
        Evil obj = new Evil();
        obj.acceptNum();
        obj.check();

    }

    Evil() {
        num = 0;
        bin = "";
    }

    void acceptNum() {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num < 0)
            System.out.println("The number entered must be positive");
        else {

        }
    }

    void rec_bin(int x) {
        if (x == 0) {

        } else {
            bin = bin + (x % 2);
            rec_bin(x / 2);
        }
    }

    void check() {
        rec_bin(num);
        int c = 0;
        for (int i = 0; i < bin.length(); i++) {
            char ch = bin.charAt(i);
            if (ch == '1')
                c++;
        }
        if (c % 2 == 0)
            System.out.println("Yes the number is Evil");
        else
            System.out.println("The number is not evil");
    }
}
