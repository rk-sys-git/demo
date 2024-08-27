package Laptop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListImpl implements Land {
    @Override
    public List<Lpdetails> create(){
        List l=new ArrayList();
        Lpdetails ld=new Lpdetails();
        ld.setLaptopName("lenovo");
        ld.setScreenSize("14 inch");
        ld.setRam("4gb");
        Lpdetails a=new Lpdetails();
        a.setLaptopName("HP");
        a.setScreenSize("15.l6 inch");
        a.setRam("8 gb");
        Lpdetails b=new Lpdetails();
        b.setLaptopName("thosiba");
        b.setScreenSize("16 inch");
        b.setRam("16 gb");
        Lpdetails c=new Lpdetails();
        c.setLaptopName("dell");
        c.setScreenSize("14 inch");
        c.setRam("6 gb");
        l.add(ld);
        l.add(a);
        l.add(b);
        l.add(c);
        return l;

    }
    @Override
    public void dispaly(List<Lpdetails> lr){
        Iterator jm=lr.iterator();
        while (jm.hasNext()){
            Object ott=jm.next();
            Lpdetails z=(Lpdetails) ott;
            System.out.println(z.getLaptopName());
            System.out.println(z.getScreenSize());
            System.out.println(z.getRam());
        }

    }
}
