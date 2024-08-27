package Datahideexsp;

public class CreUseImpl implements Registration {
    @Override

    public void CreateUser(User us){
        System.out.println(us.getFirstName());
        System.out.println(us.getLastName());
        System.out.println(us.getSurName());
        System.out.println(us.getGender());
        System.out.println(us.getAge());
        System.out.println(us.getCity());
    }
}
