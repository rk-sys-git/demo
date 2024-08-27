package PackShake;

import java.util.List;

public class Books {
    private String type;
    private List<BookNames> bookNames;


    public PublishedBy getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(PublishedBy publishedBy) {
        this.publishedBy = publishedBy;
    }

    private PublishedBy publishedBy;





    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<BookNames> getBookNames() {
        return bookNames;
    }

    public void setBookNames(List<BookNames> bookNames) {
        this.bookNames = bookNames;
    }




}
