package Datahideexsp;

public class MainCreateUser {
    public static void main(String[] args) {
        User bs = new User();
        bs.setFirstName("Ravi");
        bs.SetLastName("kumar");
        bs.setSurName("muskudi");
        bs.setAge(03-07-1995);
        bs.setCity("amp");
        CreUseImpl r=new CreUseImpl();
        r.CreateUser(bs);
        System.out.println("-------------------------------------");

        User u2 = new User();
        u2.setFirstName("uday");
        r.CreateUser(u2);
    }
}
