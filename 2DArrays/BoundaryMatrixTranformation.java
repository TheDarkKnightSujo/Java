import java.util.*; // importing classes from util package 

/**
 * Takes a square matrix of size M × M as input (where 2 < M < 10).
 * 
 * Displays the original matrix.
 * 
 * Creates a new matrix where:
 * 
 * The outer border of the original matrix is rotated clockwise.
 * 
 * The inner part of the matrix (excluding the border) remains unchanged.
 * 
 * Displays the new transformed matrix.
 */
public class BoundaryMatrixTranformation { // start of class
    public static void main(String[] args) { // start of method
        // objects
        Scanner sc = new Scanner(System.in);
        BoundaryMatrixTranformation obj = new BoundaryMatrixTranformation();

        // accepting initial values
        System.out.println("Enter the size of square matrix (value must be greater than 2 and less than 10: ");
        int M = sc.nextInt();

        // checking and reaccepting
        while (true) {
            if (M < 2 || M > 10) {
                System.out.println();
                System.out.println("Enter with valid inputs : ");
                M = sc.nextInt();
            } else {
                System.out.println();
                break;
            }
        }

        // initial array
        int A[][] = new int[M][M];

        // accepting the values
        System.out.println("Enter the values of the matrix : ");
        for (int i = 0; i < M; i++) {
            System.out.println("Elements of row : " + (i + 1));
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // printing
        System.out.println();
        System.out.println("Original Matrix : ");
        obj.display(A);

        // new array
        int B[][] = new int[M][M];

        // modifying
        for (int i = 0; i < M; i++) {
            B[0][M - i - 1] = A[i][0];
        }

        // modifying
        for (int i = 0; i < M; i++) {
            B[i][M - 1] = A[0][i];
        }

        // modifying
        for (int i = 0; i < M; i++) {
            B[M - 1][M - i - 1] = A[i][M - 1];
        }

        // modifying
        for (int i = 0; i < M; i++) {
            B[M - i - 1][0] = A[M - 1][M - i - 1];
        }

        // filling up the rest
        for (int i = 1; i < M - 1; i++) {
            for (int j = 1; j < M - 1; j++) {
                B[i][j] = A[i][j];
            }
        }

        // printing
        System.out.println();
        System.out.println("New Matrix:");

        obj.display(B);
    } // end of method

    public void display(int[][] a) { // start of method
                                     // displaying
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    } // end of method
}
