package Dekorator;

import java.util.Comparator;
import java.util.List;

public class SortByAge implements DataDecorator{
    private final DataDecorator dataDecorator;

    public SortByAge(DataDecorator dataDecorator) {
        this.dataDecorator = dataDecorator;
    }

    @Override
    public List<Person> filter(List<Person> data) {
        List<Person> sorted = data.stream().sorted(
                Comparator.comparing(Person::getAge)
        ).toList();
        return dataDecorator.filter(sorted);
    }
}
