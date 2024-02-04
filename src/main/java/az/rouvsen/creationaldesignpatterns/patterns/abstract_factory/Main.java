package az.rouvsen.creationaldesignpatterns.patterns.abstract_factory;

import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstract_factories.InternationalFactory;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.CapitalCity;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.Language;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.enums.Country;
import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.providers.InternationalProvider;

public class Main {
    public static void main(String[] args) {
        // GET ENGLAND CONCRETE FACTORY
        InternationalFactory factory1 = InternationalProvider.createConcreteFactory(Country.ENGLAND);
        Language language1 = factory1.createLanguage();
        language1.greet();// Hello
        CapitalCity capital1 = factory1.createCapital();
        System.out.println(capital1.getPopulation());// 8900000
        System.out.println(capital1.listTopAttractions());// "Tower Bridge", "Buckingham Palace", "Big Ben"

        System.out.println("""
                ************************
                """);

        // GET SPAIN CONCRETE FACTORY
        InternationalFactory factory2 = InternationalProvider.createConcreteFactory(Country.SPAIN);
        Language language2 = factory2.createLanguage();
        language2.greet();// Hola
        CapitalCity capital2 = factory2.createCapital();
        System.out.println(capital2.getPopulation());// 3200000
        System.out.println(capital2.listTopAttractions());// "Royal Palace", "Prado Museum", "Retiro Park"
    }
}
