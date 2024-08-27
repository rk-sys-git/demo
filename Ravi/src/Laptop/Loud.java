package Laptop;

import java.util.ArrayList;
import java.util.List;

public class Loud {
    public static void main(String[]args){
        List<Lpdetails> lpdetails=new ArrayList<>();
        Lpdetails lpdetails1=new Lpdetails();
        lpdetails1.setLaptopName("lenovo");
        lpdetails1.setRam("16gb");
        lpdetails1.setScreenSize("14inch");

        Lpdetails lpdetails2=new Lpdetails();
        lpdetails2.setLaptopName("sony");
        lpdetails2.setRam("8gb");
        lpdetails2.setScreenSize("16inch");

        Lpdetails lpdetails3=new Lpdetails();
        lpdetails3.setLaptopName("dell");
        lpdetails3.setRam("4gb");
        lpdetails3.setScreenSize("14inch");

        lpdetails.add(lpdetails1);
        lpdetails.add(lpdetails2);
        lpdetails.add(lpdetails3);

        for (Lpdetails ud:lpdetails){
            System.out.println("----------------------------------------------------------------");
            System.out.println(ud.getLaptopName());
            System.out.println(ud.getScreenSize());
            System.out.println(ud.getRam());
        }
    }
}
