
/**
 * Write a program to declare a matrix AD0 of Order (M*N) where 'M' is the number of rows and 'N'
is the number of columns such that the value of both M' and 'N' must be greater than 2 and less
than 8. Allow the user to input positive integers into this matrix.

Perform the following tasks on the matrix:
(a) Sort the matrix in descending order using any standard sorting technique.
(b) Calculate the sum of the boundary of the elements of the matrix before sorting and after
sorting.
(c) Display the original matrix and sorted matrix after calculating the sum of the boundary
elements respectively.

INPUT
M 3
N 3
ENTER ELEMENTS OF ROW 1 =   3 2 7
ENTER ELEMENTS OF ROW 2 =   6 8 1
ENTER ELEMENTS OF ROW 3 =   9 4 5

OUTPUT
ORIGINAL MATRIX:
3   2   7
6   8   1
9   4   5

SUM OF BOUNDARY ELEMENTS: 37

SORTED MATRIX:
9   8   7
6   5   4
3   2   1
 */
import java.util.*;

public class Matrix {// start of class

    int ADO[][], M, N;

    // Nonparameterized constructor
    Matrix() {
        ADO = new int[M][N];
    }

    // Parameterized constructor
    Matrix(int mm, int nn) {
        M = mm;
        N = nn;
        ADO = new int[M][N];

    }

    // Aceept the array
    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter positive elements in the array, enter one row at a time");
        for (int i = 0; i < M; i++) {
            System.out.print("ENTER " + N + "  ELEMENTS OF ROW " + (i + 1) + " = ");

            for (int j = 0; j < N; j++) {
                ADO[i][j] = sc.nextInt();
            }

        }
    }

    // Display the contents of the array
    void display() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(ADO[i][j] + " ");
            }
            System.out.println();
        }
    }

    void sumBoundary() {
        int sum = 0;
        // first row
        for (int j = 0; j < N; j++)
            sum = sum + ADO[0][j];

        // last row
        for (int j = 0; j < N; j++)
            sum = sum + ADO[M - 1][j];

        // first column
        for (int i = 1; i < M - 1; i++)
            sum = sum + ADO[i][0];

        // last column
        for (int i = 1; i < M - 1; i++)
            sum = sum + ADO[i][N - 1];

        System.out.println(sum);
    }

    // Bubble sort in descending order
    void sort() {
        int brr[] = new int[M * N];
        int k = 0;
        // copy elements to a 1D array
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                brr[k++] = ADO[i][j];
            }
        }

        // sort
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr.length - 1 - i; j++) {
                if (brr[j] < brr[j + 1]) {
                    int t = brr[j];
                    brr[j] = brr[j + 1];
                    brr[j + 1] = t;
                }
            }
        }

        // Copy the sorted elements back in the 2 D array
        k = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                ADO[i][j] = brr[k++];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        do {
            System.out.println("Enter the number of rows and columns in the matrix(must be >2 and <8.)");
            x = sc.nextInt();
            y = sc.nextInt();
            if ((x > 2 && x <= 8) && (y > 2 && y <= 8))
                break;
            else
                System.out.println("Please enter valid number of rows and columns in the matrix(must be >2 and <8.)");
        } while (true);

        Matrix obj = new Matrix(x, y);
        obj.accept();
        System.out.println("\nTHE ORIGINAL MATRIX");
        obj.display();
        System.out.print("\nSUM OF BOUNDARY ELEMENTS BEFORE SORTING :");
        obj.sumBoundary();
        obj.sort();
        System.out.print("\nSUM OF BOUNDARY ELEMENTS AFTER SORTING :");
        obj.sumBoundary();
        obj.display();
        System.out.println("\nTHE MATRIX AFTER SORTING");
        obj.display();
    }
}// end of class
