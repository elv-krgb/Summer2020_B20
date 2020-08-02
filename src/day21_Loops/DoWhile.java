package day21_Loops;

public class DoWhile {
    public static void main(String[] args) {


        boolean result = false; // if it is true do while never get executed,

        while (result) {
            System.out.println("Hello World");
        }

        System.out.println("===============================");

        do { // just do it
            System.out.println("Hello World");
        }while(result);


    }
}

