package day19_ForLoop;

public class BranchingStatement {
    public static void main(String[] args) {

        char ch ='A';
        while(ch <= 'E'){
            if(ch == 'C'){
                ch++;
                continue; // skips everything even the iterator
                // break;
            }
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();

       /* if(true){
            System.out.println("Started");
            System.exit(0);
        }
        System.out.println("Done");

        */

        boolean a = true;

        while(a){
            System.out.println("Test started");
           // break; exits only loop
            System.exit(0); // terminates the entire program, wont be able to print anything after
        }

        System.out.println("Completed");
    }

}
