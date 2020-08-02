package day19_ForLoop;
/*
3. print odd numbers between 0 to 50
    4. print even number between 0 to 50

 */
public class OddEvenContinue {
    public static void main(String[] args) {

        for(int i = 0; i<=50; i++){
            if(i % 2 != 0){ // if the number is odd, then skip
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i = 0; i<=50; i++){
            if(i % 2 == 0){// if the number is even, the skip
                continue;
            }
            System.out.print(i+" ");
        }




    }

}
