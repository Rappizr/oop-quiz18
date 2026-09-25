package id.ac.polinema.oop;

public class Cashier {

    public double calculateChange(Order order, double cash) {
        if (order == null) {
            return cash;
        }
        return cash - order.getFinalTotal();
    }
}