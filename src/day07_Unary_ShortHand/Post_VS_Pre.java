package day07_Unary_ShortHand;

import java.sql.SQLOutput;

public class Post_VS_Pre {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a); // 11
        System.out.println(a); // 11

        System.out.println("=============================");
        int b = 10;
        System.out.println( b++ ); // 10
        System.out.println(b); // 11

        System.out.println("=============================");
        int c = 25;
        int d = c++; // d = 25
        // c = 26
        System.out.println(c);
        System.out.println(d);

        System.out.println("===============================");
        int e = 25;
        e++;
        System.out.println(e);

        System.out.println("================================");
        int x =8;
        int y = x--; // y = 8
        System.out.println(y); // 8
        System.out.println(x); // 7

        System.out.println("===============================");
        int A = 1; // A=0; A=1; A=0
        a = -A-- + A++ / -A-- * --A;
        //  A = -1 +  0  /  -1   * -1;
        //  A = -1 + 0 8 -1
        // A = -1 + 0 = -1
        System.out.println(A);

        int B = 50;
        B= --B + B++ + B-- + B++;
        // 49 + 49 + 50  + 49
        System.out.println(B); // 197

        int X =4;
        int Y = X * 4 - X++;
        // 4 * 4 - 4
        // y = 16 - 4
        System.out.println(Y); // 12


    }


}





