package day18_ForLoop;
/*
write a program that will return the domain of an email address:
            Ex:
                input: test@gmail.com
                output: the domain of the email is: gmail
                inputL: Cybertek@yahoo.com
                output: the domain of the email is: yahoo
 */

import java.util.Scanner;

public class EmailDomain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String email = scan.next();
        int index1 = email.indexOf("@"); // 8
        int index2 = email.indexOf("."); // 14

        String domain = email.substring(index1+1,index2); //gmail
        System.out.println(domain);



    }

}
