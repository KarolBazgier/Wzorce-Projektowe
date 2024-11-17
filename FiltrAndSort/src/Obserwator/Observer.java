package Obserwator;

import Dekorator.Person;

import java.util.List;

public interface Observer {
    void update(List<Person> data);
}
