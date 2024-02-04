package az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.products.capitals;

import az.rouvsen.creationaldesignpatterns.patterns.abstract_factory.abstracts.CapitalCity;

import java.util.Arrays;
import java.util.List;

public class Madrid implements CapitalCity {
    @Override
    public int getPopulation() {
        return 3200000;
    }

    @Override
    public List<String> listTopAttractions() {
        return Arrays.asList("Royal Palace", "Prado Museum", "Retiro Park");
    }
}
