
/**
WAP to input a paragraph with exactly two sentences on one single line. Each
sentence must be terminated by only ?', '" or ""'.
Print each sentence on a separate line.
Print invalid input if the number of sentences is not exactly two in the paragraph.

Find the number of words which are common to both the sentences and print their frequency.
Sample case 1:
Input:
MY NAME IS KHAN. MY NAME IS DON!
Output:
MY NAME IS KHAN.
MY NAME IS DON!
COMMON wORD FREQUENCY
MY 2
NAME 2
IS 2
Sample case 2:
Input:
HOW ARE YOU? I HOPE YOU ARE FINE!
Output
HOW ARE YOU?
HOPE YOU ARE FINE!
COMMON WORD FREQUENCY
ARE 2
YOU
Sample case 3
Input:
MY NAME IS KHAN, MY NAME IS DON!
Output
INVALID INPUT
 */
import java.util.*;

public class SentenceCommonWord {// start of class
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 sentences as a paragraph. Each sentence should end with ?/./!");
        String s = sc.nextLine();

        String[] st = s.split("(?<=[?.!])\\s*");
        int c = st.length;
        if (c != 2) {
            System.out.print("Please enter only 2 Sentences..");
        } else {
            String arr[] = st;
            int k = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].charAt(arr[i].length() - 1) != '?' && arr[i].charAt(arr[i].length() - 1) != '.'
                        && arr[i].charAt(arr[i].length() - 1) != '!') {
                    System.out.print("Invalid Input");
                    break;
                } else {
                    System.out.println(arr[i]);
                    arr[i] = arr[i].replaceAll("[!.?]", " ");
                    k = 1;
                }
            }

            if (k == 1) {
                String smain = arr[0] + arr[1];
                String[] word = smain.split(" ");
                boolean[] printed = new boolean[smain.length()];
                for (int i = 0; i < word.length; i++) {
                    if (printed[i])
                        continue;
                    int count = 0;
                    int flag = 0;
                    for (int j = 0; j < word.length; j++) {
                        if (word[i].equals(word[j])) {
                            flag = 1;
                            count++;
                            if (i != j) {
                                printed[j] = true;
                            }
                        }

                    }
                    if (flag == 1) {
                        System.out.println(word[i] + " " + count);
                    }
                }
            }
        }
    }
}// end of class
