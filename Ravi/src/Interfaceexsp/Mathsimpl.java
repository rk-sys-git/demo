package Interfaceexsp;

public class Mathsimpl implements Maths {
    @Override
    public int[] revfarra(int[] a) {
        int j = 0;
        int b[] = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {


            b[j] = a[i];
            j = j + 1;

        }
        return b;
    }

}