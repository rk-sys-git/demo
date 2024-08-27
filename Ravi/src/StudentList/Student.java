package StudentList;

public class Student {
    private int id;
    private String name;
    private String[] languages;
    private Address adress;
    public void setAddress(Address adress){
        this.adress=adress;
    }
    public Address getAddress(){
        return this.adress;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setLanguages(String[] languages){
        this.languages=languages;
    }
    public String[] getLanguages(){
        return this.languages;
    }
}
