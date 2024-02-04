package az.rouvsen.creationaldesignpatterns.patterns.factory.payments.abstracts;

import java.math.BigDecimal;

public interface Payment {
    void pay(BigDecimal amount);
}
