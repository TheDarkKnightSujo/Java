
/** Program to add and /remove the decimal numbers from a queue..Queues*/
import java.util.*;

public class ShelfQueue {// start of class
                         // instance variables
    double ele[];
    int lim;// limimum capapcity of the shelf
    int front;// front pointer
    int rear;// rear pointer

    // parameterised constructor
    ShelfQueue(int n) {
        lim = n;
        ele = new double[lim];
        front = 0;
        rear = 0;
    }

    // Push decimal to the queue , where rear is pointing
    void pushVal(double v) {
        if (rear == front)// Queue is Empty
        {
            rear = front = 0;
            ele[rear] = v;
            rear++;

        } else if (rear == lim)// Queue is full
        {
            System.out.println("SHELF IS FULL...");
        } else {
            ele[rear] = v;
            rear++;
        }

    }

    // delete element from the queue , where the front is pointing
    double popVal() {

        if (front == rear)// Queue empty
        {
            rear = front = 0;
            return -999.99;
        } else if (rear == front + 1)// last element
        {
            double temp = ele[front];
            rear = front = 0;
            return temp;
        } else {
            return ele[front++];
        }
    }

    // Display the Shelf contents from front to rear
    void display() {
        if (front == rear)// Queue empty
            System.out.println("The Shelf is Empty...");
        else {
            System.out.println("The Shelf contents are...");
            for (int i = front; i < rear; i++) {
                System.out.println(ele[i]);
            }
        }
    }

    // Menu to perform operations of Queue
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int c = 0;

        while (true) {
            try {
                System.out.println(" Enter the maximum capacity of the Shelf..");
                c = sc.nextInt();
            } catch (InputMismatchException ob) {
                sc.nextLine();
                System.out.println("Error...Enter a valid integer value");
                continue;
            } catch (Exception ob) {
                sc.nextLine();
                System.out.println(" Error ...Please Enter valid integer");
                continue;
            }
            if (c > 0)
                break;
        }

        ShelfQueue obj = new ShelfQueue(c);
        int ch = 0;
        main: while (true) {
            while (true) {
                try {
                    System.out.println("Enter 1 to PUSH an element into the Shelf");
                    System.out.println("Enter 2 to DELETE the element from the Shelf");
                    System.out.println("Enter 3 to DISPLAY the contents of the Shelf");
                    System.out.println("Enter 4 to EXIT");
                    ch = sc.nextInt();
                } catch (InputMismatchException ob) {
                    sc.nextLine();
                    System.out.println("Error...Enter a valid integer value between 1 and 4");
                    continue;
                } catch (Exception ob) {
                    sc.nextLine();
                    System.out.println(" Error ...Please Enter valid an integer");
                    continue;
                }
                if (ch >= 1 && ch <= 4) {
                    sc.nextLine();
                    break;
                } else {
                    System.out.println("Enter a valid integer value between 1 and 4");
                    continue;
                }
            }

            switch (ch) {
                case 1:
                    System.out.println("Enter the decimal  to be stored in the Shelf...");
                    double n = sc.nextDouble();
                    obj.pushVal(n);
                    break;

                case 2:

                    if ((n = obj.popVal()) == -999.99)
                        System.out.println("EMPTY...");
                    else
                        System.out.println("The decimal removed from the Shelf  is..." + n);
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    break main;
            }
        }
    }
}// rear of class
