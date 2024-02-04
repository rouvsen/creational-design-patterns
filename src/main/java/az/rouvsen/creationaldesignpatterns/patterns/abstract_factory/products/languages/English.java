package az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.products.languages;

import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.Language;

public class English implements Language {
    @Override
    public void greet() {
        System.out.println("Hello");
    }
}
