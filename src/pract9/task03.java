package pract9;
import java.util.ArrayList;
import java.util.List;

class MergeSortedStudent03Lists {

    public static List<Student03> mergeSortedStudent03Lists(List<Student03> list1, List<Student03> list2) {
        List<Student03> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGpa() >= list2.get(j).getGpa()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student03> list1 = new ArrayList<>();
        list1.add(new Student03("Alice", 3.5));
        list1.add(new Student03("Bob", 3.2));
        list1.add(new Student03("Charlie", 3.8));

        List<Student03> list2 = new ArrayList<>();
        list2.add(new Student03("David", 3.7));
        list2.add(new Student03("Eve", 3.9));

        // Сортировка и объединение списков
        List<Student03> mergedAndSorted = mergeSortedStudent03Lists(list1, list2);

        // Вывод объединенного и отсортированного списка
        System.out.println("Merged and Sorted List:");
        for (Student03 Student03 : mergedAndSorted) {
            System.out.println(Student03);
        }
    }
}

class Student03 {
    private String name;
    private double gpa;

    public Student03(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student03{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
