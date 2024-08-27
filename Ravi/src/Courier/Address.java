package Courier;

public class Address {
    private String name;
    private String fatherName;
    private String doorNo;
    private String streetName;
    private String state;
    private String city;
    private int pinCode;

    public void setPinCode(int pinCode) {
        this.pinCode=pinCode;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setFatherName(String fatherName){
        this.fatherName=fatherName;
    }
    public void setStreetName(String streetName){
        this.streetName=streetName;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setDoorNo(String doorNo){
        this.doorNo=doorNo;
    }
    public String getDoorNo(){
        return this.doorNo;
    }
    public int getPinCode(){
        return this.pinCode;
    }
    public String getName(){
        return this.name;
    }
    public String getStreetName(){
        return this.streetName;
    }
    public String getFatherName(){
        return this.fatherName;
    }
    public String getState(){
        return this.state;
    }
    public String getCity(){
        return this.city;
    }
}
