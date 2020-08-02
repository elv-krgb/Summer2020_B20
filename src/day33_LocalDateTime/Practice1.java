package day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1 {
    public static void main(String[] args) {
        String[] names = {"Zeliha", "Roza", "Assylkhan", "Dilyar", "Paban"};
        LocalDate[] birthDays = {LocalDate.of(1987,7,5),
                             LocalDate.of(1993,11,25),
                             LocalDate.of(1989,3,6),
                             LocalDate.of(1987,11,2),
                             LocalDate.of(1988,11,2)};

        for(int index = 0; index<=names.length-1; index++){
//            System.out.println(names[index]);
//            System.out.println(birthDays[index]);
            System.out.println(names[index] + " : "+birthDays[index]);

        }

        System.out.println("==========================================");
        for(LocalDate each : birthDays){
            if(!each.isLeapYear()){
                continue;
            }
            System.out.println(each);
        }


    }

}
