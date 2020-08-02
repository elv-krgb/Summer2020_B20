package day29_CustomMethods;
/*
step1: print hello world 5 times
step2: print your school name 1 time
step3: print hello world 5 times
step4: print your name 1 time
step5: print hello world 5 times
 */
public class MethodWithoutParameter2 {
    public static void main(String[] args) {
        printHello5x();   // step1
        System.out.println("Cybertek"); // step2
        printHello5x();   // step3
        System.out.println("Elvira"); // step4
        printHello5x();  //  step5




    }

    public  static void printHello5x(){
        for(int i=10; i>=6; i--){
            System.out.println("Hello World");
        }








    }


}
