package day29_CustomMethods;


public class Method_Practice {
    /*
    task:
    1. create a method that can print odd numbers between 1~100
    2. create a method that can print even numbers between 0~100
    */

    public static void main(String[] args) {
        oddNumbers();
        System.out.println("Hello");
        evenNumbers();


    }

    // task1:
    public static void oddNumbers(){
        for(int i=1; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    // task2:
    public static void evenNumbers(){
        for(int i=0; i<=100; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
    }





}
