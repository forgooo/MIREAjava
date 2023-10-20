package pract6;

import java.util.Random;

public class Task6789 {
    public static void main(String[] args) {
        Random r = new Random();
        Printable[] booksAndMagazines = new Printable[10];
        for (int i = 0; i < booksAndMagazines.length; i++) {
            booksAndMagazines[i] = (r.nextDouble() > 0.5) ? new Book("book " + (i+1)) : new Magazine("magazine " + (i+1));
        }
        for (Printable p:booksAndMagazines) {
            p.print();
        }
    }
}
interface Printable{
    void print();
}
class Book implements Printable{
    private final String name;
    Book(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println(name);
    }
}
class Magazine implements Printable{
    private final String name;
    Magazine(String name){
        this.name = name;
    }
    @Override
    public void print(){
        System.out.println(name);
    }
}
