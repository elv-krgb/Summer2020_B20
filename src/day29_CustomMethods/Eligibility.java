package day29_CustomMethods;



import java.util.Scanner;

public class Eligibility {

    public static void eligibleToBuyAlcohol(boolean hasId, int age){
        if(hasId && age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are eligible to buy milk");
        }
    }


    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        vote("John",28,true,"Trump");
        vote("Daniel",17,true, "Biden");

        eligibleToBuyAlcohol(true,19);

        calculator(100,'/',20);





    }

    public static void vote(String name, int age, boolean citizenship, String candidateName){
        boolean eligibleToVote = age>=18 && citizenship==true;
        if(eligibleToVote) {
            System.out.println(name + "is eligible to vote for " + candidateName);
        }else{
            System.out.println(name+ " is not eligible to vote");
        }
    }

    public static void calculator(double num1, char operator, double num2){
        // operators: +, -, *, /, %
        switch (operator){
            case '+':
                System.out.println("Addition: "+ (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1-num2));
                break;
            case '*':
                System.out.println("Multiplication: " + (num1*num2));
                break;
            case '/':
                System.out.println("Division: " + (num1/num2));
                break;
            case '%':
                System.out.println("Remainder: " + (num1%num2));
                break;
            default:
                System.out.println("Invalid Operator");

        }
    }








}
