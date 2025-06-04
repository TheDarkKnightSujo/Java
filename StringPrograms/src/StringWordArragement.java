/*
Write a program to accept a sentence as input. The words in the string are to be separated by a blank. Each word must be in upper case. The sentence is terminated by either “.”,”!” or “?”. Perform the following tasks:
(i)  Obtain the length of the sentence. (measured in words)
(ii) Arrange the sentence in alphabetical order of the words.
Test your program with the sample data and some random data:
Example 1:
INPUT: NECESSITY IS THE MOTHER OF INVENTION.
OUTPUT:
Length: 6
Rearranged Sentence:
INVENTION IS MOTHER NECESSITY OF THE
Example 2:
INPUT: BE GOOD TO OTHERS.
OUTPUT:
Length: 4
Rearranged Sentence: BE GOOD OTHERS TO
*/

import java.util.*;

public class StringWordArragement {
    static String s;

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        do {
            System.out.println(
                    "Enter a sentence in Uppercase, and words should be separated with a single space, and sentence should end with .,!?...");
            s = obj.nextLine();
            if (checkSentence() == true)
                break;
        } while (true);

        System.out.println("The number of words in the sentence " + s + " are " + countWords());
        orderAlphabetical();
        sentenceAlphabetical();

    }

    static boolean checkSentence() {
        /*
         * to check for words being separated with a single space and the rest of the
         * letters should be in uppercase.
         */

        boolean flag = true;
        for (int i = 0; i < s.length() - 1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            if (ch1 == ' ' && ch2 != ' ')
                continue;

            else if (Character.isUpperCase(ch1))
                continue;
            else {
                System.out.println(
                        "The words should be separated with a single space and the letters should be in upperCase");
                flag = false;
                break;
            }
        }
        /* #sentence should end with .,!?... */
        if ((s.charAt(s.length() - 1) == '?' || s.charAt(s.length() - 1) == '!' || s.charAt(s.length() - 1) == ','
                || s.charAt(s.length() - 1) == '.') && flag)
            return true;
        else
            return false;
    }

    static int countWords() {
        /* # To count the number of sentences */

        StringTokenizer st = new StringTokenizer(s, " .,!?");
        return st.countTokens();
    }

    static String[] wordArray() {

        // To separate words

        int nWords = countWords();
        StringTokenizer st1 = new StringTokenizer(s, " .,!?");
        String arr[] = new String[nWords];

        for (int i = 0; i < nWords; i++) {
            arr[i] = st1.nextToken();
        }
        return arr;
    }

    static String rearrangeAlphabeticalWord(String str) {
        String temp = "";
        for (char x = 'A'; x <= 'Z'; x++) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == x)
                    temp = temp + ch;

            }
        }
        return temp;
    }

    static void sentenceAlphabetical() {
        String arr[] = wordArray();
        String s1 = "";
        for (int i = 0; i < arr.length; i++) {
            s1 = s1 + rearrangeAlphabeticalWord(arr[i]) + " ";
        }
        System.out.println("The sentence with words in Alphabetical order ..." + s1);
    }

    static void displayArray() {
        String arr[] = wordArray();
        System.out.println("The original array is....");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void orderAlphabetical() {
        String arr[] = wordArray();
        // bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;

                }
            }
        }

        String str1 = "";
        for (int i = 0; i < arr.length; i++) {
            str1 = str1 + arr[i] + " ";
        }
        System.out.println("The sentence in Ascending order...." + str1);
    }
}
