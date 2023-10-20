package pract4.pract4_1;

class Learner {
    private String name;

    public Learner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class SchoolStudent extends Learner {
    private int gradeLevel;

    public SchoolStudent(String name, int gradeLevel) {
        super(name);
        this.gradeLevel = gradeLevel;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }
}

class CollegeStudent extends Learner {
    private String major;

    public CollegeStudent(String name, String major) {
        super(name);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }
}

public class task7 {
    public static void main(String[] args) {
        Learner[] learners = new Learner[5];
        learners[0] = new SchoolStudent("John", 9);
        learners[1] = new SchoolStudent("Alice", 11);
        learners[2] = new CollegeStudent("Bob", "Computer Science");
        learners[3] = new CollegeStudent("Eva", "Biology");
        learners[4] = new SchoolStudent("David", 8);

        System.out.println("School Students:");
        for (Learner learner : learners) {
            if (learner instanceof SchoolStudent) {
                SchoolStudent schoolStudent = (SchoolStudent) learner;
                System.out.println("Name: " + schoolStudent.getName() + ", Grade Level: " + schoolStudent.getGradeLevel());
            }
        }

        System.out.println("\nCollege Students:");
        for (Learner learner : learners) {
            if (learner instanceof CollegeStudent) {
                CollegeStudent collegeStudent = (CollegeStudent) learner;
                System.out.println("Name: " + collegeStudent.getName() + ", Major: " + collegeStudent.getMajor());
            }
        }
    }
}

