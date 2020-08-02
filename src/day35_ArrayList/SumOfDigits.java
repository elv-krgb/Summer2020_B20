package day35_ArrayList;

public class SumOfDigits {
    /*
    2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
            HINT: on ascii table, the characters between #48 ~ #57 are digits

     */
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0; // 1+2+3
        // if we add char 1+2+3 ==> 49+50+51 from ascii table ==> 150
        // that's why we have to convert to int 1+2+3 ==> 6

        for(int i=0; i<=str.length()-1; i++){
            char eachCharacter =str.charAt(i); // a,1,b,2,c,3
            if(eachCharacter>=48 && eachCharacter<=57){ //on ascii table, the characters between #48 ~ #57 are digits
                //           '0'                   '9'
                // if the char is between 48~57, the it is digit
                sum+=Integer.parseInt(""+eachCharacter); // convert char to Integer and add to sum
            }
        }
        System.out.println(sum);


    }

}
