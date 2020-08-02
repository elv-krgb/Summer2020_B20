package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWords2 {
    public static void main(String[] args) {

        String str = "Javajavajava java";
        str = str.toLowerCase();

        int count =0;

        while(str.contains("java")){
            count++;
            str=str.replaceFirst("java", ""); // removes java from string
        }
        System.out.println(count);


    }

}
