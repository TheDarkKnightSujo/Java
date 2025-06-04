
/**
 * 
 * WAP to accept an array and arrange the rows in ascending order using Bubble sort
 */
import java.util.Scanner;

public class RowAscendingOrder {
    static Scanner sc = new Scanner(System.in);
    static int arr[][];
    static int brr[];
    static int m;
    static int n;

    public static void main(String[] args) {
        accept();
        System.out.println("Array in matrix form is ");
        display();
        ascending();
        System.out.println("Array in ascending order is ");
        display();
    }

    static void accept() {
        System.out.println("Enter the rows");
        m = sc.nextInt();
        System.out.println("Enter the columns");
        n = sc.nextInt();
        arr = new int[m][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter number of the row " + (i + 1) + " and column " + (j + 1));
                arr[i][j] = sc.nextInt();
            }
        }
    }

    static void display() {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");

            }
            System.out.println();
        }
    }

    static void ascending() {

        for (int i = 0; i < arr.length; i++) {
            int brr[] = new int[arr[i].length];
            int k = 0;
            for (int j = 0; j < arr[i].length; j++) {
                brr[k] = arr[i][j];
                k++;
            }
            sort(brr);
            k = 0;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = brr[k];
                k++;
            }
        }
    }

    static void sort(int brr[]) {
        for (int i = 0; i < brr.length - 1; i++) {
            for (int j = 0; j < brr.length - 1 - i; j++) {
                if (brr[j] > brr[j + 1]) {
                    int t = brr[j];
                    brr[j] = brr[j + 1];
                    brr[j + 1] = t;
                }
            }
        }
    }
}
