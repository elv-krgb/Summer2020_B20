package day15_String;

public class substring_method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789...

        // substring(beg index, end index)
        String word1 = sentence.substring(0, 4); // (0, 3+1)
        System.out.println(word1);

        String word2 = sentence.substring(8, 11); // (8, 10+1)
        System.out.println(word2);

        System.out.println("====================================");

        String sentence2 = "I like Movies and TV Series";
        //                  0123456789...
        String word3 = sentence2.substring(7,13);
        System.out.println(word3);

        System.out.println("=====================================");
        String firstName = "elvira";
        String firstCharacter = firstName.substring(0, 1);
        String rest = firstName.substring(1, firstName.length());// (1, 5+1)
        firstName = firstCharacter.toUpperCase()+rest.toLowerCase();// Elvira

        //System.out.println(firstCharacter);
        //System.out.println(rest);
        System.out.println(firstName);

        System.out.println("======================================");
        String lastName = "rAmazAn";
        String firstChar = lastName.substring(0, 1); //
        String remaining = lastName.substring(1); // 

        lastName = firstChar.toUpperCase()+remaining.toLowerCase();//School

        //System.out.println(firstChar);
        //System.out.println(remaining);
        System.out.println(lastName);

        System.out.println("======================================");

        String s = "I like Game Of Thrones";
        //          0123456789..
        String series = s.substring(7);
        System.out.println(series);

        String s2 = "I like Java Programming Language";
        String language = s2.substring(7);
        System.out.println(language);






    }

}
