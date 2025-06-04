import java.util.*;
/*
Input a paragraph containing ‘n’ number of sentences where (1 = < n < 4). 
The words are to be separated with a single blank space and are in UPPERCASE.
A sentence may be terminated either with a full stop ‘.’ Or a question mark ‘?’ only. Any other character may be ignored. 
Perform the following operations:
(i) Accept the number of sentences. If the number of sentences exceeds the limit, an appropriate error message must be displayed.
(ii)  Find the number of words in the whole paragraph
(iii) Display the words in ascending order of their frequency. Words with same frequency may appear in any order.

Example 1

INPUT:    Enter number of sentences.
1

Enter sentences.
TO BE OR NOT TO BE.
OUTPUT:
Total number of words: 6

WORD                                               FREQUENCY
OR                                                                1
NOT                                                             1
TO                                                                2
BE                                                                2
 */

public class WordFrequency {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = 0;
        String s = "";

        // To check for the validity of number of sentences
        do {
            System.out.println("Enter the number of sentences should be between 1 and 3...");
            n = obj.nextInt();
            obj.nextLine();
            if (n >= 1 && n < 4)
                break;
            else
                continue;
        } while (true);

        /*
         * #to check for words being separated with a single space and the rest of the
         * letters should be in uppercase.
         */
        spaceLoop: while (true) {
            System.out.println("Enter a sentence in Uppercase, and words should be separated with a single space...");
            s = obj.nextLine();

            for (int i = 0; i < s.length() - 1; i++) {
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(i + 1);
                if (ch1 == ' ' && ch2 != ' ')
                    continue;

                else if (Character.isUpperCase(ch1) || ch1 == '.' || ch1 == '?' || ch1 == ',')
                    continue;
                else {
                    System.out.println(
                            "The words should be separated with a single space and the letters should be in upperCase");
                    continue spaceLoop;
                }
            }

            break;
        }

        /* # To count the number of sentences */

        StringTokenizer st = new StringTokenizer(s, ".?");
        int c = st.countTokens();

        // #Proceed if the number of sentences match with actual number of sentences
        // entered
        if (n == c) {
            // To separate words

            StringTokenizer st1 = new StringTokenizer(s, " .?,");
            int nWords = st1.countTokens();

            String arr[] = new String[nWords];
            int brr[] = new int[nWords];

            for (int i = 0; i < nWords; i++) {
                arr[i] = st1.nextToken();
            }

            System.out.println("The original array is....");
            for (int i = 0; i < nWords; i++) {
                System.out.println(arr[i]);
            }

            // frequency
            int c1 = 0;
            for (int i = 0; i < arr.length; i++) {
                // multiple occurances are replaced with null
                if (arr[i] != null) {
                    c1 = 1;
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i].equals(arr[j])) {
                            c1++;
                            arr[j] = null;
                        }
                    }
                }
                brr[i] = c1;
            }

            System.out.println("The original array with null is....");
            for (int i = 0; i < nWords; i++) {
                System.out.println(arr[i] + " " + brr[i]);
            }

            // words without repeatation
            int count = 0;
            for (int i = 0; i < nWords; i++) {

                if (arr[i] != null)
                    count++;
            }

            String arr1[] = new String[count];
            int brr1[] = new int[count];
            int k = 0;
            for (int i = 0; i < nWords; i++) {

                if (arr[i] != null) {
                    arr1[k] = arr[i];
                    brr1[k++] = brr[i];
                }
            }

            System.out.println("The original array without null....");
            for (int i = 0; i < count; i++) {
                System.out.println(arr1[i] + " " + brr1[i]);
            }

            // bubble sort
            for (int i = 0; i < count; i++) {
                for (int j = 0; j < count - 1 - i; j++) {
                    if (brr1[j] > brr1[j + 1]) {
                        String t = arr1[j];
                        arr1[j] = arr1[j + 1];
                        arr1[j + 1] = t;

                        int temp = brr1[j];
                        brr1[j] = brr1[j + 1];
                        brr1[j + 1] = temp;
                    }
                }
            }
            System.out.println("The original array in ascending order....");
            for (int i = 0; i < count; i++) {
                System.out.println(arr1[i] + " " + brr1[i]);
            }

        } else {
            System.out.println("Invalid Entry");
        }
    }
}
