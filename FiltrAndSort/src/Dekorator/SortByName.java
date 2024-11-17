package Dekorator;

import java.util.Comparator;
import java.util.List;

public class SortByName implements DataDecorator{
    private final DataDecorator dataDecorator;
    private boolean alphabetically;

    public SortByName(DataDecorator dataDecorator, boolean alphabetically) {
        this.dataDecorator = dataDecorator;
        this.alphabetically = alphabetically;
    }

    @Override
    public List<Person> filter(List<Person> data) {
        List<Person> sorted = data.stream().sorted(alphabetically
                ? Comparator.comparing(Person::getName)
                : Comparator.comparing(Person::getName).reversed())
                .toList();
        return dataDecorator.filter(sorted);
    }
}
