package day29_CustomMethods;

public class Uniques {
    public static void main(String[] args) {
        String[] arr = {"A","B","B","C","D", "E"};

        for(String a:arr){ // to get each element
            int count = 0;

            for(String each: arr){ // to get frequency of the elements
                if(a.equals(each)){
                    count++;
                }
            }

            if(count==1){ // if count is 1, means unique
                System.out.print(a+" ");
            }
        }

        System.out.println();






    }

}
