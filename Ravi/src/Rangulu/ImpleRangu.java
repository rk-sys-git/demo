package Rangulu;

import java.util.ArrayList;
import java.util.List;

public class ImpleRangu implements InterRanghu {
    @Override
    public Colours create() {
        Colours r = new Colours();
        List<Color> lc = new ArrayList();
        Color cs = new Color();
        cs.setColor("black");
        cs.setCategory("hue");
        cs.setType("primary");
        Code ce = new Code();
        int[] a = new int[4];
        a[0] = 255;
        a[1] = 255;
        a[2] = 255;
        a[3] = 1;
        ce.setRgba(a);
        cs.setCode(ce);
        ce.setHex("#000");
        cs.setCode(ce);

        Color cs1 = new Color();
        cs1.setColor("White");
        cs1.setCategory("Value");

        Code ce1 = new Code();
        int[] b = new int[4];
        b[0] = 0;
        b[1] = 0;
        b[2] = 0;
        b[3] = 1;
        ce1.setRgba(b);
        cs1.setCode(ce1);
        ce1.setHex("#fff");
        cs1.setCode(ce1);

        Color cs2 = new Color();
        cs2.setColor("red");
        cs2.setCategory("hue");
        cs2.setType("primary");
        Code ce2 = new Code();
        int[] c = new int[4];
        c[0] = 255;
        c[1] = 0;
        c[2] = 0;
        c[3] = 1;
        ce2.setRgba(c);
        cs2.setCode(ce2);
        ce2.setHex("#ff0");
        cs2.setCode(ce2);

        Color cs3 = new Color();
        cs3.setColor("blue");
        cs3.setCategory("hue");
        cs3.setType("primary");
        Code ce3 = new Code();
        int[] d = new int[4];
        d[0] = 0;
        d[1] = 0;
        d[2] = 255;
        d[3] = 1;
        ce3.setRgba(d);
        cs3.setCode(ce3);
        ce3.setHex("#000");
        cs3.setCode(ce3);

        Color cs4 = new Color();
        cs4.setColor("yellow");
        cs4.setCategory("hue");
        cs4.setType("primary");
        Code ce4 = new Code();
        int[] e = new int[4];
        e[0] = 255;
        e[1] = 255;
        e[2] = 255;
        e[3] = 1;
        ce4.setRgba(e);
        cs4.setCode(ce4);
        ce4.setHex("#000");
        cs4.setCode(ce4);

        Color cs5 = new Color();
        cs5.setColor("green");
        cs5.setCategory("hue");
        cs5.setType("secoundary");
        Code ce5 = new Code();
        int[] f = new int[4];
        f[0] = 0;
        f[1] = 255;
        f[2] = 0;
        f[3] = 1;
        ce5.setRgba(f);
        cs5.setCode(ce5);
        ce5.setHex("#0f0");
        cs5.setCode(ce5);
        lc.add(cs);
        lc.add(cs1);
        lc.add(cs2);
        lc.add(cs3);
        lc.add(cs4);
        lc.add(cs5);
        r.setColor(lc);
        return r;

    }

    @Override
    public void display(Colours c) {
        List<Color> x = c.getColor();
        for (Color z : x) {
            System.out.println(z.getColor());
            System.out.println(z.getCategory());
            System.out.println(z.getType());
            int[] y = z.getCode().getRgba();
            for (int i = 0; i < y.length; i++) {
                System.out.println(y[i]);
                }
            String h=z.getCode().getHex();
                System.out.println(h);


        }
    }
}