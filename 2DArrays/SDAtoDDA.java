
/** WAP to declare a single-dimensional array a[] and a square matrix b[][] of size N, where, N > 2 and N < 10.
Allow the user to input positive integers into the single dimensional array.
Perform the following tasks on the matrix:
1. Sort the elements of the single-dimensional array in ascending order using any standard
sorting technique and display the sorted elements.
2. Fill the square matrix b[][] in the following format:
If the array a[] = {5, 2, 8, 1} then, after sorting a[] = {1, 2, 5, 8}
Then, the matrix b[][] would fill as below:
1 2 5 8
1 2 5 1
1 2 1 2
1 1 2 5
Display the filled matrix in the above format.

Test your program for the following data and some random data:
Example 1
INPUT:
N = 3
ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY: 3 1 7
OUTPUT:
SORTED ARRAY: 1 3 7
FILLED MATRIX
1 3 7
1 3 1
1 1 3

Example 2
INPUT:
N = 13
OUTPUT:
MATRIX SIZE OUT OF RANGE
Example 3
INPUT:
N = 5
ENTER ELEMENTS OF SINGLE DIMENSIONAL ARRAY: 10 2 5 23 6
OUTPUT:
SORTED ARRAY: 2 5 6 10 23
FILLED MATRIX
2 5 6 10 23
2 5 6 10 2
2 5 6 2 5
2 5 2 5 6
2 2 5 6 10
 */
import java.util.*;

public class SDAtoDDA {// start of class
    public static void main(String[] args) {// start of main()
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the 1 D array");
        int N = sc.nextInt();
        int brr[] = new int[N];

        int arr[][] = new int[N][N];

        System.out.println("Enter " + N + " numbers in the Single Dimensional array");
        for (int i = 0; i < brr.length; i++) {
            System.out.println("Enter the element at " + (i + 1));
            brr[i] = sc.nextInt();
        }

        System.out.println("The Single Dimensional Array is..");
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }

        bubbleSort(brr);// Sort the array in ascending order
        System.out.println("The Single Dimensional Array in Ascending order is..");
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
        // To store on the secondary diagonal and on the left side of the secondary
        // diagonal
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j <= arr.length - 1) {
                    arr[i][j] = brr[k++];
                }
            }
        }

        // To store on the right side of the secondary diagonal
        for (int i = 0; i < arr.length; i++) {
            int k = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j >= arr.length) {
                    arr[i][j] = brr[k++];
                }
            }
        }

        System.out.println("The Matrix is...");
        // Display the Matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

    }// end of main()

    static void bubbleSort(int brr[]) {
        // Bubble Sort in ascending order
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

}// end of class
