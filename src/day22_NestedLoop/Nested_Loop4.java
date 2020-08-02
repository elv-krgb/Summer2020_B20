package day22_NestedLoop;
/*

 *
 **
 ***
 ****
 *****
 ******
 *******

 *******
 ******
 *****
 ****
 ***
 **
 *



 */
public class Nested_Loop4 {
    public static void main(String[] args) {

        for (int j = 1; j <= 7; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=====================================");

        int h =1;
        while(h <=7){
            for(int v=h; v>=1;v--){
                System.out.print("*");
            }
            System.out.println();
            h++;
        }
        System.out.println("======================================");

        String shape = "";
        for (int i = 1; i <=7; i++){
            shape += "*";
            System.out.println(shape);
        }
        System.out.println("====================================");

        for(int j=7; j>=1; j--){
            for(int k=j; k>=1; k--){
                System.out.print("*");
            }
            System.out.println();
        }











    }
}



