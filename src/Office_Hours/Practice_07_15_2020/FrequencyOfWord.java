package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "catcatcat cat dog dog ";

        int countOfCat =0;// to hold count of "cat"
        while(str.contains("cat")){ // if it is true count +1
            countOfCat++; // if word contains "cat" count+1, before it was 0
            str=str.replaceFirst("cat", "");// we replaced firs cat
        }

        int countOfDog = 0;
        while (str.contains("dog")){
            countOfDog++;
            str=str.replaceFirst("dog","");

        }
        System.out.println(countOfCat);
        System.out.println(countOfDog);
        System.out.println(countOfCat==countOfDog);







    }

}
