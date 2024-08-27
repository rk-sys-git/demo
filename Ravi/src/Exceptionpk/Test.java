package Exceptionpk;

public class Test {
    public static void main(String[] args) {

        String a = "20";
        String b = "20k";

        //int x=Integer.parseInt(b);
        try {
            int x = Integer.parseInt(b);
            System.out.println(a);
            System.out.println(a + b);
            System.out.println(a);


        } catch (Exception e) {
            System.out.println("Invalid Numbers");

        } finally {
            //System.out.println(10 / 0);

            try {
                System.out.println(10 / 0);
            } catch (Exception e) {
                System.out.println("local");
            }
        }
        /*catch (ArithmeticException c){
            System.out.println("maths related");
        }
        catch (NumberFormatException c){
            System.out.println("maths related number");
        }*/


    }
}