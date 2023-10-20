package pract13;

public class Task002 {
    public static void main(String[] args) {

    }
}
class Person{
    private final String surname;
    private String name = "-";
    private String secondName = "-";
    Person(String surname, String name, String secondName){
        this.surname = surname;
        this.name = name;
        this.secondName = secondName;
    }
    public String getName(){
        return String.format("%s %s %s", this.surname, this.name, this.secondName);
    }
}