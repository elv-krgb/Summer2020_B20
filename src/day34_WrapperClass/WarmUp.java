package day34_WrapperClass;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class WarmUp {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE, hh:mm a, MMM/dd/yyyy");
        //LocalDateTime a = LocalDateTime.of(2020, 7,26, 9,51);
        LocalDateTime today = LocalDateTime.now();

        System.out.println(today.format(dtf));









    }

}
