package Interfaceexsp;

public class Impnatur implements Natural {
    @Override
    public int  sum(int a){
        int b=a;
        for(int i=a-1;i>=1;i--){
            b=b+i;
        }
        return b;

    }
}
