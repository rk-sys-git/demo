package Irctc;

public class PassengerDetails {
    private String name;
    private int age;
    private String gender;
    private String bookingStatus;
    private  String currentStatus;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return this.gender;
    }
    public void setBookingStatus(String bookingStatus){
        this.bookingStatus=bookingStatus;
    }
    public String getBookingStatus(){
        return this.bookingStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus=currentStatus;
    }
    public String getCurrentStatus(){
        return this.currentStatus;
    }
}
