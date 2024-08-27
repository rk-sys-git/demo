package Courier;

public class ImplAddress implements Regad {
    @Override
    public void createAdrres(Address ad){
        System.out.println(ad.getDoorNo());
        System.out.println(ad.getPinCode());
        System.out.println(ad.getCity());
        System.out.println(ad.getName());
        System.out.println(ad.getFatherName());
        System.out.println(ad.getState());
        System.out.println(ad.getStreetName());

    }
}
