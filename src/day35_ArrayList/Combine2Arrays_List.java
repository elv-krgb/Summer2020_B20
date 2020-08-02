package day35_ArrayList;

import java.util.ArrayList;

public class Combine2Arrays_List {
    public static void main(String[] args) {

        String[] group1 = {"Aalia", "Aslan", "Ernis"};
        String[] group2 = {"Zarina", "Irina", "Virginia", "Ali", "Dawud"};

        ArrayList<String> studentList = new ArrayList<>();

        for(String eachEl : group1){
            studentList.add(eachEl);
        }

        for(String eachEl : group2){
            studentList.add(eachEl);
        }
        System.out.println(studentList);







    }

}
