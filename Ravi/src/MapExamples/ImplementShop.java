package MapExamples;

import java.util.*;

public class ImplementShop {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.setId(1);
        shop.setProductName("Fridge");
        shop.setCategory("Electronics");

        Shop shop1 = new Shop();
        shop1.setId(2);
        shop1.setProductName("Tv");
        shop1.setCategory("Electronics");

        Shop shop2 = new Shop();
        shop2.setId(3);
        shop2.setProductName("Ac");
        shop2.setCategory("Electronics");

        Shop shop3 = new Shop();
        shop3.setId(5);
        shop3.setProductName("windows");
        shop3.setCategory("Hardware");

        Shop shop4 = new Shop();
        shop4.setId(1);
        shop4.setProductName("paints");
        shop4.setCategory("hardware");

        Shop shop5 = new Shop();
        shop5.setId(1);
        shop5.setProductName("jeans");
        shop5.setCategory("fashion");

        Shop shop6 = new Shop();
        shop6.setId(1);
        shop6.setProductName("shirts");
        shop6.setCategory("fashion");

        Shop shop7 = new Shop();
        shop7.setId(15);
        shop7.setProductName("steel plates");
        shop7.setCategory("kitchen");

        Shop shop8 = new Shop();
        shop8.setId(4);
        shop8.setProductName("ricebag");
        shop8.setCategory("kitchen");

        Shop shop9 = new Shop();
        shop9.setId(8);
        shop9.setProductName("tea shirts");
        shop9.setCategory("fashion");

        List<Shop> shopList = new ArrayList<>();
        shopList.add(shop);
        shopList.add(shop1);
        shopList.add(shop2);
        shopList.add(shop3);
        shopList.add(shop4);
        shopList.add(shop5);
        shopList.add(shop6);
        shopList.add(shop7);
        shopList.add(shop8);
        shopList.add(shop9);

        Map<String, List<Shop>> m1 = new HashMap<>();
        for (Shop shop10 : shopList) {
            if (m1.containsKey(shop10.getCategory())) {
                List<Shop> shopList2 = m1.get(shop10.getCategory());
                shopList2.add(shop10);

            } else {
                List<Shop> shopList1 = new ArrayList<>();
                shopList1.add(shop10);
                m1.put(shop10.getCategory(), shopList1);
            }
        }
        Set<String> s = m1.keySet();
        for (String obj : s) {
            List<Shop> shopList11 = m1.get(obj);
            System.out.println("----------------------------------");
            for (Shop ok : shopList11) {
                System.out.println(ok.getId());
                System.out.println(ok.getCategory());
                System.out.println(ok.getProductName());
            }

        }
    }
}
