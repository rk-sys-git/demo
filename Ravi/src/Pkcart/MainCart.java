package Pkcart;

public class MainCart {
    public static void main(String[]args){
        ImpCart ic=new ImpCart();
        Cart k=ic.create();
        ic.display(k);
    }
}
