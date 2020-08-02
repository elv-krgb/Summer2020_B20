package day04_Variables;

public class Variables2 {
    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = 65;
        System.out.println(ch1);
        System.out.println(ch2);

        char ch3 = 35000;
        System.out.println(ch3);

        //char ch4 = 66000; can not be more then 65,535

        char ch5 = 56879;
        System.out.println(ch5);

        char c1 = 'A'; //65
        char c2 = 'B';//66   =131
        System.out.println(c1 + c2);

        int result = c1 + c2; //131
        System.out.println(result);

        double d = c1+c2;
        System.out.println(d);

        int num1 = 'A'; //65
        System.out.println(num1);

        char c4 = 65+45; //110 - n i acsii table
        System.out.println(c4);

        char c5 = 'z';
        char c6 = 897;
        System.out.println(c5);

        char c7 = '1'; //49

        System.out.println(c7); // char: '1'
        System.out.println( c7 + 1 ); // 49 + 1 = 50
//                         '1' + 1 = 49 + 1 = 50

        int r1 = c7;
        System.out.println(r1);// 49

        System.out.println("================================================");

        char a1 = 'A';
        System.out.println(a1);// prints A

        int n1 = 'A' + 2;
        System.out.println(n1); // prints 67 (65+2)

        char a2 = '@';
        char a3 = 64;
        System.out.println(a2);// prints @
        System.out.println(a3);// prints @

        System.out.println( '@' + 2 ); // prints 66







    }



}
