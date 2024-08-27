package NewImport;

public class C {
    public void m3(int a,int b){
       // System.out.println(a/b);
        if (b==0){
            throw new ArithmeticException("invalid");
        }else {
            System.out.println(a/b);
        }
    }
}
