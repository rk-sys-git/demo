package Sqlexp;

import java.util.Scanner;

public class ImplCrud implements Crud {
    @Override
    public String[] create(int i) {
        String[] ar = new String[i];
        return ar;
    }

    @Override
    public String[] insert(String[] ar, int i, String names) {
        ar[i] = names;
        return ar;
    }

    @Override
    public String[] update(String[] ar, int i, String names) {
        ar[i] = names;
        return ar;
    }

    @Override
    public String[] delete(String[] ar, int i) {
        ar[i] = null;
        return ar;
    }

    @Override
    public void read(String[] ar) {
        for (int i = 0; i < ar.length; i++) {
            String res = ar[i];
            System.out.println(res);
        }

    }
}



