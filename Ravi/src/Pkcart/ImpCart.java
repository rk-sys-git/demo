package Pkcart;

import java.util.ArrayList;
import java.util.List;

public class ImpCart implements InterCart {
    @Override
    public Cart create(){
        Cart c=new Cart();
        c.setProductCount(2);

        List<ProductDetails> lp=new ArrayList();
        ProductDetails pd=new ProductDetails();
        pd.setProductId(1212);
        pd.setProductName("Refrigirater");
        pd.setProductPrice(41000);
        lp.add(pd);

        Specifications sp=new Specifications();
        sp.setColour("black");
        sp.setModel(2024);


        Adavantages ad=new Adavantages();
        List<Adavantages> la=new ArrayList();
        ad.setSerialNumber(1);
        ad.setAdvantage("power cooling");
        la.add(ad);
        sp.setAdvantages(la);
        pd.setSpecifications(sp);

        List<ProductDetails> lp1=new ArrayList();
        ProductDetails pd1=new ProductDetails();
        pd1.setProductId(1215);
        pd1.setProductName("washingmacdhine");
        pd1.setProductPrice(30000);
        lp1.add(pd1);

        Specifications sp1=new Specifications();
        sp1.setColour("Silver");
        sp1.setModel(2023);


        Adavantages ad1=new Adavantages();
        List<Adavantages> la1=new ArrayList();
        ad1.setSerialNumber(1);
        ad1.setAdvantage("Front");
        la1.add(ad1);
        sp1.setAdvantages(la1);
        pd1.setSpecifications(sp1);



        lp.add(pd);
        lp.add(pd1);
        c.setProductDetails(lp);
        
        return c;
    }
    @Override
    public void display(Cart saw) {
        System.out.println(saw.getProductCount());
        List<ProductDetails> productDetails=saw.getProductDetails();
        for(ProductDetails productDatail:productDetails){
            System.out.println(productDatail.getProductId());
            System.out.println(productDatail.getProductName());
            System.out.println(productDatail.getProductPrice());
            Specifications s=productDatail.getSpecifications();
            System.out.println(s.getColour());
            System.out.println(s.getModel());
            List<Adavantages> advantage=s.getAdvantages();
            for (Adavantages adavantages:advantage){
                System.out.println(adavantages.getSerialNumber());
                System.out.println(adavantages.getAdvantage());
            }
        }
    }

}



