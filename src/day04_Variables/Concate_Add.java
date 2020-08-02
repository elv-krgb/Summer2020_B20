package day04_Variables;

public class Concate_Add {
    public static void main(String[] args) {
        // addition: number + number

        System.out.println( 12 + 13); // 1213 or 25/ 25 is correct
        System.out.println('A' + 2); // A2 or 67/ 67 is correct
        System.out.println('A' + 'B'); // 65 + 66 = 131


        // Concatenation: append

        System.out.println("12" + 13); // 1213
        System.out.println("A" + 2); // A2
        System.out.println("Gender: " + 'M'); // Gender: M
        System.out.println("Tax: " + 3.5); // Tax: 3.5
        System.out.println("Tax: " + 6.5 + "%"); // Tax: 6.5%
        System.out.println("Tax: " + 6.5 + '%'); // Tax: 6.5%
        System.out.println(3.5 + '%' + "Tax"); // 3.5 + 37= "Tax"
                                              // 40.5 + "Tax"



    }


}
