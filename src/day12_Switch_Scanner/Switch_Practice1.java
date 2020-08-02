package day12_Switch_Scanner;

public class Switch_Practice1 {

    public static void main(String[] args) {

        long c = 10; // 10L can not use in switch
        float f = 10; // 10.0f can not use in switch
        double d = 10; // 10.0 can not use in switch
        //boolean // can not use in switch

        int num = 2;
        String result = "";

        switch (num){
            case 1:
                result ="Monday";
                break;

            case 2:
                result ="Tuesday";
                break  ;

            case 3:
                result = "Wednesday";
                break;

            case 4:
                result ="Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                result = "Invalid";

        }
        System.out.println(result);

    }

}
