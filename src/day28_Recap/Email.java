package day28_Recap;
/*
3. write a program that can get the name and domain of any given email address
        Ex:
            cybertek@gmail.com
            output:
                name: cybertek
                domain: gmail
 */

public class Email {
    public static void main(String[] args) {

        String email = "cybertek.school@gmail.com";

        String name = email.substring(0,email.indexOf("@")); // ending index always excluded
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        // first index always included, that's why we need to add +1

        System.out.println("name: "+name);
        System.out.println("domain: "+domain);

    }

}
