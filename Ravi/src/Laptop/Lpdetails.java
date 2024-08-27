package Laptop;

public class Lpdetails {
    private String LaptopName;
    private String Ram;
    private String ScreenSize;


    public void setLaptopName(String LaptopName){
        this.LaptopName=LaptopName;
    }
    public void setRam(String Ram){
        this.Ram=Ram;
    }
    public void setScreenSize(String screenSize){
        this.ScreenSize=screenSize;
    }
    public String getLaptopName(){
        return this.LaptopName;
    }
    public String getScreenSize(){
        return this.ScreenSize;
    }
    public String getRam(){
        return this.Ram;
    }
}
