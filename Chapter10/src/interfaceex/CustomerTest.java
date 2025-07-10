package interfaceex;

public class CustomerTest {

    public static void main(String[] args) {
        Buy buy = new Customer();
        buy.buy();
        buy.order();

        Sell sell = new Customer();
        sell.sell();
        sell.order();

        Customer customer = new Customer();
        customer.order();
        customer.sell();
        customer.buy();
    }
}
