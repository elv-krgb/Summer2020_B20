package day29_CustomMethods;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "ababaabcfcabababcce";
        removeDupl(str); // abcfe

    }

    public static void removeDupl(String str){ // "abab"
        String nonDup = ""; // if it is not contain here, we will add it "ab"
                          //[a,b,a,b]
        for(String each : str.split("")){
            if(!nonDup.contains(each)){
                nonDup+=each;
            }
        }
        System.out.println(nonDup);
    }




}
