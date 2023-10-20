package pract9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class CustomInteger implements Comparable<CustomInteger> {
    private Integer value;

    public CustomInteger(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public int compareTo(CustomInteger other) {
        return this.value - other.value;
    }

    public static void main(String[] args) {
        List<CustomInteger> list = new ArrayList<>();
        list.add(new CustomInteger(5));
        list.add(new CustomInteger(10));
        list.add(new CustomInteger(2));
        list.add(new CustomInteger(8));

        // Сортировка списка с использованием compareTo
        Collections.sort(list);

        for (CustomInteger item : list) {
            System.out.println(item.getValue());
        }
    }
}
