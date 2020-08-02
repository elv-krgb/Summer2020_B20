package day10_IfStatements;

public class if_WithoutCurlyBraces {
    public static void main(String[] args) {
        if(9<10) {
            System.out.println("hello");
            System.out.println("how are you"); // both get executed
        }

        System.out.println("=======================================");

        if(9>10)
            System.out.println("Hello");
        System.out.println("How are you");// doesnt belong to if. will executed anyway
    }
    //     never use without {}

}
