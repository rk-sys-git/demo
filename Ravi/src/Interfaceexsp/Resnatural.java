package Interfaceexsp;

import java.util.Scanner;

public class Resnatural {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("ple enter number");
        int b=s.nextInt();
        System.out.println("number is"+b);
        Impnatur r=new Impnatur();
        int x=r.sum(b);
        System.out.println("enter"+x);
    }
}
