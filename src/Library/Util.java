package Library;

import java.util.Arrays;

public class Util {

    public static String removeDup(String str){ // "abab"
        String nonDup = ""; // if it is not contain here, we will add it "ab"
        //[a,b,a,b]
        for(String each : str.split("")){
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        return nonDup;
    }
    //removes the duplicates and returns the value string


    public static String reverseString(String str){
        String result = "";
        for(int i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);   // result+=str.substring(i, i+1)
        }
        return result;
    }
    // reverse the String and return the value


    public static int frequency(String str, char ch) { // it takes String and char and will return as an int
                                                      // int count = frequency of characters
                                                      // finds the frequency of char from String str
        int count = 0; // to store frequency
        for (char eachElement : str.toCharArray()) {
            if (eachElement == ch) {
                count++;
            }
        }
        return count;
    }
    // finds rhe frequency of char from String str and returns it as int


    public static String uniques(String str){
        String uniques = ""; // to store unique characters
        for(char eachElement : str.toCharArray()){
            int count = frequency(str, eachElement); // frequency of every character
            if(count == 1) {
                uniques += eachElement;
            }
        }
        return uniques;
    }
    // returns the uniques from String


    public static String frequencyOfChars(String str){

        String expectedResult = ""; // A2B3C3
        String nonDup = Util.removeDup(str); // ABC

        for(char eachCharacter : nonDup.toCharArray()){
            int count = Util.frequency(str, eachCharacter);
            expectedResult += ""+eachCharacter + count;
        }
        return expectedResult;

    }
   //  returns the frequency of every single characters from String


    public static String formatFullName(String firstName, String lastName ){

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase(); // C + ybertek
        //convert first character to upper case      // convert rest of characters to lower case

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase(); // S + chool

        //String formalFormatFullName = first.concat(" "+last);
        String fullName = firstName+" "+lastName;

        return fullName;
    }
    // formats the full name


    public static int maxNum(int[] arr){
        int max = arr[0];

        for(int each : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
    // find and returns the max number from array


    public static double maxNum(double[] arr){
        double max = arr[0];

        for(double each : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
    // find and returns the max number from (double) array


    public static Integer maxNum(Integer[] arr){
        Integer max = arr[0];

        for(Integer each : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
    // find and returns the max number from Integer array


    public static Double maxNum(Double[] arr){
        Double max = arr[0];

        for(Double each : arr ){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
    // find and returns the max number from Double array


    public static int minNum(int[] arr){
        int min = arr[0];

        for(int each : arr ){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
    // find and returns the min number from array


    public static double minNum(double[] arr){
        double min = arr[0];

        for(double each : arr ){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
    // find and returns the min number from (double) array


    public static Integer minNum(Integer[] arr){
        Integer min = arr[0];

        for(Integer each : arr ){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
    // find and returns the min number from Integer array


    public static Double minNum(Double[] arr){
        Double min = arr[0];

        for(Double each : arr ){
            if(each < min){
                min = each;
            }
        }
        return min;
    }
    // find and returns the min number from Double array


    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int index = 0;
        for(int each  :  arr1){
            arr3[index] = each;
            index++;
        }

        for(int each : arr2){
            arr3[index]= each;
            index++;
        }

        return arr3;
    }
    // combines two (int) array and returns it


    public static double[] combine2Arrays(double[] arr1, double[] arr2){
        double[] arr3 = new double[arr1.length + arr2.length];

        int index = 0;
        for(double each  :  arr1){
            arr3[index] = each;
            index++;
        }

        for(double each : arr2){
            arr3[index]= each;
            index++;
        }

        return arr3;
    }
    // combines two (double) array and returns it


    public static char[] combine2Arrays(char[] arr1, char[] arr2){
        char[] arr3 = new char[arr1.length + arr2.length];

        int index = 0;
        for(char each  :  arr1){
            arr3[index] = each;
            index++;
        }

        for(char each : arr2){
            arr3[index]= each;
            index++;
        }

        return arr3;
    }
    // combines two (char) array and returns it


    public static Integer[] combine2Arrays(Integer[] arr1, Integer[] arr2){
        Integer[] arr3 = new Integer[arr1.length + arr2.length];

        int index = 0;
        for(Integer each  :  arr1){
            arr3[index] = each;
            index++;
        }

        for(Integer each : arr2){
            arr3[index]= each;
            index++;
        }

        return arr3;
    }
    // combines two Integer array and returns it


    public static Double[] combine2Arrays(Double[] arr1, Double[] arr2){
        Double[] arr3 = new Double[arr1.length + arr2.length];

        int index = 0;
        for(Double each  :  arr1){
            arr3[index] = each;
            index++;
        }

        for(Double each : arr2){
            arr3[index]= each;
            index++;
        }

        return arr3;
    }
    // combines two Double array and returns it


    public static Character[] combine2Arrays(Character[] arr1, Character[] arr2){
        Character[] arr3 = new Character[arr1.length + arr2.length];

        int index = 0;
        for(Character each  :  arr1){
            arr3[index] = each;
            index++;
        }

        for(Character each : arr2){
            arr3[index]= each;
            index++;
        }

        return arr3;
    }
    // combines two Character array and returns it



    public static String[] combine2Arrays(String[] arr1, String[] arr2){
        String[] arr3 = new String[arr1.length + arr2.length];

        int index = 0;
        for(String each  :  arr1){
            arr3[index] = each;
            index++;
        }

        for(String each : arr2){
            arr3[index]= each;
            index++;
        }

        return arr3;
    }
    // combines two (String) array and returns it



    public  static int[] addElement(int[]arr, int num){
        int[] arr2 = new int[arr.length+1];
        arr2[arr2.length-1] = num;

        int indexNum = 0;
        for( int eachElement : arr){
            arr2[indexNum] = eachElement;
            indexNum++;
        }
        return arr2;
    }
    // inserts the element to the array


    public static int[]  sortDesc(int[] arr){
        Arrays.sort(arr);

        int[] arr2 = new int[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    //


    public static double[] sortDesc(double[] arr){
        Arrays.sort(arr);

        double[] arr2 = new double[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
    //


    public static char[] sortDesc(char[] arr){
        Arrays.sort(arr);

        char[] arr2 = new char[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    // sorts char in descending order and returns it


    public static String[] sortDesc(String[] arr){
        Arrays.sort(arr);

        String[] arr2 = new String[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;

    }
    // sorts String in descending order and returns it


    public static Integer[]  sortDesc(Integer[] arr){
        Arrays.sort(arr);

        Integer[] arr2 = new Integer[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    // sorts Integer array in descending order


    public static Double[]  sortDesc(Double[] arr){
        Arrays.sort(arr);

        Double[] arr2 = new Double[arr.length];  //{5,4,3,2,1};

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    // sorts Doubler array in descending order


    public static Character[] sortDesc(Character[] arr){
        Arrays.sort(arr);

        Character[] arr2 = new Character[arr.length];

        int k = arr.length-1;
        for(int i = 0; i <= arr2.length-1; i++  ){
            arr2[i]  =  arr[k];
            k--;
        }

        return arr2;
    }
    // sorts Character array in descending order










}
