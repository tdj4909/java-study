package inheritance;

public class VIPCustomer extends Customer{
    private int agentID;
    double saleRatio;

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public int getAgentID(){
        return agentID;
    }

    @Override
    public int calcPrice(int price){
        bonusPoint += price * bonusRatio;
        return price - (int) (price*saleRatio);
    }
}
