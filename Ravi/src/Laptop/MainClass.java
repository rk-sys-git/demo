package Laptop;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[]args){
       ListImpl op=new ListImpl();
      List<Lpdetails>  fd =op.create();
       op.dispaly(fd);
    }
}
