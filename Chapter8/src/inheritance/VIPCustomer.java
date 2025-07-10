package inheritance;

public class VIPCustomer extends Customer{

    private int agentID;
    double salesRatio;


    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIPCustomer(int customerID, String customerName, int agentID) 생성자 호출");

    }

    @Override
    public int calcPrice(int price) {
       bonusPoint += price * bonusRatio;
       return price - (int)(price * salesRatio);
    }
}
