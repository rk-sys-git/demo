package NewImport;

public class A {
    public static void main(String[] args) {
        A a = new A();
        int x1 = 10;
        int x2 = 0;
        a.m1(x1, x2);
    }
        public void m1(int a1,int b1){
            B b = new B();
            b.m2(a1, b1);
        }
    }
