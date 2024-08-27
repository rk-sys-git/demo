package Exceptionpk;

public class Hand {
    public static void main(String[]args) {
        Hand h=new Hand();
        h.dostaff();
    }
        public static void dostaff(){
            Hand h=new Hand();
      h.domorestaff();
        }
        public  void  domorestaff(){

        try {
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("its maths problem");
        }
        }
    }

