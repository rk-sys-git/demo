package Irctc;

import java.util.List;

public class ReservationSlip {

    private B1 from;
    public void setFrom(B1 from){
        this.from=from;
    }
    public B1 getFrom(){
        return this.from;
    }
    private B2 to;
    public void setTo(B2 to){
        this.to=to;
    }

    public B2 getTo() {
        return this.to;
    }


    private int pnr;
    private String quota;
    private int traino;
    private int distance;

    private String bookingDate;
    private List<PassengerDetails> passengerDetails;
    public void setPassengerDetails(List<PassengerDetails> passengerDetails){
        this.passengerDetails=passengerDetails;
    }
    public List<PassengerDetails> getPassengerDetails(){
        return this.passengerDetails;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate=bookingDate;
    }
    public String getBookingDate(){
        return this.bookingDate;
    }
    public void setPnr(int pnr){
        this.pnr=pnr;
    }
    public int getPnr(){
        return this.pnr;
    }
    public void setTraino(int traino){
        this.traino=traino;
    }
    public int getTraino(){
        return this.traino;
    }
    public void setQuota(String quota){
        this.quota=quota;
    }
    public String getQuota(){
        return this.quota;
    }
    public void setDistance(int distance){
        this.distance=distance;
    }
    public int getDistance(){
        return this.distance;
    }

}
