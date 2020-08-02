package day07_Unary_ShortHand;

public class Quiz {
    public static void main(String[] args) {

        int iNum = 100;
        double dNum = 200;
        float fNum = 300;

        iNum = (int)fNum; // iNum = fNum // can not without casting
        fNum = iNum;
        dNum = fNum;
        fNum = (float)dNum; // fNum = dNum // can not without casting
        dNum = iNum;
        iNum = (int)dNum; // iNum = dNum // can not without casting

        System.out.println("Result A" + 0 + 1); // Result A01
        System.out.println("Result B" + (1) + (2)); // Result B12
        System.out.println("Result C" + (1 + 2)); // Result C3

        System.out.println("5 + 2 = " + 3 + 4); // 5 + 2  = 34
        System.out.println("5 + 2 = " + (3 +4)); // 5 + 2 = 7

        long a = 30l;
        long b = a; // long b = (short)a// impl casting // don't need

        float a1 = 100.987_6543f;
        short b1= (byte)a; // short b = a // no need ()
        byte c1 = (byte)b;

        System.out.println( (int)(10.0/3) ); // 3








    }


}
