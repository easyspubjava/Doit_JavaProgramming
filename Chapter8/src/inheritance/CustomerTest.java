package inheritance;

public class CustomerTest {

    public static void main(String[] args) {
        int price = 10000;

        Customer customer = new Customer(1001, "김유신");
        System.out.println( customer.getCustomerName() + "님이 지불할 가격은" + customer.calcPrice(price) + "원 입니다");

        VIPCustomer vipCustomer = new VIPCustomer(1002, "이순신", 12345);
        System.out.println( vipCustomer.getCustomerName() + "님이 지불할 가격은" + vipCustomer.calcPrice(price) + "원 입니다");

        Customer vc = new VIPCustomer(1003, "나몰라", 12345);
        System.out.println( vc.getCustomerName() + "님이 지불할 가격은" + vc.calcPrice(price) + "원 입니다");
    }
}
