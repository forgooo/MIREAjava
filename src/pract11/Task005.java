package pract11;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Task005 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        Date start;
        Date end;

        // Добавляем элементы в ArrayList
        start = new Date();
        arrayList.add("Элемент 1");
        arrayList.add("Элемент 2");
        arrayList.add("Элемент 3");
        end = new Date();
        System.out.printf("%d millis\n", end.getTime() - start.getTime());

        // Добавляем элементы в LinkedList
        start = new Date();
        linkedList.add("Элемент A");
        linkedList.add("Элемент B");
        linkedList.add("Элемент C");
        end = new Date();
        System.out.printf("%d millis\n", end.getTime() - start.getTime());

        // Выводим элементы ArrayList
        start = new Date();
        //System.out.print();
        for (String element : arrayList) {
            //System.out.println(element);
        }
        end = new Date();
        System.out.printf("%d millis\n", end.getTime() - start.getTime());

        // Выводим элементы LinkedList
        start = new Date();
        //System.out.println("LinkedList:");
        for (String element : linkedList) {
            //System.out.println(element);
        }
        end = new Date();
        System.out.printf("%d millis\n", end.getTime() - start.getTime());

        // Удаляем элемент из ArrayList
        start = new Date();
        arrayList.remove("Элемент 2");
        end = new Date();
        System.out.printf("%d millis\n", end.getTime() - start.getTime());

        // Удаляем элемент из LinkedList
        start = new Date();
        linkedList.remove("Элемент B");
        end = new Date();
        System.out.printf("%d millis\n", end.getTime() - start.getTime());

        // Поиск элемента в ArrayList
        start = new Date();
        String searchElementArrayList = "Элемент 1";
        if (arrayList.contains(searchElementArrayList)) {
            //System.out.println("Элемент найден в ArrayList: " + searchElementArrayList);
        } else {
            //System.out.println("Элемент не найден в ArrayList: " + searchElementArrayList);
        }
        end = new Date();
        System.out.printf("%d millis\n", end.getTime() - start.getTime());

        // Поиск элемента в LinkedList
        start = new Date();
        String searchElementLinkedList = "Элемент B";
        if (linkedList.contains(searchElementLinkedList)) {
            //System.out.println("Элемент найден в LinkedList: " + searchElementLinkedList);
        } else {
            //System.out.println("Элемент не найден в LinkedList: " + searchElementLinkedList);
        }
        end = new Date();
        System.out.printf("%d millis\n", end.getTime() - start.getTime());
    }
}
