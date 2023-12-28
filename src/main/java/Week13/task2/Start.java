package Week13.task2;

interface Payment {
    void processPayment();
}

// Concrete payment classes
class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
        // Add credit card payment processing logic here
    }
}

class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment");
        // Add PayPal payment processing logic here
    }
}

// PaymentFactory interface
interface PaymentFactory {
    Payment createPayment();
}

// Concrete payment factories
class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}

class PayPalPaymentFactory implements PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}

public class Start {
    public static void main(String[] args) {
        PaymentFactory creditCardFactory = new CreditCardPaymentFactory();
        PaymentFactory paypalFactory = new PayPalPaymentFactory();

        // Use factories to create different payment objects
        Payment creditCardPayment = creditCardFactory.createPayment();
        Payment paypalPayment = paypalFactory.createPayment();

        // Call the processPayment method on each payment object
        creditCardPayment.processPayment();
        paypalPayment.processPayment();
    }
}
