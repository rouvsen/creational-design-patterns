package az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstract_factories;

import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.CapitalCity;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.Language;

// Abstract Factory
public interface InternationalFactory {
    Language createLanguage();
    CapitalCity createCapital();
}
