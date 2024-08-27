package Indane;

public class ImplemenTax implements TaxInterface{
    @Override
    public TaxInvoice create(){
        TaxInvoice ti=new TaxInvoice();
        ti.setProduct("14.2 kg Lpg Cylinder-Filled");
        ti.setQuantity(1);

        Price p=new Price();
        p.setPrice(874.762f);
        p.setCgst(21.869f);
        p.setSgst(21.869f);
        p.setFinalprice(918.5f);
        p.setFinalprice(0);
        ti.setPrice(p);

        InvfoiceDetails id=new InvfoiceDetails();
        id.setTaxInvoiceNo(51036961);
        id.setTaxInvoiceDate("11/12/2023 20:52:03");
        id.setDistributorSerialNo(117956243);
        id.setConsumerCategory("Domestic");
        id.setConsumerNo(706332175);
        id.setConnectionType("Double Bottle Connection");
        id.setRelationshipId(700000063);
        id.setGeneratedOn("11/12/2023 21:24:13");
        ti.setInvfoiceDetails(id);

        OrderDetails od=new OrderDetails();
        od.setOrderNo(200339);
        od.setDate("11/12/2023 19:55:57");
        od.setStatus("Invoiced");
        od.setOrderType("Refill Order");
        ti.setOrderDetails(od);

        Identy add=new Identy();
        add.setDoorno("no 207");
        add.setCity("chennai");
        add.setSteet("thoraipakkam");
        add.setPincdode(600097);


        CustomerDetails cd=new CustomerDetails();
        cd.setName("udaykumar");
        cd.setGstn("--");
        cd.setAddr(add);
        ti.setCustomerDetails(cd);
        return ti;




    }
    @Override
    public void display(TaxInvoice taxsinvoice){
         InvfoiceDetails iv=taxsinvoice.getInvfoiceDetails();
         System.out.println("Invoicedetails");
         System.out.println(iv.getTaxInvoiceNo());
        System.out.println(iv.getTaxInvoiceDate());
        System.out.println(iv.getDistributorSerialNo());
        System.out.println(iv.getConnectionType());
        System.out.println(iv.getConsumerCategory());
        System.out.println(iv.getConsumerNo());
        System.out.println(iv.getRelationshipId());
        System.out.println(iv.getGeneratedOn());

        OrderDetails os=taxsinvoice.getOrderDetails();
        System.out.println(os.getOrderNo());
        System.out.println(os.getDate());
        System.out.println(os.getStatus());
        System.out.println(os.getOrderType());

        System.out.println(taxsinvoice.getProduct());
        System.out.println(taxsinvoice.getQuantity());

        Price pq=taxsinvoice.getPrice();
        System.out.println("price details");
        System.out.println(pq.getPrice());
        System.out.println(pq.getCgst());
        System.out.println(pq.getSgst());
        System.out.println(pq.getFinalprice());
        System.out.println(pq.getAmountPaidcash());

        CustomerDetails c=taxsinvoice.getCustomerDetails();
        System.out.println("customer details");
        System.out.println(c.getName());
        System.out.println(c.getGstn());

        Identy i=taxsinvoice.getCustomerDetails().getAddr();
        System.out.println("identy details");
        System.out.println(i.getDoorno());
        System.out.println(i.getSteet());
        System.out.println(i.getCity());
        System.out.println(i.getPincdode());
    }
}
