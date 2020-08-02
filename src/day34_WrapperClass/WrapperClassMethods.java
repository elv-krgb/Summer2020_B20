package day34_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str = "123"; // 123
        int a = Integer.parseInt(str);

        System.out.println(str+1); // 1231
        System.out.println(a+1); // 124

        double d1 = Double.parseDouble("7.5");

        System.out.println(d1-1);

        String s1 ="TRUE";
        boolean b1 = Boolean.parseBoolean(s1);
        System.out.println(!b1);

        System.out.println("====================================================");

        String s2 = "10000.5";
        Double d2 = Double.valueOf(s2);
        // wrapper class = wrapper class

        System.out.println(d2*2);

        String s3 = "False";
        Boolean b2 = Boolean.valueOf(s3);
        //boolean b2 = Boolean.valueOf(s3);

        System.out.println(b2);








    }
}


