package Irctc;

import java.util.ArrayList;
import java.util.List;

public class ImpIrctc implements IrctcInterface {
    @Override
    public ReservationSlip page() {
        ReservationSlip rs=new ReservationSlip();
        B1 b = new B1();
        b.setFrom("chennai");
        b.setStartdate("26-Dec-2023");
        rs.setFrom(b);

        B2 t=new B2();
        t.setTo("Bhimavaram");
        t.setArrivingDate("27-dec-2023");
        rs.setTo(t);

        List<PassengerDetails> lp = new ArrayList();
        PassengerDetails p = new PassengerDetails();
        p.setName("Sri harhsa");
        p.setAge(25);
        p.setGender("male");
        p.setBookingStatus("cnf/s7/9/lower");
        p.setCurrentStatus("cnf/s7/9/lower");
        lp.add(p);
        PassengerDetails p1 = new PassengerDetails();
        p1.setName("ravi");
        p1.setAge(30);
        p1.setGender("male");
        p1.setBookingStatus("cdnf");
        p1.setCurrentStatus("cnf");
        lp.add(p1);

        rs.setPassengerDetails(lp);
        rs.setPnr(123456);
        rs.setQuota("tatkal");
        rs.setTraino(12759);
        rs.setDistance(784);
        rs.setBookingDate("25-dec-2023");

return rs;
    }
    @Override
    public void display3(ReservationSlip rs){
        B1 l=rs.getFrom();
        System.out.println("Fromdetails");
        System.out.println(l.getFrom());
        System.out.println(l.getStartdate());
        B2 k=rs.getTo();
        System.out.println("Todetails");
        System.out.println(k.getClass());
        System.out.println(k.getArrivingDate());
        System.out.println("pnrnumber"+rs.getPnr());
        System.out.println("quota"+rs.getQuota());
        System.out.println("trainno"+rs.getTraino());
        System.out.println("Distance"+rs.getDistance());
        System.out.println("Bookeddate"+rs.getBookingDate());
       List<PassengerDetails> fk=rs.getPassengerDetails();
        for(PassengerDetails ps:fk){
        System.out.println(ps.getName());
        System.out.println(ps.getAge());
        System.out.println(ps.getGender());
        System.out.println(ps.getBookingStatus());
        System.out.println(ps.getCurrentStatus());
    }
}
}

