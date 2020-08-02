package day24_Arrays;

public class Uniques2 {
    public static void main(String[] args) {

        String str = "aabcc";
        String unique = "";

        for (int j = 0; j <= str.length() - 1; j++) { // we need the frequency of every single character
            char ch1 = str.charAt(j); // a
            int count1 = 0; // after first loop +1; after second loop +1 ...  // to find frequency of characters

            for (int i = 0; i <= str.length() - 1; i++) { // used for finding frequency of characters and assign to int count
                char eachCharacter = str.charAt(i); // a a b c c
                if (ch1 == eachCharacter) { // a==a
                    count1 += 1;
                }

            }
            if (count1 == 1) { // if it only occured one time
                unique += ch1;

            }
        }

        System.out.println(unique);


    }
}
