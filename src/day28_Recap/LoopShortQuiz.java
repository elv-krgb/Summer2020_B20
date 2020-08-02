package day28_Recap;

public class LoopShortQuiz {
    public static void main(String[] args) {

        int a = 0;

        while(a<=6) { // true a+2=2, so a=2,
            // true a+2=4, so a=4,
            //  true a+2=6, so a=6
            //   true a+2=8. so a=8
            //    false, because a=8, 8<=6 ==> false
            a+=2;

        }
        System.out.println(a); // a = 8

        int i = 0;
        int j = 7;
        //       i< 6
        for(i=0; i<j-1; i+=2){ // i: 0 2 4 6
        //
            System.out.print(i+" "); //0 2 4
        }
        System.out.println();
        System.out.println(i);

        for(int k=0; k<=4;){
            k++; // k: 1 2 3 4
            System.out.print(k+" "); // 1 2 3 4

            //k++; // 0 1 2 3 4
        }
        System.out.println();

        int z = 5; // 5+5+4+3+2+1 = 20
        for(int q = 5; q >0; q--){ // q: 5 4 3 2 1
            z+=q;
        }
        System.out.println(z);





    }

}
