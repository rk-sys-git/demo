package Job;

import java.util.ArrayList;
import java.util.List;

public class ImplentationResume {
    public static void main(String[] args) {
        Resume resume = new Resume();
        resume.setName("ravi");
        resume.setDesignation("senior software");
        resume.setAboutme("waste candidate");

        List<String> stringList = new ArrayList<>();
        stringList.add("java");
        stringList.add("sql");
        stringList.add("pl/sql");
        stringList.add("database");

        resume.setSkills(stringList);

        Contact contact = new Contact();
        contact.setMobile("9704722113");
        contact.setGmail("rktosca113@gmail.com");
        contact.setCity("chennai");
        resume.setContact(contact);

        List<Experince> experinceList = new ArrayList<>();
        Experince experince = new Experince();
        experince.setCompanyName("wipro");
        experince.setLocation("bangalore");
        experince.setDuration("2018 to 2024");
        experince.setProject("telifonica");

        experinceList.add(experince);
        resume.setExperince(experinceList);
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("telugu");
        stringList1.add("english");
        stringList1.add("tamil");
        resume.setLanguages(stringList1);

        Qualification qualification = new Qualification();
        qualification.setDegree("b.tech");
        qualification.setCollegeName("srichaitanya");
        qualification.setBranch("ece");

        resume.setQualification(qualification);


        System.out.println(resume.getName());
        System.out.println(resume.getDesignation());
        System.out.println(resume.getAboutme());
        List<String> stringList2 = resume.getSkills();
        for (String string : stringList2) {
            System.out.println(string);
        }
        Contact a = resume.getContact();
        System.out.println(a.getMobile());
        System.out.println(a.getGmail());
        System.out.println(a.getCity());

        List<Experince> lex = resume.getExperince();
        for (Experince er : lex) {
            System.out.println(er.getCompanyName());
            System.out.println(er.getLocation());
            System.out.println(er.getDuration());
            System.out.println(er.getProject());
        }
        List<String> stringList3 = resume.getLanguages();
        for (String sd : stringList3) {
            System.out.println(sd);
        }
        Qualification qua=resume.getQualification();
        System.out.println(qua.getDegree());
        System.out.println(qua.getBranch());
        System.out.println(qua.getCollegeName());

    }
}