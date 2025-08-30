package Factory;
public class PaymentFactory {
    public Payment getPaymentMethod(PaymentMethod method){
        switch(method){
            case PaymentMethod.UPI: return new UPIPayment();
            case PaymentMethod.DIRECT: return new DirectPayment();
            case PaymentMethod.CREDIT: return new CreditCardPayment();
            // add additional methods instance creation here
            // need to update the enum as well
        }
        return null;
    }
}
