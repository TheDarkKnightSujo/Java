
/**
WAP to print all the PrimeAdam Integers between the range m and n
 */
import java.util.*;

public class PrimeAdam {
    static int m;
    static int n;

    // default constructor
    PrimeAdam() {
        m = n = 0;
    }

    // number of factors 2, indicates prime number
    static boolean isPrime(int x) {
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

    // reverse the number
    static int reverse(int x) {
        int num = 0;
        while (x != 0) {
            int r = x % 10;
            num = num * 10 + r;
            x /= 10;
        }
        return num;
    }

    static boolean isAdam(int x) {
        int y = reverse(x);
        int z = reverse(y * y);
        if (x * x == z)
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range, m<=n");
        m = sc.nextInt();
        n = sc.nextInt();

        if (m > n)
            System.out.println("INVALID INPUT");
        else {
            int count = 0;
            System.out.println("PRIME-ADAM INTEGERS ARE:");
            for (int i = m; i <= n; i++) {
                if (isPrime(i) && isAdam(i)) {
                    count++;
                    System.out.print(i + "\t");
                }
            }
            if (count == 0)
                System.out.println("NIL");
            System.out.println("\nFREQUENCY OF PRIME-ADAM INTEGERS ARE: " + count);

        }
    }
}// end of class
