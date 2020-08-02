package day33_LocalDateTime;

public class Uniques {
    public static void main(String[] args) {
        int[] arr = {2,2,1,3,3};

        for(int element : arr){
            int count = 0;
            for(int eachElement : arr){
                if(element == eachElement){
                    count++;
                }
            }

            if(count==1){
                System.out.print(element+" ");
            }
        }
        System.out.println();

/*
        int element = arr[0];
        int count = 0;
        for(int eachElement : arr){
            if(element == eachElement){
                count++;
            }
        }

        if(count==1){
            System.out.println(element);
        }

 */

        System.out.println("=============================================");
        int[] n1 = {10,30,50,50,40,30};
            uniqueElements(n1);

        System.out.println("==============================================");
        double[] n2 = {10,20,20,40,50};
            uniqueElements(n2);

        System.out.println("==============================================");
        String[] n3 = {"A","B","B","C","A"};
        uniqueElements(n3);

        System.out.println("==============================================");
        char[] n4 = {'A', 'B', 'B', 'C'};
        uniqueElements(n4);



    }

    public static void uniqueElements(int[]arr){
        for(int element : arr){
            int count = 0;
            for(int eachElement : arr){
                if(element == eachElement){
                    count++;
                }
            }

            if(count==1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }

    public static void uniqueElements(double[]arr){
        for(double element : arr){
            int count = 0;
            for(double eachElement : arr){
                if(element == eachElement){
                    count++;
                }
            }

            if(count==1){
                System.out.print(element+" ");
            }
        }

        System.out.println();

    }

    public static void uniqueElements(char[]arr) {
        for (char element : arr) {
            int count = 0;
            for (char eachElement : arr) {
                if (element == eachElement) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(element + " ");
            }
        }

        System.out.println();
    }

    public static void uniqueElements(String[]arr) {
        for (String element : arr) {
            int count = 0;
            for (String eachElement : arr) {
                if (element.equals(eachElement)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.print(element + " ");
            }
        }

        System.out.println();
    }





    }
