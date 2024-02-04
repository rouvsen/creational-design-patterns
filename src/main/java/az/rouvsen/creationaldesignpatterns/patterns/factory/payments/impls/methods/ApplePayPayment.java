package az.rouvsen.creationaldesignpatterns.patterns.factory.payments.impls.methods;

import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.abstracts.Payment;

import java.math.BigDecimal;
import java.text.MessageFormat;

public class ApplePayPayment implements Payment {
    @Override
    public void pay(BigDecimal amount) {
        System.out.println(MessageFormat.format("Successfully paid ${0} to merchant using Apple Pay", amount));
    }
}
