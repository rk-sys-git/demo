package MapNewExamples;

import java.util.*;

public class ImplementationAmazon {
    public static void main(String[] args) {
        AmazonProduct amazonProduct = new AmazonProduct();

        amazonProduct.setId(1);
        amazonProduct.setName("charger");
        amazonProduct.setSubCategory("accessrious");
        amazonProduct.setCategory("electronics");

        AmazonProduct amazonProduct1 = new AmazonProduct();

        amazonProduct1.setId(2);
        amazonProduct1.setName("earphones");
        amazonProduct1.setSubCategory("accessrious");
        amazonProduct1.setCategory("electronics");

        AmazonProduct amazonProduct2 = new AmazonProduct();

        amazonProduct2.setId(3);
        amazonProduct2.setName("sdcard");
        amazonProduct2.setSubCategory("accessrious");
        amazonProduct2.setCategory("electronics");

        AmazonProduct amazonProduct3 = new AmazonProduct();

        amazonProduct3.setId(4);
        amazonProduct3.setName("digital camera");
        amazonProduct3.setSubCategory("camera");
        amazonProduct3.setCategory("electronics");

        AmazonProduct amazonProduct4 = new AmazonProduct();

        amazonProduct4.setId(5);
        amazonProduct4.setName("normal camera");
        amazonProduct4.setSubCategory("camera");
        amazonProduct4.setCategory("electronics");

        AmazonProduct amazonProduct5 = new AmazonProduct();

        amazonProduct5.setId(6);
        amazonProduct5.setName("seat cover");
        amazonProduct5.setSubCategory("car");
        amazonProduct5.setCategory("electronics");

        AmazonProduct amazonProduct6 = new AmazonProduct();

        amazonProduct6.setId(7);
        amazonProduct6.setName("light");
        amazonProduct6.setSubCategory("car");
        amazonProduct6.setCategory("electronics");

        AmazonProduct amazonProduct7 = new AmazonProduct();

        amazonProduct7.setId(8);
        amazonProduct7.setName("led");
        amazonProduct7.setSubCategory("monitor");
        amazonProduct7.setCategory("computers");

        AmazonProduct amazonProduct8 = new AmazonProduct();

        amazonProduct8.setId(9);
        amazonProduct8.setName("lcd");
        amazonProduct8.setSubCategory("monitor");
        amazonProduct8.setCategory("computers");

        AmazonProduct amazonProduct9 = new AmazonProduct();

        amazonProduct9.setId(10);
        amazonProduct9.setName("ram");
        amazonProduct9.setSubCategory("storage");
        amazonProduct9.setCategory("computers");

        AmazonProduct amazonProduct10 = new AmazonProduct();

        amazonProduct10.setId(11);
        amazonProduct10.setName("hd");
        amazonProduct10.setSubCategory("storage");
        amazonProduct10.setCategory("computers");

        AmazonProduct amazonProduct12 = new AmazonProduct();

        amazonProduct12.setId(13);
        amazonProduct12.setName("apple");
        amazonProduct12.setSubCategory("alexa");
        amazonProduct12.setCategory("smarthome");

        AmazonProduct amazonProduct13 = new AmazonProduct();

        amazonProduct13.setId(14);
        amazonProduct13.setName("sony");
        amazonProduct13.setSubCategory("alexa");
        amazonProduct13.setCategory("smarthome");

        AmazonProduct amazonProduct14 = new AmazonProduct();

        amazonProduct14.setId(15);
        amazonProduct14.setName("samsung");
        amazonProduct14.setSubCategory("smartdevice");
        amazonProduct14.setCategory("smarthome");

        AmazonProduct amazonProduct15 = new AmazonProduct();

        amazonProduct15.setId(16);
        amazonProduct15.setName("smartwatch");
        amazonProduct15.setSubCategory("smartdevice");
        amazonProduct15.setCategory("smarthome");

        List<AmazonProduct> amazonProductList = new ArrayList<>();
        amazonProductList.add(amazonProduct);
        amazonProductList.add(amazonProduct1);
        amazonProductList.add(amazonProduct2);
        amazonProductList.add(amazonProduct3);
        amazonProductList.add(amazonProduct4);
        amazonProductList.add(amazonProduct5);
        amazonProductList.add(amazonProduct6);
        amazonProductList.add(amazonProduct7);
        amazonProductList.add(amazonProduct8);
        amazonProductList.add(amazonProduct9);
        amazonProductList.add(amazonProduct10);
        amazonProductList.add(amazonProduct12);
        amazonProductList.add(amazonProduct13);
        amazonProductList.add(amazonProduct14);
        amazonProductList.add(amazonProduct15);

        Map<String, List<AmazonProduct>> m1 = new HashMap<>();
        for (AmazonProduct amazonProduct11 : amazonProductList) {
            if (m1.containsKey(amazonProduct11.getSubCategory())) {
                List<AmazonProduct> amazonProductList3 = m1.get(amazonProduct11.getSubCategory());
                amazonProductList3.add(amazonProduct11);
            } else {
                List<AmazonProduct> amazonProductList2 = new ArrayList<>();
                amazonProductList2.add(amazonProduct11);
                m1.put(amazonProduct11.getSubCategory(), amazonProductList2);
            }

        }
        List list19 = new ArrayList<>(m1.keySet());
        Map<String, List> m2 = new HashMap<>();
        for (Object ma : list19) {

                AmazonProduct am = (AmazonProduct) ma;

                if (m2.containsKey(am.getCategory())) {
                    List listn = m2.get(am.getCategory());
                    listn.add(am);

                } else {
                    List listq = new ArrayList<>();
                    listq.add(am);
                    m2.put(am.getCategory(), listq);
                }


        }
        Set<String> s1=m2.keySet();
        for (String se:s1){
            System.out.println("-----------------------------------");
            List<AmazonProduct> listans=m2.get(se);
            for (AmazonProduct amb:listans){
                System.out.println(amb.getId());
                System.out.println(amb.getName());
                System.out.println(amb.getSubCategory());
                System.out.println(amb.getCategory());
            }
        }
    }
}







       /* List<Map> amazonProductListf=new ArrayList<>();
        amazonProductListf.add(m1);

        Map<String,List<Map>> m2=new HashMap<>();
        for(Map am:amazonProductListf){
                     if (m2.containsKey((am.get)){

            }else {
                List<Map>  amazonProductList21=new ArrayList<>();
                amazonProductList21.add(am);
                m2.put(am.getCategory(),amazonProductList21);
            }

        }

    }
}*/