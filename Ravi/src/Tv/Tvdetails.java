package Tv;

public class Tvdetails {
    private String Tvbrand;
    private String Tvsize;
    private int Tvcost;
    private String Resolution;

    public void setTvbrand(String Tvbrand){
        this.Tvbrand=Tvbrand;
    }
    public void setTvsize(String Tvsize){
        this.Tvsize=Tvsize;
    }
    public void setTvcost(int Tvcost){
        this.Tvcost=Tvcost;
    }
    public void setResolution(String Resolution) {
        this.Resolution = Resolution;
    }
    public String getTvbrand(){
        return this.Tvbrand;
    }
    public String getTvsize(){
        return this.Tvsize;
    }

    public int getTvcost() {
        return this.Tvcost;
    }
    public String getResolution(){
        return this.Resolution;
    }
}
