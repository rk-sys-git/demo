package Star;

public class MainSmart {
    public static void main(String[] args) {
        SmartImpl smartImpl = new SmartImpl();
        Smart smart=smartImpl.create();
        smartImpl.display(smart);


    }
}
