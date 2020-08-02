package day24_Arrays;

public class UniqueWords2 {
    public static void main(String[] args) {
        String[] words = {"C#", "C#", "Java", "Python", "Python", "C++"};

        for (String each : words) {

            int count = 0;
            for (String e : words) { // b represent each elements in the array words
                if (each.equals(e)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);

            }

        }

    }
}
