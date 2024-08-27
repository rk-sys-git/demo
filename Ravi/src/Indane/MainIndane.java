package Indane;

public class MainIndane {
    public static void main(String[]args){
        ImplemenTax it=new ImplemenTax();
        TaxInvoice ty=it.create();
        it.display(ty);
    }
}
