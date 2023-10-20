package pract9;
import java.util.Arrays;
import java.util.Comparator;

class Student02 {
    private String name;
    private double gpa;

    public Student02(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}

class SortingStudentsByGPA implements Comparator<Student02> {
    @Override
    public int compare(Student02 student1, Student02 student2) {
        // Сортировка по убыванию итогового балла (GPA)
        return Double.compare(student2.getGpa(), student1.getGpa());
    }
}

class StudentSortingTest {
    public static void main(String[] args) {
        Student02[] students = {
                new Student02("Alice", 3.5),
                new Student02("Bob", 3.2),
                new Student02("Charlie", 3.8),
                new Student02("David", 3.7)
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(students));

        // Сортировка массива студентов по итоговым баллам в порядке убывания
        Arrays.sort(students, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA (descending order):");
        System.out.println(Arrays.toString(students));
    }
}

