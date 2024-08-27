package Pkcart;

public class ProductDetails {
    private int productId;
    private String productName;
    private int productPrice;
    private Specifications Specifications;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public Pkcart.Specifications getSpecifications() {
        return Specifications;
    }

    public void setSpecifications(Pkcart.Specifications specifications) {
        Specifications = specifications;
    }
}