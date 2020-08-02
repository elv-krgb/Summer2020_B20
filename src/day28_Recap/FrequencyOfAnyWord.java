package day28_Recap;

import java.util.Scanner;

public class FrequencyOfAnyWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word = scan.next();

       // int l = word.length(); // it is better to assign

        // String str = "pythonpython";
        // (0, 7) to get "python"

        int count = 0; // to store frequency of word
        for(int i=0; i<=str.length()-word.length(); i++){ // if add 6, we need substruct from length-6 ,
                                             // because python 6 characters
            if( str.substring(i, i+word.length()).equalsIgnoreCase(word) ){
                count++;
            }

        }

        System.out.println(count);

    }

}
