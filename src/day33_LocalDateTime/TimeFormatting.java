package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy, EEEE");
        LocalDate ld = LocalDate.of(2020,7,25);
        System.out.println(ld);
        System.out.println(ld.format(dateFormat));


        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime now = LocalTime.now();
        System.out.println(now.format(timeFormat));
        System.out.println("==================================================================");

        // May/20/2019 Dayname 4:30pm
        DateTimeFormatter DTFormat = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE hh:mm a");
        LocalDateTime time1 = LocalDateTime.of(2019,5,20, 16,30);
        System.out.println(time1);
        System.out.println(time1.format(DTFormat));

        System.out.println(LocalDateTime.now().format(DTFormat));
        System.out.println("==================================================================");

        //Saturday 4:34:45 pm
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");
        LocalDateTime rNow = LocalDateTime.now();
        System.out.println(rNow.format(dtf));



        DateTimeFormatter b = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate a  = LocalDate.of(1990, 7,11);
        System.out.println(a.format(b));

        DateTimeFormatter d = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime c = LocalTime.of(12,30);
        System.out.println(c.format(d));









    }

}
