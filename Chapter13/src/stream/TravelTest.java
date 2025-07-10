package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TravelTest {

    public static void main(String[] args) {

        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);

        List<TravelCustomer> customers = new ArrayList<>();
        customers.add(customerLee);
        customers.add(customerKim);
        customers.add(customerHong);

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");

        customers.stream().map( c-> c.getName()).forEach(System.out::println);

        int total = customers.stream().mapToInt(c->c.getPrice()).sum();
        System.out.println(total);

        customers.stream().filter( c-> c.getAge() >= 20 )
                .map( c-> c.getName()).sorted().forEach(System.out::println);
    }
}
