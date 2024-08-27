package ProductPkg;

import java.util.ArrayList;
import java.util.List;

public class Impl implements Inter {
    @Override
    public Product create() {
        Product pl = new Product();
        pl.setId(123);
        pl.setName("airCDondition");
        pl.setPrice(50000);
        Specification sp = new Specification();
        sp.setColour("White");
        sp.setCapacity("210 ltr");
        sp.setModel("2024");
        sp.setStar("5star");
        pl.setSpecificdation(sp);
        List<DeliveryServices> ld = new ArrayList();

        DeliveryServices ds = new DeliveryServices();
        ds.setId(100);
        ds.setPrice("500");
        ds.setName("ekar");
        String[] Services = new String[3];
        Services[0] = "picdkup";
        Services[1] = "drop";
        Services[2] = "install";
        ds.setServices(Services);
        ld.add(ds);

        DeliveryServices ds1 = new DeliveryServices();
        ds1.setId(200);
        ds1.setPrice("300");
        ds1.setName("dhl");
        String[] Services1 = new String[3];
        Services1[0] = "picdkup";
        Services1[1] = "drop";
        ds1.setServices(Services1);
        ld.add(ds1);
        pl.setDeliveryServices(ld);

        return pl;
    }

    @Override
    public void display(Product p) {
        System.out.println(p.getId());
        System.out.println(p.getName());
        System.out.println(p.getPrice());
        Specification sn = p.getSpecificdation();
        System.out.println(sn.getColour());
        System.out.println(sn.getCapacity());
        System.out.println(sn.getModel());
        System.out.println(sn.getStar());
        List<DeliveryServices> deliveryServices = p.getDeliveryServices();
        for (DeliveryServices dl : deliveryServices) {
            System.out.println(dl.getId());
            System.out.println(dl.getPrice());
            System.out.println(dl.getName());
            String[] servfices= dl.getServices();
            for(int i=0;i<servfices.length;i++){
                System.out.println(servfices[i]);

            }


        }
    }
}