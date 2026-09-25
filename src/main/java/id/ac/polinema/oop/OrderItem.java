package id.ac.polinema.oop;

public class OrderItem {

    private MenuItem menuItem;
    private int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = Math.max(0, quantity);
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSubtotal() {
        if (menuItem == null) {
            return 0.0;
        }
        return menuItem.getPrice() * quantity;
    }
}