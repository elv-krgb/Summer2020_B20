package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {
    public static void main(String[] args) {
        String[] names = {"Zeliha", "Roza", "Assylkhan", "Dilyar", "Paban"};
        LocalDate[] birthDays = {LocalDate.of(1987,7,5),
                LocalDate.of(1993,11,25),
                LocalDate.of(1989,3,6),
                LocalDate.of(1987,11,2),
                LocalDate.of(1988,11,2)};

        // Assylkhan: March/6/1989
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        for(int i=0; i<=names.length-1; i++){
            System.out.println(names[i]+" : "+birthDays[i].format(dateFormat));
        }


    }

}
