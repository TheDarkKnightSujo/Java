
/**
 * The potential of a word is found by adding the ASCII value of the alphabets.
(ASCII values of A to Z are 65 to 90).
Example: BALL
Potential = 66 + 65 + 76 + 76 = 283
Write a program to accept a sentence which may be terminated by either “ . ” , “ ? ” or “ ! ” only.
The words of sentence are separated by single blank space and are in UPPER CASE. Decode the
words according to their potential and arrange them in ascending order of their potential strength.
Test your program with the following data and some random data:
Example 1:
INPUT: HOW DO YOU DO?
OUTPUT: HOW = 238
DO = 147
YOU = 253
DO = 147
DO DO HOW YOU
 */
import java.util.*;

public class potentialWord {// start of class

    static String s;// Holds the Original sentence
    static int c = 0;// Holds the number of words
    static Scanner sc = new Scanner(System.in);

    static void accept() {
        System.out.println("Please enter a sentence");
        s = sc.nextLine().toUpperCase();
    }

    static void potential() {
        int arr[] = new int[c];
        String str = "";
        String brr[] = new String[c];

        s = s.substring(0, s.length() - 1) + " ";
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != 32)
                str += ch;
            else {

                for (int j = 0; j < str.length(); j++) {
                    arr[k] = arr[k] + ((int) (str.charAt(j)));
                }
                brr[k] = str;
                System.out.println(brr[k] + "\t" + arr[k]);
                str = "";
                k++;
            }

        }

        // Bubble sort in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    String t2 = brr[j];
                    brr[j] = brr[j + 1];
                    brr[j + 1] = t2;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }

    public static void main(String[] args) {
        accept();
        if (s.charAt(s.length() - 1) != '.' && s.charAt(s.length() - 1) != ',' && s.charAt(s.length() - 1) != '?'
                && s.charAt(s.length() - 1) != '!') {
            System.out.println("INVALID INPUT");
        } else {
            StringTokenizer st = new StringTokenizer(s, " .?,");
            c = st.countTokens();
            potential();
        }
    }
}// end of class
