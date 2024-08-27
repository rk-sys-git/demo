package Tv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tvimpl implements Tv{
    @Override
    public List<Tvdetails> create(){
        List l=new ArrayList();
        Tvdetails t=new Tvdetails();
        t.setTvbrand("sony");
        t.setTvsize("43 inch");
        t.setResolution("4k");
        t.setTvcost(45000);
        Tvdetails t1=new Tvdetails();
        t1.setTvbrand("samsung");
        t1.setTvsize("50 inch");
        t1.setResolution("4k");
        t1.setTvcost(58000);
        Tvdetails t2=new Tvdetails();
        t2.setTvbrand("lg");
        t2.setTvsize("55 inch");
        t2.setResolution("2k");
        t2.setTvcost(60000);
        Tvdetails t3=new Tvdetails();
        t3.setTvbrand("onida");
        t3.setTvsize("65 inch");
        t3.setResolution("2k");
        t3.setTvcost(50000);
        l.add(t);
        l.add(t1);
        l.add(t2);
        l.add(t3);
        return l;
    }
    @Override
    public void display(List<Tvdetails> tr){
        Tvdetails t3=new Tvdetails();
        t3.setTvbrand("mi");
        t3.setTvsize("49 inch");
        t3.setResolution("2k");
        t3.setTvcost(40000);
        Tvdetails t4=new Tvdetails();
        t4.setTvbrand("vu");
        t4.setTvbrand("55 inch");
        t4.setResolution("1080p");
        t4.setTvcost(22000);
        tr.add(t3);
        tr.add(t4);
        for(Tvdetails t:tr){

       /*Iterator ite= tr.iterator();
        System.out.println("-----------------------------------------------------");
        while (ite.hasNext()){
            Object ott=ite.next();
            System.out.println("-----------------------------------------------------");
            Tvdetails sd=(Tvdetails) ott;*/
            System.out.println(t.getTvbrand());
            System.out.println(t.getTvsize());
            System.out.println(t.getResolution());
            System.out.println(t.getTvcost());
        }
    }
}

