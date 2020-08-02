package day11_NestedIf_Ternary;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class NestedIf_Practice1 {
    /*
      precondition: minimum salary of 30k
        sub condition: minimum 2 years of job history
    */
    public static void main(String[] args) {

        double salary = 120_000;
        double jobHistory = 1;

        if (salary >= 30000) {
            if (jobHistory >= 2) {
                System.out.println("You are qualified");
            } else {// jobHistory < 2
                System.out.println("You must have been on job at least 2 years");
            }

        } else {
            System.out.println("You must earn at least $30K");
        }

    }




}
