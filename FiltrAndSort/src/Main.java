import Dekorator.*;
import Obserwator.ConsoleObserver;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Jan", 25),
                new Person("Krzysztof", 40),
                new Person("Zofia", 22),
                new Person("Tomasz", 35),
                new Person("Maria", 28),
                new Person("Piotr", 19),
                new Person("Ewa", 32)
        );

        Data data = new Data(people);

        ConsoleObserver observer = new ConsoleObserver();
        data.addObserver(observer);

        DataDecorator filterAgeAndSortByName = new FilterAge(new SortByName(new EndProcessor(), true),
                                30, true);
        List<Person> filteredByAgeSortedByName = filterAgeAndSortByName.filter(data.getData());
        data.setData(filteredByAgeSortedByName);

        DataDecorator filterAndSortByAge = new FilterAge(new SortByAge(new EndProcessor()), 35, false);
        List<Person> filteredAndSortByAge = filterAndSortByAge.filter(data.getData());
        data.setData(filteredAndSortByAge);
    }

}