package day14_Recap;

import java.util.Scanner;

public class nextLine_Vs_rest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 19Enter
        input.nextLine();//Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();//Elvira Kargabaeva

        System.out.println("Enter your company Name: ");
        String companyName = input.nextLine();

        System.out.println(fullName+" is "+age+" years old");
    }

}
