package pract14;
import java.util.ArrayList;
import java.util.List;

interface Filter {
    boolean apply(Object o);
}

class ArrayFilter {
    public static <T> T[] filter(T[] array, Filter filter) {
        List<T> filteredList = new ArrayList<>();

        for (T element : array) {
            if (filter.apply(element)) {
                filteredList.add(element);
            }
        }

        @SuppressWarnings("unchecked")
        T[] result = (T[]) new Object[filteredList.size()];
        return filteredList.toArray(result);
    }

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "cherry", "date", "elderberry"};
        Filter filter = new Filter() {
            @Override
            public boolean apply(Object o) {
                if (o instanceof String) {
                    String str = (String) o;
                    return str.length() > 5;
                }
                return false;
            }
        };

        String[] filteredStrings = ArrayFilter.<String>filter(strings, filter);
        for (String str : filteredStrings) {
            System.out.println(str);
        }
    }
}
