import java.util.*;

/**
 * A class Admission contains the admission numbers of 100 students. Some of the
 * data members/member functions are given below:
 * Class name: Admission
 * Data member/instance variable:
 * Adno[]: integer array to store admission numbers
 * Member functions/methods:
 * Admission(): constructor to initialize the array elements
 * void fill Array(): to accept the elements of the array in ascending order
 * int binSearch(int 1, int u, int v): to search for a particular admission
 * number (v) using binary search and recursive technique and returns 1 if found
 * otherwise returns -1
 * Specify the class Admission giving details of the constructor, void fill
 * Array() and int binSearch(int, int, int). Define the main() function to
 * create an object and call the functions accordingly to enable the task.
 * 
 */
public class Admission {
    int Adno[];

    Admission() {
        Adno = new int[5];
    }

    void fillArray() {
        Scanner sc = new Scanner(System.in);
        Adno[0] = sc.nextInt();
        for (int i = 1; i < Adno.length;) {
            Adno[i] = sc.nextInt();
            if (Adno[i] < Adno[i - 1]) {
                System.out.println("Pls enter a greater number");
            } else
                i++;
        }
    }

    int binSearch(int l, int u, int v) {
        int mid = (l + u) / 2;
        if (Adno[mid] == v) {
            return 1;
        } else if (l > u) {
            return -1;
        } else {
            if (v > Adno[mid])
                return binSearch(mid + 1, u, v);
            else
                return binSearch(l, mid - 1, v);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 5 numbers");
        Admission obj = new Admission();
        obj.fillArray();
        System.out.println("Enter the element to be searched");
        int n = sc.nextInt();
        int a = 0, b = 4;
        int f = obj.binSearch(a, b, n);
        if (f == 1) {
            System.out.println("Found");
        } else
            System.out.println("Not found");

    }
}
