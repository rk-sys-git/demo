package Interfaceexsp;

import java.util.Scanner;

public class Facresult {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("please enter number");
        int fac=s.nextInt();
        System.out.println("entered"+fac);
        Impfact h=new Impfact();
        int rc=h.fact(fac);
        System.out.println(rc);

    }
}
