package day11_NestedIf_Ternary;

public class Ternary {

    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if(num%2==0){
            result = "Even";
        }else{
            result = "Odd";
        }
        System.out.println(result);
        System.out.println("==================================");

        String result2 = (num%2==0) ? "Even" : "Odd";
        System.out.println(result2);

        System.out.println("===================================");
        int num1 = 1000;
        int num2 = 20;

        int max1 = 0;

        if(num1>num2){
            max1=num1;
        }else{
            max1=num2;
        }

        System.out.println(max1);

        int max2 = (num1>num2) ? num1 : num2;

        System.out.println(max2);
        int age = 20;
        boolean eligible = (age>=21) ? true : false;
        System.out.println(eligible);

        /*int age1 = 23;
        boolean usCitizenship = true;
        String res1 = "Can vote";
        String res2 = "Can not vote";
        String res3 = (age1>=21 && usCitizenship) ? res1 : res2;
        System.out.println(res3);

         */

        int age1= 23;
        String citizen = "USA";

        String vote = (age>=18 && citizen == "USA") ? "Can vote" : "Can not vote";
        System.out.println(vote);

        int number1 = 10;
        int number2 = 20;
        boolean equalOrNot = (number1==number2) ? true:false;
        System.out.println(equalOrNot);










    }


}
