package Factory;

public class Main {
    public static void main(String args[]){
        PaymentFactory pf=new PaymentFactory();
        Payment upi=pf.getPaymentMethod(PaymentMethod.UPI);
        System.out.println("UPI");
        upi.display();
        Payment direct=pf.getPaymentMethod(PaymentMethod.DIRECT);
        direct.task1();
    }
}
