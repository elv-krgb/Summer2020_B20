package Day09_IfStatement;

public class Minimum {
    public static void main(String[] args) {
        double a = 1000;
        double b = 200;
        double c = 300;

        boolean aIsMin = a < b && a < c;
        boolean bIsMin = aIsMin == false && b < c;
        //               b < a && b < c
        boolean cIsMin = !aIsMin && !bIsMin;
        //               aIsMin == false && bIsMin == false;
        //               c < a && c < b

        double min = 0;

        if(aIsMin){
          min = a;
        }

        if(bIsMin){
           min = b;
        }

        if(cIsMin){
            min = c;
        }
        System.out.println(min+ " is minimum number");


    }

}
