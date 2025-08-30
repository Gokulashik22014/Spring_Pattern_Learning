package Factory;

public abstract class PaymentAbstract implements Payment{
    //this can handle all the methods that has to be implemented by Payment let say you wanna force the implementation to child
    //add abstract
    private String name;
    PaymentAbstract(String name){
        this.name=name;
    }
    @Override
    public void display(){
        System.out.println("Hi this is"+name+" payment");
    }
    @Override 
    public double makePayment(double amount){
        return amount;
    }
    @Override
    public void task1(){
        System.out.println("just checking how i can break it");
    }
    @Override
    public void task2(){
        System.out.println("just checking how i can break it");
    }
    // public abstract void task2();
    
}
