package id.ac.polinema.oop;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMenuItem(new MenuItem("Es Kopi Susu", 18000));
        menu.addMenuItem(new MenuItem("Roti Bakar", 12000));

        Customer budi = new Customer("C001", "Budi Santoso");
        Order order = new Order(budi);
        order.addItem(menu.findItem("Es Kopi Susu"), 2);
        order.addItem(menu.findItem("Roti Bakar"), 1);

        Cashier cashier = new Cashier();
        double cash = 50000;

        System.out.println("Customer : " + order.getCustomer().getName());
        System.out.println("Total    : " + order.getTotal());
        System.out.println("Payable  : " + order.getFinalTotal());
        System.out.println("Cash     : " + cash);
        System.out.println("Change   : " + cashier.calculateChange(order, cash));
    }
}