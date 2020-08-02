package Office_Hours.Practice_07_14_2020;

public class UniqueWords {
    public static void main(String[] args) {

        String[] words = {"C#", "C#", "Python", "Python", "Java"}; // represents elements
        // 5 elements
        // 4 index numbers

        for(String b:words) {
            // String b = indexNum 0

            //String s = words[b]; // String s = indexNum 0
            int count = 0; //

            for (String a : words) { // to get frequency of String words
                if (a.equals(b)) { // if element 1 == index 0
                    count++; // then count +1
                }
            }

            if (count == 1) {
                System.out.println(b);
            }
        }



    }

}
