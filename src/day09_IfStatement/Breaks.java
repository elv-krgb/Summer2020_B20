package Day09_IfStatement;

public class Breaks {
    public static void main(String[] args) {

        String itsBreakTime = "no";

        if(itsBreakTime == "yes"){
            System.out.println("Takr 15 minutes break");
        }else{
            System.out.println("Continue the class ");
        }

        System.out.println("=====================================");

        int a = 1000;
        int b = 200;

        if(a>b){
            System.out.println(a+ " is greater");
        }else{
            System.out.println(b + " is greater");
        }


    }

}
