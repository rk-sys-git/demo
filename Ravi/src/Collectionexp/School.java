package Collectionexp;

public class School {
    private String Name;
    private int Id;
    private int age;

    public void setId(int id) {
        this.Id=id;
    }
    public void  setName(String name){
        this.Name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.Name;
    }
    public int getId(){
        return this.Id;
    }
    public int getAge(){
        return this.age;
    }
}
