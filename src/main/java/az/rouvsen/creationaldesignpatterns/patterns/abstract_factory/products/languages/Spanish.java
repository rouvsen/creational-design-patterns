package az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.products.languages;

import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.Language;

public class Spanish implements Language {
    @Override
    public void greet() {
        System.out.println("Hola");
    }
}
