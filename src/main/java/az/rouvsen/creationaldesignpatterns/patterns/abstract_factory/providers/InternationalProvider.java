package az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.providers;

import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstract_factories.InternationalFactory;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.concrete_factories.EnglandFactory;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.concrete_factories.SpainFactory;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.enums.Country;

public class InternationalProvider {
    public static InternationalFactory createConcreteFactory(Country country) {
        switch (country) {
            case ENGLAND -> {
                return new EnglandFactory();
            }
            case SPAIN -> {
                return new SpainFactory();
            }
            default -> throw new IllegalArgumentException("Invalid country: " + country);
        }
    }
}
