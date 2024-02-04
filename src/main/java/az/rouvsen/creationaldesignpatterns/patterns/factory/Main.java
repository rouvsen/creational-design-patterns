package az.rouvsen.creationaldesignpatterns.patterns.factory;

import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.abstracts.Payment;
import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.enums.PaymentMethod;
import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.impls.PaymentFactory;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        try {
            Payment payment = PaymentFactory.create(PaymentMethod.UNKNOWN);
            payment.pay(new BigDecimal("10000.00"));
        } catch (ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
            //return response to client that payment method is unsupported, try another one
        } catch (Exception exception) {
            System.out.println("System Error");
        }
        System.out.println("Process finished");
    }
}
