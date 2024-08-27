package Multipleadd;

import java.util.ArrayList;
import java.util.List;

public class MulImp implements Mul{
    @Override
    public List<Student> creat(){
        List<Student> op=new ArrayList();
        List<Multipleadd.Address> lg=new ArrayList();
        Student az=new Student();
        Address a1=new Address();
        a1.setDoornumber("10-38/1");
        a1.setState("Andhrapradesh");
        a1.setCity("amalapuram");
        a1.setPincode(533201);
        a1.setCountry("india");
        a1.setStreet("kamsal colony");
        a1.setType("perminent");
        Address a2=new Address();
        a2.setDoornumber("10-38/1");
        a2.setState("Andhrapradesh");
        a2.setCity("amalapuram");
        a2.setPincode(533201);
        a2.setCountry("india");
        a2.setStreet("kamsal colony");
        a2.setType("local");
        Address a3=new Address();
        a3.setDoornumber("10-38/1");
        a3.setState("Andhrapradesh");
        a3.setCity("amalapuram");
        a3.setPincode(533201);
        a3.setCountry("india");
        a3.setStreet("kamsal colony");
        lg.add(a1);
        lg.add(a2);
        lg.add(a3);
        
        az.setId(1234);
        az.setName("ravi");
        String[] a = new String[5];
        a[0] = "telugu";
        a[1] = "english";
        a[2] = "tamil";
        az.setLanguages(a);
        az.setAddress(lg);
        op.add(az);
        return op;
        

    }
    @Override
    public void display(List<Student> ml){
        for (Student k:ml){
            System.out.println(k.getId());
            System.out.println(k.getName());
            String[] x=k.getLanguages();
                for (int i=0;i<x.length;i++){
                    System.out.println(x[i]);
                }
              List<Address> al= k.getAddress();
                for(Address gd:al){
                System.out.println(gd.getDoornumber());
                System.out.println(gd.getStreet());
                System.out.println(gd.getCity());
                System.out.println(gd.getCountry());
                System.out.println(gd.getPincode());
                System.out.println(gd.getState());
                System.out.println(gd.getType());
                }
            }
        }


    }

