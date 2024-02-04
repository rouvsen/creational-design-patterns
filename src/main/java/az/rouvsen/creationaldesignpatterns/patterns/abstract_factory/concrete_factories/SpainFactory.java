package az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.concrete_factories;

import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstract_factories.InternationalFactory;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.CapitalCity;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.Language;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.products.capitals.Madrid;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.products.languages.Spanish;

// Concrete Factory 2
public class SpainFactory implements InternationalFactory {
    @Override
    public Language createLanguage() {
        return new Spanish();
    }

    @Override
    public CapitalCity createCapital() {
        return new Madrid();
    }
}
