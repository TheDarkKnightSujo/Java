
/** Program to add and /remove characters from one end only....2015Q11..Stacks*/
import java.util.*;

public class WordPile {// start of class

    // instance variables
    char ch[] = new char[20];// can hold maximum 20 characters
    int capacity;// maximum capacity within 20
    int top;// stack pointer

    // parameterised constructor
    WordPile(int cap) {
        capacity = cap;
        top = -1;// index pointing to -1 , indicates the stack is empty
    }

    // Add char to the stack , where the top is pointing
    void pushChar(char v) {
        if (top == capacity - 1)// stack is full
        {
            System.out.println("WordPile is full");
        } else {
            top++;
            ch[top] = v;
        }
    }

    // Remove char from the stack , where the top is pointing
    char popChar() {

        if (top == -1)// stack is empty
        {
            return '\\';
        } else {
            return ch[top--];
        }
    }

    // Display the stack contents from 0th index till point
    void display() {
        if (top == -1)// Stack empty
            System.out.println("The Wordfile is Empty...");
        else {
            System.out.println("The Characters in the Wordfile  are...");
            for (int i = 0; i <= top; i++) {
                System.out.print(ch[i]);
            }
            System.out.println();
        }
    }

    // Menu to perform operations of Stack
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = 0;

        while (true) {
            try {
                System.out.println(" Enter the maximum capacity of WordFile..(Maximum allowed is 20)");
                c = sc.nextInt();
            } catch (InputMismatchException ob) {
                sc.nextLine();
                System.out.println("Error...Enter a valid integer value between 1 and 20");
                continue;
            } catch (Exception ob) {
                sc.nextLine();
                System.out.println(" Error ...Please Enter valid integer");
                continue;
            }

            if (c < 1 || c > 20)
                System.out.println("Enter a value  between 1 and 20");
            else
                break;
        }

        WordPile obj = new WordPile(c);
        int ch = 0;
        main: while (true) {
            while (true) {
                try {
                    System.out.println("Enter 1 to PUSH/ADD a Character into a Wordfile");
                    System.out.println("Enter 2 to POP/REMOVE the Character from a Wordfile");
                    System.out.println("Enter 3 to DISPLAY the characters in the Wordfile");
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
                    System.out.println("Enter the Character to be added to the Wordfile at the top...");
                    char n = sc.nextLine().charAt(0);
                    obj.pushChar(n);
                    break;

                case 2:
                    obj.popChar();
                    break;

                case 3:
                    obj.display();
                    break;

                case 4:
                    break main;
            }
        }
    }
}// end of class
