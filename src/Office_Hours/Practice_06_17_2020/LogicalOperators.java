package Office_Hours.Practice_06_17_2020;

public class LogicalOperators {

    public static void main(String[] args) {
        boolean r1 = !true !=true;
        //           false !=true ==> true
        //           false does't not equal true ==> true
        System.out.println(r1);

        boolean r2 = !r1;
        System.out.println(r2); // false

        System.out.println( !!!!!false); // true

        System.out.println(( !!!!!!true)); // true

        System.out.println("=======================================");

        // ||: either
        boolean result1 = 9 > 10 || "Java" == "Java" || 'A' == 'a';
        //                false  ||  true            || false
        System.out.println(result1); // true

        // &&
        boolean result2 = "Java" != "Phyton" && "Muhtar" == "Good Guy";
        //                      true         &&  false
        System.out.println(result2); // false


    }


}
