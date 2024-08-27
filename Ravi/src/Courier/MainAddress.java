package Courier;

public class MainAddress {
    public static void main(String[]args){
        Address ad=new Address();
        ad.setDoorNo(("10-38/1"));
        ad.setCity("Rajahmundry");
        ad.setName("ravi kumar");
        ad.setFatherName("Satyanarayana");
        ad.setPinCode(533201);
        ad.setState("AndhraPradesh");
        ad.setStreetName("kamsalcolony");
        ImplAddress ia=new ImplAddress();
        ia.createAdrres(ad);

    }
}
