package PackShake;

import java.util.List;

public class ShakeSpere {
    private Born born;
    private Died died;

    public Occupations getOccupations() {
        return Occupations;
    }

    public void setOccupations(Occupations occupations) {
        Occupations = occupations;
    }

    private Occupations Occupations;

    private Spouse spouse;
    private List<Children> children;
    private List<Books> books;


    public Born getBorn() {
        return born;
    }

    public void setBorn(Born born) {
        this.born = born;
    }

    public Died getDied() {
        return died;
    }

    public void setDied(Died died) {
        this.died = died;
    }





    public Spouse getSpouse() {
        return spouse;
    }

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }

    public List<Books> getBooks() {
        return books;
    }

    public void setBooks(List<Books> books) {
        this.books = books;
    }
}
