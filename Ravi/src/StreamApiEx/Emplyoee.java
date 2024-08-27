package StreamApiEx;

public class Emplyoee {
    private int id;
    private String firstName;
    private String lastName;
    private String job;
    private String department;
    private int salary;
    private int age;

    public Emplyoee(int id, String firstName,String lastName,String job,String department,int salary,int age) {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.department=department;
        this.job=job;
        this.salary=salary;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Emplyoee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", job='" + job + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJob() {
        return job;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }
}
