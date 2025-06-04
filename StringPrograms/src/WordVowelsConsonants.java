// program to find the vowels and consonants of each words 

import java.util.*; // importing packages from util package 

public class WordVowelsConsonants { // start of class
    public static void main(String[] args) { // start of method
        // objects
        Scanner sc = new Scanner(System.in);
        WordVowelsConsonants obj = new WordVowelsConsonants();

        // accepting the values
        System.out.println("Enter a sentence");
        String str = sc.nextLine();

        // trimming
        str = str.trim();

        // chekcing
        if (str.charAt(str.length() - 1) == '.' || str.charAt(str.length() - 1) == '?') {
            // concating
            str = str.substring(0, str.length() - 1);

            // making string tokenizer
            StringTokenizer st = new StringTokenizer(str);

            // methods
            int count = st.countTokens();

            // extracting
            String arr[] = new String[count];
            for (int i = 0; i < count; i++) {
                arr[i] = st.nextToken();
                // changing

                char b1 = Character.toUpperCase(arr[i].charAt(0));
                arr[i] = b1 + arr[i].substring(1, arr[i].length());

                // printing
                System.out.print(arr[i] + " ");
            }
            System.out.println();

            // filterring and printing
            System.out.println("Word \t Vowels \t Consonants");
            for (int i = 0; i < count; i++) {
                int vows = obj.vowels(arr[i]);
                int cons = arr[i].length() - vows;

                System.out.println(arr[i] + " \t " + vows + " \t " + cons);
            }
        } else {
            // error message
            System.out.println("Invalid Input");
        }
    } // end of method

    public static int vowels(String str) {
        int c = 0;

        // checking and incrementing
        for (int i = 0; i < str.length(); i++) {
            char b2 = Character.toLowerCase(str.charAt(i));

            if (isVowel(b2) == true) {
                c = c + 1;
            } else {
            }
        }

        return c;
    }

    public static boolean isVowel(char c) {// start od method
        // switch case
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    } // end of method
}
