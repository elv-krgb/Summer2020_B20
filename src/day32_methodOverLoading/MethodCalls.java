package day32_methodOverLoading;
import  Library.Util;

import java.util.Arrays;

public class MethodCalls {
    public static void main(String[] args) {


        String firstName = "elKEm";
        String lastName = "emEt";

        String fullName;
        fullName = Util.formatFullName(firstName, lastName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);

        String reversedName = Util.reverseString(fullName);
        System.out.println(reversedName);

        System.out.println("===============================================");

        int[] a = {200, 400, 500, 200, 1000, 50, 40, 400};
        int n = 2500;
        a = Util.addElement(a, n);
        System.out.println(Arrays.toString(a));





    }








}
