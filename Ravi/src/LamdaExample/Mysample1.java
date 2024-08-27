package LamdaExample;

public class Mysample1 {
    public boolean methode1() {

        return methode2(
                a -> a % 2 == 0

        );

    }

    public boolean methode2(MuUtility muUtility) {
        boolean result = muUtility.isEven(8);
        return result;
    }

    public static void main(String[] args) {
        Mysample1 mysample1 = new Mysample1();
        System.out.println(mysample1.methode1());
    }
}
