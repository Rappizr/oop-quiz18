package id.ac.polinema.oop;

public class Order {

    private Customer customer;
    private OrderItem[] items;
    private int itemCount;

    public Order(Customer customer) {
        this.customer = customer;
        this.items = new OrderItem[10];
        this.itemCount = 0;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addItem(MenuItem menuItem, int quantity) {
        if (menuItem == null || quantity <= 0) {
            return;
        }
        if (itemCount < items.length) {
            items[itemCount] = new OrderItem(menuItem, quantity);
            itemCount++;
        }
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotal() {
        double total = 0.0;
        for (int i = 0; i < itemCount; i++) {
            if (items[i] != null) {
                total += items[i].getSubtotal();
            }
        }
        return total;
    }

    public double getFinalTotal() {
        double total = getTotal();
        if (total >= 100000.0) {
            return total * 0.9;
        }
        return total;
    }
}