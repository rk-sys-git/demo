package Pfamjily;

import Pfamjily.Family;

import java.util.List;

public interface Fl {
    public List<Family> create();
    public void display(List<Family> f);
    public List<Family> update(List<Family> f1);
}
