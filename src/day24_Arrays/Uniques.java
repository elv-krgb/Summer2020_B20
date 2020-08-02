package day24_Arrays;
/*
 1. write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

 */

public class Uniques {
    public static void main(String[] args) {

        String str = "aabcceejlljjfj";
        //            "aabcc"
        String uniques = ""; //we will store unique character in this string


        for(int i=0; i<=str.length()-1; i++){
            char ch = str.charAt(i);        // a a b c c

            int first = str.indexOf(ch);   //indexOf will return the first occur character index number // 0 0 2 3 3

            int last = str.lastIndexOf(ch);//lastIndexOf will return the occurrence of character last time // 1 1 2 4 4
// a indexOf(0) and a lastIndexOf(1)// 0==1 ==> false, not unique
// b indexOf(2) and lastIndexOf(2) // 2==2 ==> true, unique

            if(first == last){ //if first == true, than concat the character with empty unique variable

                uniques+=ch;
            }
        }

        System.out.println(uniques);

    }

}
