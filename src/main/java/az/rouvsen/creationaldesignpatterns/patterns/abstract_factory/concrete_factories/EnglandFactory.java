package az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.concrete_factories;

import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstract_factories.InternationalFactory;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.CapitalCity;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.Language;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.products.capitals.London;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.products.languages.English;

// Concrete Factory 1
public class EnglandFactory implements InternationalFactory {
    @Override
    public Language createLanguage() {
        return new English();
    }

    @Override
    public CapitalCity createCapital() {
        return new London();
    }
}
