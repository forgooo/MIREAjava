package pract9;
import java.util.Arrays;

class Student01 {
    private int iDNumber;

    public Student01(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                '}';
    }

    public static void sortStudentsByID(Student01[] students) {
        int n = students.length;

        for (int i = 1; i < n; ++i) {
            Student01 key = students[i];
            int j = i - 1;
            
            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }
}

class StudentSortTest {
    public static void main(String[] args) {
        Student01[] students = {
                new Student01(103),
                new Student01(101),
                new Student01(102),
                new Student01(100)
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(students));

        // Сортировка массива по iDNumber с использованием сортировки вставками
        Student01.sortStudentsByID(students);

        System.out.println("\nAfter sorting by iDNumber:");
        System.out.println(Arrays.toString(students));
    }
}
