package day25_Practices;

public class ShortestString2 {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Ami", "Nurmamet", "Ali"};

        int minlength =arr[0].length(); // 4

        for(String each: arr){ // to find out the minimum length of string in arr

            if(each.length()<minlength){
                minlength=each.length();
            }
        }

        for(String each: arr){
            if(each.length()==minlength){
                System.out.println(each);
            }
        }



    }
}
