package Multipleadd;

import StudentList.Address;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String[] languages;
    private List<Multipleadd.Address> adress;
    public void setAddress(List<Multipleadd.Address> adress){
        this.adress=adress;
    }
    public List<Multipleadd.Address> getAddress(){
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
