package StudentList;

public class Address {
    private String doornumber;
    private String street;
    private String city;
    private int pincode;
    private String state;
    private String country;
    public void setDoornumber(String doornumber){
        this.doornumber=doornumber;
    }
    public void setStreet(String street){
        this.street=street;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setPincode(int pincode){
        this.pincode=pincode;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getDoornumber(){
        return this.doornumber;
    }
    public String getStreet(){
        return this.street;
    }
    public String getCity(){
        return this.city;
    }
    public int getPincode(){
        return this.pincode;
    }
    public String getState(){
        return this.state;
    }
    public String getCountry(){
        return this.country;
    }
}
