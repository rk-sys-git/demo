package PackShake;

import java.util.ArrayList;
import java.util.List;

public class Impl implements Inter {
    @Override
    public ShakeSpere create() {
        ShakeSpere sk = new ShakeSpere();
        Born b=new Born();
        b.setDate("26-Aprial-1564");
        b.setPlace("England");
        sk.setBorn(b);

        Died d=new Died();
        d.setDate("26-Aprial-1616");
        d.setPlace("England");
        sk.setDied(d);

        Occupations o=new Occupations();

        String[] occupoutions=new String[3];
        occupoutions[0]="playwrite";
        occupoutions[1]="poet";
        occupoutions[2]="actor";
        o.setOccupations(occupoutions);

        sk.setOccupations(o);

        Spouse sq=new Spouse();
        sq.setSpouse("Anne Hathway");
        sk.setSpouse(sq);

        Children c=new Children();
        List<Children> lc=new ArrayList();
        c.setName("susann Hall");
        c.setBorn("1583");
        c.setDied("1649");
        c.setSpouse("john Hall");
        c.setPlace("England");
        lc.add(c);


        Children c2=new Children();

        c2.setName("Hamnet shake Spere");
        c2.setBorn("1585");
        c2.setDied("1596");
        c2.setSpouse("none");
        c2.setPlace("England");
        lc.add(c2);
        sk.setChildren(lc);

        Books bk=new Books();
        List<Books> la=new ArrayList();
        bk.setType("Awards");

        List<BookNames>  lt=new ArrayList();
        BookNames bn=new BookNames();
        bn.setName("sonnet");
        bn.setPrice("$15.00");
        bn.setMode("audio");

        BookNames bn1=new BookNames();
        bn1.setName("macdbeth");
        bn1.setPrice("$9.45");
        bn1.setMode("audio");
        lt.add(bn);

        bk.setBookNames(lt);
        la.add(bk);
        sk.setBooks(la);

        PublishedBy pb=new PublishedBy();

        String[] publishedBy=new String[2];
        publishedBy[0]="John Hall";
        publishedBy[1]="susana Hall";
       pb.setPublishedBy(publishedBy);
       bk.setPublishedBy(pb);
       la.add(bk);




Books bk1=new Books();
        bk1.setType("Drama");

        List<BookNames>  lt1=new ArrayList();
        BookNames bn2=new BookNames();
        bn2.setName("Ricdhard");
        bn2.setPrice("$9.99");
        bn2.setMode("online");

        BookNames bn3=new BookNames();
        bn3.setName("measure");
        bn3.setPrice("$9.45");
        bn3.setMode("online");
        lt1.add(bn3);

        bk.setBookNames(lt1);
        la.add(bk);

        PublishedBy pb1=new PublishedBy();

        String[] publishedBy1=new String[2];
        publishedBy1[0]="John Hall";
        publishedBy1[1]="susana Hall";
        pb1.setPublishedBy(publishedBy1);
        bk.setPublishedBy(pb1);







        sk.setBooks(la);
        return sk;
    }

    @Override
    public void display(ShakeSpere ss) {
        Born s=ss.getBorn();
        System.out.println(s.getDate());
        System.out.println(s.getPlace());

        Died d= ss.getDied();
        System.out.println(d.getDate());
        System.out.println(d.getPlace());
        Occupations ot=ss.getOccupations();
        String[] os=ss.getOccupations().getOccupations();
       for(int i=0;i< os.length;i++){
           System.out.println(os[i]);
       }
       Spouse sp= ss.getSpouse();
       System.out.println(sp.getSpouse());

       List<Children> cd=ss.getChildren();
       for(Children ckl:cd){
           System.out.println(ckl.getName());
           System.out.println(ckl.getBorn());
           System.out.println(ckl.getDied());
           System.out.println(ckl.getSpouse());
           System.out.println(ckl.getPlace());

           List<Books> lbk=ss.getBooks();
           for (Books bd:lbk){
               System.out.println(bd.getType());

              //ZA PublishedBy pb= bd.getPublishedBy();
               String[] ak=bd.getPublishedBy().getPublishedBy();
               for(int i=0;i< ak.length;i++){
                   System.out.println(ak[i]);
               }
               List<BookNames> bn=bd.getBookNames();
               for (BookNames bs:bn){
                   System.out.println(bs.getName());
                   System.out.println(bs.getPrice());
                   System.out.println(bs.getMode());

               }
           }
       }

    }
}

