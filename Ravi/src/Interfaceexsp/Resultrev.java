package Interfaceexsp;

import java.util.Scanner;

public class Resultrev {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter length of array");
        int vol=s.nextInt();
        int input[]=new int[vol];
        for(int i=0;i<vol;i++){
            Scanner r=new Scanner(System.in);
            System.out.println("enter array value");
            int arr=r.nextInt();
            input[i]=arr;

        }
        Mathsimpl g=new Mathsimpl();

        int l[]= g.revfarra(input);
        for(int i=0;i<l.length;i++){
           System.out.println(l[i]);

        }
    }

}
