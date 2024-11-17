package Dekorator;

import java.util.List;

public class EndProcessor implements DataDecorator{
    @Override
    public List<Person> filter(List<Person> data) {
        return data;
    }
}
