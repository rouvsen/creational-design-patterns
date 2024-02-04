package az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.products.capitals;

import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.CapitalCity;

import java.util.Arrays;
import java.util.List;

public class London implements CapitalCity {
    @Override
    public int getPopulation() {
        return 8900000;
    }

    @Override
    public List<String> listTopAttractions() {
        return Arrays.asList("Tower Bridge", "Buckingham Palace", "Big Ben");
    }
}
