package Pfamjily;

import java.util.ArrayList;
import java.util.List;

public class ImplFl implements Fl{
    public List<Family> create(){
    List<Family>  lr=new ArrayList();
    String[] a= new String[3];
    Family d1=new Family();
    d1.setId(20);
    d1.setName("uday");
    d1.setCity("chennai");
    a[0]="telugu";
    a[1]="english";
    a[2]="tamil";
    d1.setLanguages(a);
String[] b=new String[3];
    Family d2=new Family();
    d2.setId(30);
    d2.setName("Ravi");
    d2.setCity("amp");
    b[0]="telugu";
    b[1]="english";
    d2.setLanguages(b);
    String[] c=new String[3];
    Family d3=new Family();
    d3.setId(40);
    d3.setName("harsha");
    d3.setCity("bangaroe");
    c[0]="english";
    c[1]="telugu";
    d3.setLanguages(c);
    lr.add(d1);
    lr.add(d2);
    lr.add(d3);
    return lr;
    }
    public void display(List<Family> f){
        for(Family ft:f){
            System.out.println(ft.getId());
            System.out.println(ft.getName());
            System.out.println(ft.getCity());
            String[] lan = ft.getLanguages();
            for (int i=0;i<lan.length;i++){
              System.out.println(lan[i]);
            }
        }

    }
    public List<Family> update(List<Family> f1){
        for (Family jk:f1){
            if(jk.getId()==40){
                jk.setName("SriHarsha");
                jk.setCity("Hyderabad");
            }

        }

        return f1;
    }
}
