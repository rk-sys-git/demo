package Irctc;

public class MainTicket {
    public static void main(String[]args){
    ImpIrctc id=new ImpIrctc();
    ReservationSlip sp=id.page();
    id.display3(sp);
}
}
