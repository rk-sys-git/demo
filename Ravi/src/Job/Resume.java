package Job;

import java.util.List;

public class Resume {

    private String name;
    private String designation;
    private String aboutme;
    private List<String> skills;
    private Contact contact;
    private List<Experince> experince;
    private  List<String> Languages;
    private Qualification qualification;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAboutme() {
        return aboutme;
    }

    public void setAboutme(String aboutme) {
        this.aboutme = aboutme;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Experince> getExperince() {
        return experince;
    }

    public void setExperince(List<Experince> experince) {
        this.experince = experince;
    }

    public List<String> getLanguages() {
        return Languages;
    }

    public void setLanguages(List<String> languages) {
        Languages = languages;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }
}
