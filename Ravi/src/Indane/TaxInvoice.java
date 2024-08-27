package Indane;

public class TaxInvoice {
    private String product;
    private int quantity;

    private CustomerDetails customerDetails;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }





    public CustomerDetails getCustomerDetails() {
        return customerDetails;
    }

    public void setCustomerDetails(CustomerDetails customerDetails) {
        this.customerDetails = customerDetails;
    }

    public InvfoiceDetails getInvfoiceDetails() {
        return invfoiceDetails;
    }

    public void setInvfoiceDetails(InvfoiceDetails invfoiceDetails) {
        this.invfoiceDetails = invfoiceDetails;
    }

    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    private InvfoiceDetails invfoiceDetails;
    private OrderDetails orderDetails;
    private Price price;
}
