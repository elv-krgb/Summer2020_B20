package day11_NestedIf_Ternary;

public class NestedIf {
    /*
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    0 ~ 59 ==> F
    other ==> Invalid

     */

    public static void main(String[] args) {
        int score = 76;
        String result = "";

        if(score >=0 && score <=100){ // valid score

            if(score >= 90){ // && score < 100
                result = "A";
            }else if(score >= 80){ // && score < 90
                result = "B";
            }else if(score >= 70){ // && score < 80
                result = "C";
            }else if(score >= 60){ // && score < 70
                result = "D";
            }else{
                result = "F";
            }

        }else{ // invalid score
            result = "Invalid";

        }
        System.out.println(result);

        System.out.println("====================================");

        /*
        precondition: minimum salary of 30k
        sub condition: minimum 2 years of job history
         */












    }



}
