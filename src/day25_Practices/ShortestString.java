package day25_Practices;

public class ShortestString {
    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Ali"};

        int minlength =arr[0].length(); // 4

        for(int i=0; i<=arr.length-1; i++){ // to find out the minimum length of string in arr
            int l = arr[i].length();  // 4  8  4  8
            if(l<minlength){
                minlength=l;
            }
        }

        for(int i=0; i<=arr.length-1; i++){
            if(arr[i].length()==minlength){
                System.out.println(arr[i]);
            }
        }







    }

}
