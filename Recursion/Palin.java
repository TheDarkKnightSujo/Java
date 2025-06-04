import java.util.*;

/**
 * A class Palin has been defined to check whether a positive number is a
 * Palindrome number or not.
 * The number ‘N’ is palindrome if the original number and it’s reverse are the
 * same.
 * Some of the members of the class are given below:
 * Class name: Palin
 * Data members/instance variables:
 * num: integer to store the number
 * revnum: integer to store the reverse of the number
 * Methods/Member functions:
 * Palin(): constructor to initialize data members with legal initial values
 * void accept(): to accept the number
 * int reverse(int y): reverses the parameterized argument ‘y’ and stores it in
 * revenue using a recursive technique
 * void check(): checks whether the number is a Palindrome by invoking the
 * function reverse() and display the result with an appropriate message
 * Specify the class Palin giving the details of the constructor (), void
 * accept(), int reverse(int) and void check(). Define the main() function to
 * create an object and call the functions accordingly to enable the task.
 */
public class Palin {
    int num;
    int revnum;

    Palin() {
        num = revnum = 0;
    }

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
    }

    void reverse(int y) {
        if (y == 0) {
            ;
        } else {
            revnum = revnum * 10 + y % 10;
            reverse(y / 10);
        }
    }

    void check() {
        reverse(num);
        if (revnum == num) {
            System.out.println("Yes it is a Palin number");
        } else {
            System.out.println("Not a Palin number");
        }
    }

    public static void main(String[] args) {
        Palin obj = new Palin();
        obj.accept();

        obj.check();
    }
}
