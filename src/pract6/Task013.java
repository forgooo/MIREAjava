package pract6;

import java.util.ArrayList;
import java.util.List;

// Интерфейс для наблюдателей
interface StringBuilderObserver {
    void update(StringBuilder subject);
}

// Класс, реализующий наблюдаемый объект
class ObservableStringBuilder {
    private StringBuilder stringBuilder;
    private List<StringBuilderObserver> observers;

    public ObservableStringBuilder() {
        stringBuilder = new StringBuilder();
        observers = new ArrayList<>();
    }

    public void addObserver(StringBuilderObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StringBuilderObserver observer) {
        observers.remove(observer);
    }

    public void append(String str) {
        stringBuilder.append(str);
        notifyObservers();
    }

    public void delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
    }

    public String toString() {
        return stringBuilder.toString();
    }

    private void notifyObservers() {
        for (StringBuilderObserver observer : observers) {
            observer.update(stringBuilder);
        }
    }
}

// Пример наблюдателя
class MyObserver implements StringBuilderObserver {
    @Override
    public void update(StringBuilder subject) {
        System.out.println("StringBuilder has been updated: " + subject.toString());
    }
}

public class Task013 {
    public static void main(String[] args) {
        ObservableStringBuilder observableStringBuilder = new ObservableStringBuilder();
        MyObserver observer1 = new MyObserver();
        MyObserver observer2 = new MyObserver();

        observableStringBuilder.addObserver(observer1);
        observableStringBuilder.addObserver(observer2);

        observableStringBuilder.append("Hello, ");
        observableStringBuilder.append("world!");

        observableStringBuilder.delete(7, 13);

        observableStringBuilder.removeObserver(observer1);

        observableStringBuilder.append(" Java");

        observableStringBuilder.addObserver(observer1);

        observableStringBuilder.append(" is awesome!");
    }
}
