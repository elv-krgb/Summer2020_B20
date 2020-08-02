package day26_MultiDimensionalArray;
/*
2. write a program that can return the number of appearances of “java” and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python

 */

import java.util.Arrays;

public class Java_Python {
    public static void main(String[] args) {
        String sentence = "I love Java, Python is cool Java java javascript ";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int countJava = 0;
        int countPython = 0;

        for( String each: words){ // check each element
            if(each.toLowerCase().contains("java")){
                countJava++; // to hold count of word "Java"
            }else if(each.toLowerCase().contains("python")){
                countPython++;
            }

        }
        System.out.println("Java: " + countJava);
        System.out.println("Python: " + countPython);
        System.out.println(countJava==countPython);

    }

}
