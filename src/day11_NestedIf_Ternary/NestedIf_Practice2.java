package day11_NestedIf_Ternary;

import sun.jvm.hotspot.ui.tree.CStringTreeNodeAdapter;

public class NestedIf_Practice2 {

    public static void main(String[] args) {
        int day = 6;
        boolean validNumber = day>=1 && day<=7;
        String result = "";

        if(validNumber){ // 1<= day <=7
           /* if(day==7){
                result = "Monday";
            }else if(day==6){
                result = "Saturday";
            }else if(day==5){
                result = "Friday";
            }else if(day==4){
                result = "Thursday";
            }else if(day==3){
                result = "Wednesday";
            }else if(day==2){
                result = "Tuesday";
            }else{
                result = "Monday";
            }

            */
            result = (day==7)? "Sunday" :(day==6)? "Saturday" :(day==5)? "Friday"
                    :(day==4)? "Thursday" :(day==3)? "Wednesday" :(day==2)? "Tuesday"
                    : "Monday";

        }else{ // invalid number
            result = "There is no such a day";
        }
        System.out.println(result);





    }


}
