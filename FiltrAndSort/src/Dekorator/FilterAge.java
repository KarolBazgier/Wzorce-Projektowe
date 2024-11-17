package Dekorator;

import java.util.List;
import java.util.stream.Collectors;

public class FilterAge implements DataDecorator {
    private  final DataDecorator dataDecorator;

    private int ageToCompare;
    private boolean moreThan;
    public FilterAge(DataDecorator dataDecorator, int ageToCompare, boolean moreThan) {
        this.dataDecorator = dataDecorator;
        this.ageToCompare = ageToCompare;
        this.moreThan = moreThan;
    }

    @Override
    public List<Person> filter(List<Person> data) {
        List<Person> filtered = data.stream().filter(moreThan
                ? person -> person.getAge() > ageToCompare
                : person -> person.getAge() < ageToCompare
        ).collect(Collectors.toList());
        return dataDecorator.filter(filtered);
    }
}
