package Laptop;

import java.util.List;

public class MainoneClass {
    public static void main(String[]args){
        LaptopImpl laptop=new LaptopImpl();
        List<Lpdetails> lp =laptop.create();
        laptop.display(lp);
    }
}
