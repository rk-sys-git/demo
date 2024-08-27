package StudentList;

public class AddImpl implements Addinter{
    @Override
    public Address creatadd(){

        Address a=new Address();
        a.setDoornumber("10-38/1");
        a.setState("Andhrapradesh");
        a.setCity("amalapuram");
        a.setPincode(533201);
        a.setCountry("india");
        a.setStreet("kamsal colony");
        return a;
    }
}
