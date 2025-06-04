
/** To check whether a number is a Circucar Prime or not */
import java.util.*;

public class CircularPrimeNumberVersion {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("INPUT: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            cycle(n);
        } else

            System.out.println("NOT A Circular PRIME");
    }

    static boolean isPrime(int x) {
        int k = 0;
        for (int i = 1; i <= x; i++) {
            if ((x % i) == 0)
                k++;
        }
        if (k == 2)
            return true;
        else
            return false;
    }

    static void cycle(int n) {
        int m = n;
        int f = 0;
        int b = 0;
        for (; m != 0;) {
            m = m / 10;
            f++;
        }
        m = n;
        int arr[] = new int[f - 1];
        System.out.println("OUTPUT :" + n);
        for (int j = 0; j < (f - 1); j++) {
            int a = n % (int) Math.pow(10, f - 1);
            n = (a * 10) + (n / (int) Math.pow(10, f - 1));
            System.out.println(n);

            boolean d = isPrime(n);
            if (d == true)
                arr[j] = 0;
            else
                arr[j] = 1;
        }
        int k = 0;
        for (int i = 0; i < (f - 1); i++) {
            if (arr[i] == 1) {
                k = 1;
                break;
            }
        }
        if (k == 0)
            System.out.println(m + " is a Circular PRIME");
        else
            System.out.println(m + " is not A Circular PRIME");
    }

}
