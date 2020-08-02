package day07_Unary_ShortHand;

public class Shorthand {
    public static void main(String[] args) {
        int a = 100;
          //a = a * a;
        a *=a;
        System.out.println(a); // 10000

        int b = 2;
        b *= 3;
        System.out.println(b); // 6

        // -=
        int c = 300;
        c -= 100;
        System.out.println(c); // 200

        System.out.println("===================================");

        //+=
        int z = 300;
        z += 200; // z = z + 200
        System.out.println(z);

        String schoolName = "Cybertek";
             //schoolName = schoolName + " School";
        schoolName += " School";
        System.out.println(schoolName);

        String fullName = "Mickey";
        fullName += " Mouse";
        System.out.println(fullName);

        // /=
        int budget = 100_000;
            budget /= 4;
        System.out.println(budget);

        int q = 100;
        System.out.println(q/2); // 50, bust didn't change the value of q
        System.out.println(q);

        int x = 100;
        x/= 2; // x = 50
        System.out.println(x); // 50
        x *= 2; // x = 100
        System.out.println(x); // 100

        // %=
        int num = 100;
        num %= 3;
        System.out.println(num); // 1

        double num2 = 400.5;
        num2 %= 2;
        System.out.println(num2); //0.5




    }



}
