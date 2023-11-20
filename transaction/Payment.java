package transaction;

public interface Payment {

    void makePayment(double amount);

    void cancelPayment(double amount);
    
}
