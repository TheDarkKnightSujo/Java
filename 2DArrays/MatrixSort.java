
/**
 *Write a program to declare a square matrix A[][] of order (M × M) where 'M' must be greater than 3 and less than 10. Allow the user to input positive integers into this matrix. Perform the following tasks on the matrix:
Sort the non-boundary elements in ascending order using any standard sorting technique and rearrange them in the matrix.
Calculate the sum of both the diagonals.
Display the original matrix, rearranged matrix and only the diagonal elements of the rearranged matrix with their sum.
Test your program for the following data and some random data:
Example 1
INPUT:
M = 4
9    2    1    5
8   13   8    4
15   6   3    11
7   12   23   8
OUTPUT:
ORIGINAL MATRIX
9    2    1    5
8   13   8    4
15   6   3    11
7   12   23   8
REARRANGED MATRIX
9    2    1    5
8    3    6    4
15  8   13  11
7   12   23   8
DIAGONAL ELEMENTS
9            5
    3    6    
    8   13  
7             8
SUM OF THE DIAGONAL ELEMENTS = 59
Example 2
INPUT:
M = 5
7    4    1    9    5
8    2    6   10   19
13  1    3    5    1
10  0    5   12   16
1    8   17   6    8
OUTPUT:
ORIGINAL MATRIX
7    4    1    9    5
8    2    6   10   19
13  1    3    5    1
10  0    5   12   16
1    8   17   6    8
REARRANGED MATRIX
7    4    1    9    5
8    0    1    2    19
13  3    5    5    1
10  6   10  12   16
1    8   17   6    8
DIAGONAL ELEMENTS
7                5
    0        2    
          5        
     6       12   
1                 8
SUM OF THE DIAGONAL ELEMENTS = 46
Example 3
INPUT:
M = 3
OUTPUT:
THE MATRIX SIZE IS OUT OF RANGE.

 */
import java.util.Scanner;

public class MatrixSort {
    static int A[][];
    static int m;
    static Scanner sc = new Scanner(System.in);

    static void accept() {
        System.out.println("Enter the rows and columns");
        m = sc.nextInt();

        A = new int[m][m];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("Enter number of the row " + (i + 1) + " and column " + (j + 1));
                A[i][j] = sc.nextInt();
            }
        }
    }

    static void display() {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + "  ");

            }
            System.out.println();
        }
    }

    public static void sortNonBoundaryMatrix() {
        int b[] = new int[(m - 2) * (m - 2)];
        int k = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                b[k++] = A[i][j];
            }
        }

        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    int t = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = t;
                }
            }
        }

        k = 0;
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                A[i][j] = b[k++];
            }
        }
    }

    static void sumofdiagonal() {
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j || i + j == A.length - 1) {
                    sum += A[i][j];
                }
            }

        }

        System.out.println("Diagonal " + sum);

    }

    static void PrintDiagonal() {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j || i + j == A.length - 1) {
                    System.out.print(A[i][j] + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        accept();
        System.out.println("ORIGINAL MATRIX");
        display();
        sortNonBoundaryMatrix();
        System.out.println("REARRANGED MATRIX");
        display();
        System.out.println("DIAGONALS");
        PrintDiagonal();
        sumofdiagonal();
    }
}
