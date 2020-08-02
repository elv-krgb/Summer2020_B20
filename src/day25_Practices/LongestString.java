package day25_Practices;

public class LongestString {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Ali"};

        int maxlength =arr[0].length(); // 4

        for(String each: arr){ //
            if(each.length()>maxlength){
                maxlength=each.length();
            }
        }

        for(String each: arr){
            if(each.length()==maxlength){
                System.out.println(each);
            }
        }
    }

}
