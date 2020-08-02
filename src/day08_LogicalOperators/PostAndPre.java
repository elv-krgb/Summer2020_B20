package day08_LogicalOperators;

public class PostAndPre {
    /*
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
                  */

    public static void main(String[] args) {

        int a = 3;
        int b = -a++ + - --a * a-- % 2;
        //     -200  - 200 * 200 % 2
        //     -200 - 40000 % 2
        //     -200 - 0 = -200
        System.out.println(b);
        System.out.println(a);


        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        //  z = 300 + 400 - 300 * 400 + 300/400
        // z = 300 + 400 -120,000 + 0.75(0, because it is int)
        // z = 300 + 400 -120_000 + 0

        System.out.println(z);



    }



}
