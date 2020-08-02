package Office_Hours.Practice_07_14_2020;

public class Unique {
    public static void main(String[] args) {

        String str = "ABABC";
        String expectedResult = ""; // to store unique character "C"

        // str = "ABABC"

        for(int j =0; j<=str.length()-1; j++) { // this outer loop getting each character from String str
            char ch = str.charAt(j);           // and assign to char ch
            int count = 0; // frequency of ch

            for (int i = 0; i <= str.length() - 1; i++) { // this inner loop helps us to calculate the frequency of ch
                char each = str.charAt(i);               // and assign to char each
                if (each == ch) {
                    // if A==A; if B==B; if A==A; if B==B; if C==C;
                    count++; // count+1+1+1+1+1
                    // A count 2; B count 2; C count 1

                }
            }

            if (count == 1) { // it frequency == 1, it means it is unique
                expectedResult += ch; // and we assign to String expectedResult

            }

        }
        System.out.println(expectedResult);
    }
}
