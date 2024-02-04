package az.rouvsen.creationaldesignpatterns.patterns.factory.payments.impls.methods;

import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.abstracts.Payment;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class CreditCardPayment implements Payment {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println(MessageFormat.format("Successfully paid ${0} to merchant using Credit Card", amount));
    }
}
