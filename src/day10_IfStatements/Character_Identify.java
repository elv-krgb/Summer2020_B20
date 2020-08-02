package day10_IfStatements;

public class Character_Identify {
    public static void main(String[] args) {
        char character = '1';

        boolean isAlphabetic = (character >= 65 && character >= 90) || (character>=97 && character<=122);
        boolean isDigit = character >=48 && character <=57;
        boolean isSpecialChar = !isAlphabetic && !isDigit;
                             // isAlphabetic == false && isDigit == false



        String alphabet = "";

        if(isAlphabetic){
            //System.out.println(character + " is Alphabetic character");
            alphabet = character + " is Alphabetic character";

        }else{
            //System.out.println(character + " is not Alphabetic character");
            alphabet = character + " is not Alphabetic character";
        }

        System.out.println(alphabet);


        String digit = "";

        if(isDigit){
            digit = character + " is a Digit";
        }else{
            digit = character + " is not a Digit";
        }

        System.out.println(digit);


        String specialCharacter = "";
        if(isSpecialChar){
            specialCharacter = character+" is a special character";
        }else{
            specialCharacter = character+" is not a special character";
        }
        System.out.println(specialCharacter);






    }

}
