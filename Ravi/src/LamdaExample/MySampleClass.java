package LamdaExample;
import java.util.ArrayList;
import java.util.List;

public class MySampleClass {
    public void methodA(){
        Multi multi=new Multi();
        methodB(multi );

    }
    public void methodB(Multi multi){
        multi.isEven(4);
        multi.kl(5);

    }
    public static void main(String[]args){
        MySampleClass mySampleClass=new MySampleClass();
        mySampleClass.methodA();
    }
}
