package day28_Recap;
/*
 1. write a program return the frequency of a word from a string
            ex:
                str = "JavajavaJAVA";
                word = "java";
                output:
                    3
        do not use same the approach we did in last office hour

 */

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "javajava";
        //            01234567
        // substring(0,4) ==> java  // first index included, last excluded
        // substring(1,5) ==> avaj
        // substring(2,6) ==> vaja
        // substring(3,7) ==> ajav
        // substring(4,8) ==> java

        // substring(indexNum, indexNum+4)  (0,4), (1,5),(2,6),(3,7), (4,8)

        //"java"

        int count = 0;
        for(int indexNum=0; indexNum<=str.length()-4; indexNum++){ // to check each index num
                                                                  //  0, 1, 2, 3, 4, 5, 6, 7 - 4
                                                                 //   0, 1, 2, 3, 4
            String s = str.substring(indexNum, indexNum + 4);
            if(s.equalsIgnoreCase("java")){
                count++;
            }

        }

        System.out.println(count);


    }

}
