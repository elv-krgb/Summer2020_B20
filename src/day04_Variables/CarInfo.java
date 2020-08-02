package day04_Variables;

public class CarInfo {

/*
Year
Brand
Model
Mileage
Price
print the info of the car

Ex:
2020
BMW
X6
30000
45000

Output:
2020 BMW X6, 30000 miles, $45000
*/

    public static void main(String[] args) {

        int year = 2020;
        String brand = "BMW";
        String model = "X6";
        short mileage = 30000;
        double price = 45000;
        String color = "White";

        System.out.println( year+" "+brand+" "+model+ ", " + color + ", "+mileage+" mileas, $"+price);


    }

}
