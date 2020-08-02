package day06_RelationOperators;

public class Swap2 {
    /*
    task03:
            create a class called Swap, and write a program that can swap two variables' values wihtout using temporary variable
                    Ex:
                        int a =10;
                        int b= 15;
                    output:
                        System.out.println(a); ===> 15
                        System.out.println(b); ===> 10

     */
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + b; // a = 25;  b = 15
        b = a - b; // b = 10; a = 25
        a = a - b; // a = 15

        System.out.println(a);
        System.out.println(b);







    }

}
