package day23_Arrays;
/*
3. write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
 */

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "ABAB"; // "A2B2"
        String nonDup = "";  // "AB"
        String result = ""; // "A2B2"

        for(int i = 0; i <= str.length()-1; i++){  // removing duplicates from str
            String ch = ""+ str.charAt(i);  // A, B, A, B
            if(!nonDup.contains( ch )){
                nonDup += ch;
            }
        }

        System.out.println(nonDup);

        // str ="ABAB"     nonDup = "AB"

        for(int j=0; j <= nonDup.length()-1; j++ ){ // iterates the string nonDup

            char ch = nonDup.charAt(j);// B, C, D
            int count = 0; // 2, 2, 2
            for(int i = 0; i <= str.length()-1; i++){ // returns the frequency of each ch from string str
                if(str.charAt(i) == ch){
                    count+=1;
                }
            }

            result += ""+ch + count;

        }

        System.out.println(result);


    }

}
