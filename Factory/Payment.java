package Factory;

public interface Payment{
    void display();
    double makePayment(double amount);
    void task1();
    //so i can add as many as i want here and need to change the PaymentAbstract alone
    void task2();
}