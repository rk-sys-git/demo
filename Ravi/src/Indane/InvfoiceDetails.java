package Indane;

public class InvfoiceDetails {
    private int TaxInvoiceNo;
    private String TaxInvoiceDate;
    private int DistributorSerialNo;
    private String ConsumerCategory;
    private int ConsumerNo;
    private String connectionType;

    public int getTaxInvoiceNo() {
        return TaxInvoiceNo;
    }

    public void setTaxInvoiceNo(int taxInvoiceNo) {
        TaxInvoiceNo = taxInvoiceNo;
    }

    public String getTaxInvoiceDate() {
        return TaxInvoiceDate;
    }

    public void setTaxInvoiceDate(String taxInvoiceDate) {
        TaxInvoiceDate = taxInvoiceDate;
    }

    public int getDistributorSerialNo() {
        return DistributorSerialNo;
    }

    public void setDistributorSerialNo(int distributorSerialNo) {
        DistributorSerialNo = distributorSerialNo;
    }

    public String getConsumerCategory() {
        return ConsumerCategory;
    }

    public void setConsumerCategory(String consumerCategory) {
        ConsumerCategory = consumerCategory;
    }

    public int getConsumerNo() {
        return ConsumerNo;
    }

    public void setConsumerNo(int consumerNo) {
        ConsumerNo = consumerNo;
    }

    public String getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }

    public int getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(int relationshipId) {
        this.relationshipId = relationshipId;
    }

    public String getGeneratedOn() {
        return generatedOn;
    }

    public void setGeneratedOn(String generatedOn) {
        this.generatedOn = generatedOn;
    }

    private int relationshipId;
    private String generatedOn;
}
