package Dekorator;

import Obserwator.Observer;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Person> data;
    private List<Observer> observers = new ArrayList<>();

    public Data(List<Person> data) {
        this.data = data;
    }

    public void setData(List<Person> newData) {
        this.data = newData;
        notifyObservers();
    }

    public List<Person> getData() {
        return data;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(data);
        }
    }
}
