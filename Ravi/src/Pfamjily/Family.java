package Pfamjily;

public class Family {
    private int id;
    private String name;
    private String city;
    private String[] languages;
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setLanguages(String[] languages){
        this.languages=languages;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getCity(){
        return this.city;
    }
    public String[] getLanguages(){
        return this.languages;
    }
}
