package id.ac.polinema.oop;

public class MenuItem {

    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = Math.max(0.0, price);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }
}