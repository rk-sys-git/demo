package Datahideexsp;

import java.util.Date;

public class User {
    private String firstname;
    private String lastName;
    private String surName;
    private String gender;
    private int age;
    private Date dob;
    private String city;

    public void setFirstName(String firstname){
        this.firstname=firstname;
    }

    public void SetLastName(String lastName){
        this.lastName=lastName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setDob(Date dob){
        this.dob=dob;
    }

    public void setCity(String city){
        this.city=city;
    }

    public String getFirstName(){
        return this.firstname;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getSurName(){
        return this.surName;
    }

    public String getGender(){
        return this.gender;
    }

    public int getAge(){
        return this.age;
    }

    public String getCity(){
        return this.city;
    }
}
