package day03_sequences_Variables;
/*
declare variables:
DataType variableName = Data
 */

public class Variables {
    public static void main(String[] args) {
        // length: 2, width: 4, area: 8

        byte lenght = 2;
        byte width = 4;
        System.out.println(lenght * width); //  (2*4)

        // 140
       // byte num1 = 140; It is not correct because it is out of range -128 to 128
        short num2 =140;

        // 40000
        // short salary = 40000; not correct, out of range -32,768 to 32,767
        int salary = 40000;

        //999999999
        //int largenumber = 999999999; not correct, out of range
        long largenumber = 999999999L; // for long needs L at the end.


        int score = 100; // int is prefered by compiler
        System.out.println(score);

        //PI = 3.14
        double PI = 3.14; // double is prefered by compiler
        System.out.println(PI);

        float decimal1 = 3.5f; // for flaot needs f at the end
        System.out.println(decimal1);



    }




}
