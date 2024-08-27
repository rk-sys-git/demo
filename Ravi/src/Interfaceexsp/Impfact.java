package Interfaceexsp;

public class Impfact implements Factorial{
    @Override
    public int fact(int a){
        int b=a;
        for(int i=a-1;i>=1;i--){
          b=b*i;

        }
        return b;
    }
}
