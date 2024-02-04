package az.rouvsen.creationaldesignpatterns.patterns.factory.payments.impls;

import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.abstracts.Payment;
import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.enums.PaymentMethod;
import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.impls.methods.ApplePayPayment;
import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.impls.methods.CreditCardPayment;
import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.impls.methods.GooglePayPayment;
import az.rouvsen.creationaldesignpatterns.patterns.factory.payments.impls.methods.PayPalPayment;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

@Slf4j
public class PaymentFactory {

    private static final Logger logger = LoggerFactory.getLogger(PaymentFactory.class);
    public static Payment create(PaymentMethod paymentMethod) throws ClassNotFoundException {
        switch (paymentMethod) {
            case PAYPAL -> {
                return new PayPalPayment();
            }
            case APPLE_PAY -> {
                return new ApplePayPayment();
            }
            case CREDIT_CARD -> {
                return new CreditCardPayment();
            }
            case GOOGLE_PAY -> {
                return new GooglePayPayment();
            }
            default -> {
                logger.error(MessageFormat.format("Unsupported payment method: {0}", paymentMethod));
                throw new ClassNotFoundException(MessageFormat.format(
                        "{0} is not currently supported as a payment method.", paymentMethod
                ));
            }
        }
    }
}
