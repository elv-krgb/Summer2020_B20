package day33_LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimal {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        double a =22/7.0;
        System.out.println(a);
        System.out.println(df.format(a));

        double b = 32/9.0;
        System.out.println(b);
        System.out.println(df.format(b));

        System.out.println(df.format(6.66667888)); // 6.67
        System.out.println(df.format(6)); // 6.00

    }

}
