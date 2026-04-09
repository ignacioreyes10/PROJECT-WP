package project_wp.model;

public class Property {

    private String name;
    private int price;

    public Property(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
