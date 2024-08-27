package Sqlexp;

import java.util.Scanner;

public class Maincrud {
    public static void main(String[]args){

        ImplCrud a=new ImplCrud();
        Scanner s=new Scanner(System.in);
        System.out.println("please enter array");
        int gt= s.nextInt();
        String[] array=a.create(gt);
        for(int i=0;i< array.length;i++) {
            Scanner d = new Scanner(System.in);
            System.out.println("plza enter name");
            String names = d.nextLine();
            array=a.insert(array,i,names);

        }
       a.read(array);
        Scanner l=new Scanner(System.in);
        System.out.println("enter update index value");
        int x=l.nextInt();
        Scanner y=new Scanner(System.in);
        System.out.println("plz enter update value");
        String upt=y.nextLine();
        a.update(array,x,upt);
        a.read(array);
        a.delete(array,2);
        a.read(array);


    }
}
