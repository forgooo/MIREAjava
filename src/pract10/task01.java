package pract10;
import java.time.LocalDate;
import java.util.*;
import java.util.ArrayList;

class GPASorter implements Comparator<Student> {
    public void quickSort(ArrayList<Student> students, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(students, begin, end);

            quickSort(students, begin, partitionIndex - 1);
            quickSort(students, partitionIndex + 1, end);
        }
    }

    private int partition(ArrayList<Student> students, int begin, int end) {
        Student pivotStudent = students.get(end);
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (compare(students.get(j), pivotStudent) <= 0) {
                i++;
                Student swapStudent = students.get(i);
                students.set(i, students.get(j));
                students.set(j, swapStudent);
            }
        }

        Student swapStudent = students.get(i + 1);
        students.set(i + 1, students.get(end));
        students.set(end, swapStudent);

        return i + 1;
    }

    @Override
    public int compare(Student student1, Student student2) {
        // Compare students based on GPA
        if (student1.getGPA() < student2.getGPA()) {
            return -1;
        } else if (student1.getGPA() > student2.getGPA()) {
            return 1;
        } else {
            return 0;
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private String major;
    private int course;
    private String group;
    private double GPA;
    private LocalDate birthDate;

    public Student(String firstName, String lastName, String major, int course, String group, double GPA, LocalDate date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.course = course;
        this.group = group;
        this.GPA = GPA;
        this.birthDate = date;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCourse() {
        return course;
    }

    public double getGPA() {
        return GPA;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", major='" + major + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", GPA=" + GPA +
                ", birth date=" + birthDate +
                '}';
    }

    public static Student generateRandomStudent() {
        Random random = new Random();

        // Генерация случайных значений для свойств студента
        String[] firstNames = {"John", "Alice", "Bob", "Eva", "David", "Sophia"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Lee", "Taylor", "Clark"};
        String[] majors = {"Computer Science", "Mathematics", "Physics", "Biology", "Chemistry"};
        int randomFirstNameIndex = random.nextInt(firstNames.length);
        int randomLastNameIndex = random.nextInt(lastNames.length);
        int randomMajorIndex = random.nextInt(majors.length);
        int randomCourse = random.nextInt(4) + 1; // случайный курс от 1 до 4
        String randomGroup = "Group-" + (random.nextInt(10) + 1); // случайная группа от Group-1 до Group-10
        double randomGPA = 2.0 + (4.0 - 2.0) * random.nextDouble(); // случайный GPA от 2.0 до 4.0

        // Генерация случайной даты рождения в пределах последних 20 лет
        int year = LocalDate.now().getYear() - random.nextInt(20);
        int month = random.nextInt(12) + 1;
        int day = random.nextInt(28) + 1; // учтем февраль и високосные годы

        LocalDate randomBirthDate = LocalDate.of(year, month, day);

        return new Student(
                firstNames[randomFirstNameIndex],
                lastNames[randomLastNameIndex],
                majors[randomMajorIndex],
                randomCourse,
                randomGroup,
                randomGPA,
                randomBirthDate
        );
    }

    public static ArrayList<Student> setArray(int n){
        ArrayList<Student> students = new ArrayList<>();

        for(int i = 0; i < n; i++){
            students.add(generateRandomStudent());
        }

        return students;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = Student.setArray(10);
        GPASorter gpaSorter = new GPASorter();
        gpaSorter.quickSort(students, 0, students.size() - 1);
        Collections.reverse(students);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
