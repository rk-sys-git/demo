package Indane;

public class Price {
    private float price;
    private float cgst;
    private float sgst;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getCgst() {
        return cgst;
    }

    public void setCgst(float cgst) {
        this.cgst = cgst;
    }

    public float getSgst() {
        return sgst;
    }

    public void setSgst(float sgst) {
        this.sgst = sgst;
    }

    public float getFinalprice() {
        return finalprice;
    }

    public void setFinalprice(float finalprice) {
        this.finalprice = finalprice;
    }

    public int getAmountPaidcash() {
        return amountPaidcash;
    }

    public void setAmountPaidcash(int amountPaidcash) {
        this.amountPaidcash = amountPaidcash;
    }

    private float finalprice;
    private int amountPaidcash;
}
