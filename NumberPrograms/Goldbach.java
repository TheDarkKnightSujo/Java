
/* A Goldbach number is a positive even integer that can be expressed as the sum of teo odd primes.
*Note:All even integer numbers grater that 4are Goldbach numbers
*Example: 6=3+3
10=3+7
10=5+5
Hence, 6 has one odd prime pair 3 and 3. Similarly, 10 has two odd prime pairs, i.e. 3 and 7, 5 and 5. Write a program to accept an even integer ‘N’ where N > 9 and N < 50. Find all the odd prime pairs whose sum is equal to the number ‘N’. 
Test your program with the following data and some random data: 
Example 1: 
INPUT: N = 14 
OUTPUT:
PRIME PAIRS ARE: 3, 11 
7, 7 
Example 2:
INPUT: N = 30 
OUTPUT: 
PRIME PAIRS ARE: 7, 23 
11, 19 
13, 17 
Example 3: 
INPUT: N = 17 OUTPUT: 
INVALID INPUT. NUMBER IS ODD. 
Example 4: 
INPUT: N = 126 
OUTPUT: INVALID INPUT. NUMBER OUT OF RANGE.
*/
import java.util.*;

public class Goldbach {
    // The number of factors of a number should be 2 to be Prime
    public static boolean isPrime(int x) {
        int c = 0;
        for (int i = 1; i <= Math.sqrt(x); i++) {
            if (x % i == 0)
                c++;
        }
        if (c == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                System.out.print("INPUT: N =");
                n = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException obj) {
                sc.nextLine();
                System.out.println("Please enter an Positive even integer number between 9 and 50 only..");
                continue;
            } catch (Exception obj) {
                sc.nextLine();
                System.out.println("Error ...");
                continue;
            }
            if (n % 2 == 1) {
                System.out.println("INVALID INPUT. NUMBER IS ODD");
                return;
            } else if (n <= 9 || n >= 50) {
                System.out.println("INVALID INPUT. NUMBER OUT OF RANGE");
                return;
            }

            break;
        }
        System.out.print("\nOUTPUT: PRIME PAIRS ARE:  ");
        // Check for odd prime sums
        for (int i = 3; i <= n / 2; i++) {
            if (isPrime(i)) {
                for (int j = n - 1; j >= n / 2; j--) {
                    if (isPrime(j)) {
                        if (i + j == n) {
                            System.out.println(i + "," + j);
                            break;
                        }
                    }
                }
            }
        }
        // or
        System.out.print("\nOUTPUT: PRIME PAIRS ARE:  ");
        for (int i = 3; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(i + "," + (n - i));
            }
        }

    }
}
