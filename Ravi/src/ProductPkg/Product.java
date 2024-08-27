package ProductPkg;

import java.util.List;

public class Product {
    private int id;
    private String name;
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Specification getSpecificdation() {
        return specificdation;
    }

    public void setSpecificdation(Specification specificdation) {
        this.specificdation = specificdation;
    }

    public List<DeliveryServices> getDeliveryServices() {
        return deliveryServices;
    }

    public void setDeliveryServices(List<DeliveryServices> deliveryServices) {
        this.deliveryServices = deliveryServices;
    }

    private Specification specificdation;
    private List<DeliveryServices> deliveryServices;
}
