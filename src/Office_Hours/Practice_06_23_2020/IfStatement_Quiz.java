package Office_Hours.Practice_06_23_2020;

public class IfStatement_Quiz {

    public static void main(String[] args) {

        // q2

        int score = 0;

        if(score == 0){
            // 0 == 0 ==> true
            score += 50;  // score = score + 50; = 50;

        }

        if (score != 0){
            // 50 != 0 ==> true
            score += 50; // score = 100
        }

        System.out.println(score);

        System.out.println("================================");
        //q3:

        char grade = 'A';
        boolean passed = grade == 'A' || grade == 'B';
        //                 'A" == 'A'
        //                   true

        boolean passed2 = grade == 'C' || grade == 'D';
        //                  'A' == 'C' || 'A' == 'D'
        //                    false    ||    false ==> false

        if(passed || passed2){
            //true|| false ==> true
            System.out.println("You passed the exam");
        }else{
            System.out.println("You failed");
        }

        //q9

        int number = 10;

        if(--number > 10){
            System.out.println("Hello Cybertek "+ number);
        }else{
            System.out.println("Hello Work "+ number);
        }



    }


}
