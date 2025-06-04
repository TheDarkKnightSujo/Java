
/**
 * WAP to accept a matrix of mxn and then check if it is symmetric or not 
 * for symmetry --- m=n
 * and the transpose of the matrix should be equal to the original matrix 
 */
import java.util.*;

public class Symmetric {

    static Scanner sc = new Scanner(System.in);
    static int arr[][];
    static int brr[][];
    static int m;
    static int n;

    public static void main(String[] args) {
        System.out.println("Enter the rows");
        m = sc.nextInt();
        System.out.println("Enter the columns");
        n = sc.nextInt();

        if (m == n) {
            accept();
            display(arr);
            brr = new int[n][m];
            transpose();
            if (equal())
                System.out.println("Symmetric Matrix");
            else
                System.out.println("Not Symmetric Matrix");
            sumofdiagonal();
        } else {
            System.out.println("INVALID");
        }
    }

    static void accept() {

        arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter number of the row " + (i + 1) + " and column " + (j + 1));
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void display(int crr[][]) {
        System.out.println("Array in matrix form is ");
        for (int i = 0; i < crr.length; i++) {
            for (int j = 0; j < crr[i].length; j++) {
                System.out.print(crr[i][j] + "  ");

            }
            System.out.println();
        }
    }

    static void transpose() {

        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                brr[i][j] = arr[j][i];
            }
        }
    }

    static boolean equal() {
        int c = 0;
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[i].length; j++) {
                if (brr[i][j] != arr[i][j]) {
                    c = 1;
                    break;
                }
            }
        }
        if (c == 0)

            return true;

        else
            return false;
    }

    static void sumofdiagonal() {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    sum1 += arr[i][j];
                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i + j == arr.length - 1) {
                    sum2 += arr[i][j];
                }
            }

        }
        System.out.println("Principal diagonal " + sum1);
        System.out.println("Secondary diagonal " + sum2);
    }
}
