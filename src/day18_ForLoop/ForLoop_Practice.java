package day18_ForLoop;

public class ForLoop_Practice {
    public static void main(String[] args) {

        System.out.println("Cybertek Batch 20");

        for (int i = 1; i <= 5; i++){// i: 1, 2, 3, 4, 5, 6-false
            //                  ++i
            System.out.println("Cybertek Batch 20"); // prints 5 times
        }

        System.out.println("================================================");

        for (int i = 1; i <=100; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("==================================================");

        for (int i = 100; i>=1; i--){
            System.out.print(i+" ");

        }

    }

}
