package Dekorator;

import java.util.List;

public interface DataDecorator {
    List<Person> filter(List<Person> data);
}
