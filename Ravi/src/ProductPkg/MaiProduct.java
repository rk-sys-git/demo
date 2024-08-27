package ProductPkg;

public class MaiProduct {
    public static void main(String[] args) {
        Impl il = new Impl();
        Product p1 = il.create();
        il.display(p1);
    }
}
