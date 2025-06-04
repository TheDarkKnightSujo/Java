
/**
Write a program to accept a sentence which may be terminated by either ‘.’ , ‘?’ or ‘!’ only. 
The words are to be separated by a single blank space and are in lower case. 
Perform the following tasks: 
(a) Check for the validity of the accepted sentence and for the terminating character. 
(b) Arrange the words contained in the sentence according to the size of the words in ascending order. 
If two words are of the same length then the first occurring comes first. 
The sentence should begin with a capital alphabet in both the cases i.e. Input and Output. 
(c) Display both the sentences separately with each sentence beginning with a capital alphabet. 
Design your program which will enable the output in the format given below: 
Sample 1 INPUT: the lines are printed in reverse order. 
OUTPUT: The lines are printed in reverse order. 
In the are lines order printed reverse. 
Sample 2 INPUT: print the sentence in ascending order. 
OUTPUT: Print the sentence in ascending order. 
In the print order sentence ascending. 
Sample 3 INPUT: i love my country. 
OUTPUT: I love my country. 
I my love country.
 */
import java.util.*;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String s = sc.nextLine();

        if (s.charAt(s.length() - 1) == '.' || s.charAt(s.length() - 1) == '?' || s.charAt(s.length() - 1) == '!') {
            StringTokenizer st = new StringTokenizer(s, " .?!");

            int c = st.countTokens();
            String arr[] = new String[c];

            for (int i = 0; i < c; i++) {
                arr[i] = st.nextToken();
            }

            sort(arr);
            System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1));
            int i;
            for (i = 0; i < arr.length - 1; i++) {
                if (i == 0)
                    System.out.print(Character.toUpperCase(arr[i].charAt(0)) + arr[i].substring(1) + " ");
                else
                    System.out.print(arr[i] + " ");
            }
            System.out.println(arr[i] + s.charAt(s.length() - 1));
        } else {
            System.out.println("Enter a valid sentence");
        }
    }

    // Bubble Sort n asccending order
    static void sort(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }

            }
        }

    }
}
