package day04_Variables;

public class variable_Practice2 {
    public static void main(String[] args) {
        int iNum = 50;
        long lNum = iNum; // 50

        float fNum = lNum; // 50.0

        float fNum123 = 500;
        float f_Num = 1000;
        float num$ = 1500;

        //  1,000,000
       // int num1 = 1,000,000; can not use ,
        int num1 = 1_000_000;  // we can use _
        System.out.println(num1);

        int num2;
        num2 = 1000; // value 1000
        num2 = 2000; // 2000 (latest value. Will print 2000)
        System.out.println(num2);

















    }

}
