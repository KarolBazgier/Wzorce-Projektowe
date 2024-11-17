package Obserwator;

import Dekorator.Person;

import java.util.List;

public class ConsoleObserver implements Observer{
    @Override
    public void update(List<Person> data) {
        System.out.println("Zaktulizowane dane: ");
        data.forEach(System.out::println);
    }
}
