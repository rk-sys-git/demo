package Source;

public class Main {
    public static void main(String[]args){
        ImpleSource il=new ImpleSource();
        SourceConfiguration su=il.create();
        il.display(su);
    }
}
