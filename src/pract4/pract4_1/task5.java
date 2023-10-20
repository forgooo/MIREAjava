package pract4.pract4_1;


class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + " (автор: " + author + ")";
    }
}

class Reader {
    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int readerTicketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    public void takeBook(String... bookTitles) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    public void returnBook(String... bookTitles) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            System.out.print(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class task5 {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В. В.", 12345, "Инженерия", "01.01.1990", "123-456-789");
        Book book1 = new Book("Приключения", "Иванов И. И.");
        Book book2 = new Book("Словарь", "Петров П. П.");
        Book book3 = new Book("Энциклопедия", "Сидоров С. С.");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");
        reader1.takeBook(book1, book2, book3);

        reader1.returnBook(3);
        reader1.returnBook("Приключения", "Словарь", "Энциклопедия");
        reader1.returnBook(book1, book2, book3);
    }
}
