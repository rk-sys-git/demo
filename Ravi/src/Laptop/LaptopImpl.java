package Laptop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LaptopImpl implements Laptop{
    @Override
    public List<Lpdetails> create(){
        List<Lpdetails> lpdetails=new ArrayList<>();
        Lpdetails lpdetails1=new Lpdetails();
        lpdetails1.setLaptopName("lenovo");
        lpdetails1.setScreenSize("14");
        lpdetails1.setRam("8gb");

        Lpdetails lpdetails2=new Lpdetails();
        lpdetails2.setLaptopName("dell");
        lpdetails2.setScreenSize("16");
        lpdetails2.setRam("6gb");

        Lpdetails lpdetails3=new Lpdetails();
        lpdetails3.setLaptopName("samsung");
        lpdetails3.setScreenSize("14");
        lpdetails3.setRam("8gb");

        lpdetails.add(lpdetails1);
        lpdetails.add(lpdetails2);
        lpdetails.add(lpdetails3);


        return lpdetails;
    }
    @Override
    public void display(List<Lpdetails> ll){
        Iterator jm= ll.iterator();
        while (jm.hasNext()){
            Object obj=jm.next();
            Lpdetails kk=(Lpdetails) obj;
            System.out.println("---------------------------------");
            System.out.println(kk.getLaptopName());
            System.out.println(kk.getScreenSize());
            System.out.println(kk.getRam());
        }

    }
}
