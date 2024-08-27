package Tv;

import java.util.List;

public class MainTv {
    public static void main(String[]args){
        Tvimpl ap=new Tvimpl();
        List lt=ap.create();
        ap.display(lt);
    }
}
