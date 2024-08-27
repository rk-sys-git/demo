package MapOne;

import java.util.*;

public class ImplementationShop {
    public static void main(String[] args) {

        Shop shop = new Shop();
        shop.setId(1);
        shop.setProductName("Surfexcel");
        shop.setCategory("kitchen");

        Shop shop1 = new Shop();
        shop1.setId(2);
        shop1.setProductName("bedsheet");
        shop1.setCategory("bedroom");

        Shop shop3 = new Shop();
        shop3.setId(3);
        shop3.setProductName("tv");
        shop3.setCategory("hall");

        List<Shop> shopList = new ArrayList<>();
        shopList.add(shop);
        shopList.add(shop1);
        shopList.add(shop3);

        Map<String, List<Shop>> m1 = new HashMap<>();
        for (Shop shop2 : shopList) {

            if (m1.containsKey(shop2.getCategory())) {
                List<Shop> shopList1 = m1.get(shop2.getCategory());
                shopList1.add(shop2);


            } else {
                List<Shop> shopList1 = new ArrayList<>();
                shopList1.add(shop2);
                m1.put(shop2.getCategory(), shopList1);
            }

        }
        Set<String> s = m1.keySet();
        for (String rk : s) {
            List<Shop> shopList1 = m1.get(rk);
            for (Shop s1 : shopList1) {
                System.out.println(s1.getProductName());
                System.out.println(s1.getCategory());
                System.out.println(s1.getId());
            }
        }
    }
}