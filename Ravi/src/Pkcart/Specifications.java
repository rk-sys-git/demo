package Pkcart;

import java.util.List;

public class Specifications {
    private String colour;
    private int model;
    private List<Adavantages> advantages;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public List<Adavantages> getAdvantages() {
        return advantages;
    }

    public void setAdvantages(List<Adavantages> advantages) {
        this.advantages = advantages;
    }
}