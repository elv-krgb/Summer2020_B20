package day19_ForLoop;
/*
1. write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5
2. write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5

 */
public class OddEven {
    public static void main(String[] args) {


        // Odd
        // i: 1 3 5 7 9 11 ....99
        // Solution #1
        for(int i=1; i<=99; i+=2){
            if(i % 5 == 0 && i % 3 == 0) {
                //if(i % 15 == 0
                System.out.print(i+" ");
            }
        }
        System.out.println();

        // Solution # 2
        for (int i = 0; i <= 100; i++){
            if(i % 2 != 0) { // pre: i must be odd number
                if (i % 5 == 0 && i % 3 == 0) { // sub: must be divisible by 3 & 5
                    System.out.print(i + " ");
                }
            }

        }
        System.out.println();
        System.out.println("=======================================");

        // Even
        // 0 2 4 6 8 10 ...100
        // Solution #1
        for(int i = 0; i <= 100; i+=2){
           if(i % 3== 0 && i % 5 == 0 ){
               System.out.print(i+" ");
           }
        }
        System.out.println();

        // Solution #2
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){// pre: i must be Even number
                if(i % 3 == 0 && i %5 == 0){// sub: must be divisible by 3 & 5
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();






    }

}
