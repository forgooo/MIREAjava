package pract7;
class Magazine {
    public static void printMagazines(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Journal) {
                System.out.println(((Journal) item).getMagazineName());
            }
        }
    }

    public static void printBooks(Printable[] printable) {
        for (Printable item : printable) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}

interface Printable {
    void print();
}

class Book implements Printable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + author);
    }
}

class Journal implements Printable {
    private String magazineName;

    public Journal(String magazineName) {
        this.magazineName = magazineName;
    }

    public String getMagazineName() {
        return magazineName;
    }

    @Override
    public void print() {
        System.out.println("Journal: " + magazineName);
    }
}

class task07{
    public static void main(String[] args) {
        Printable[] printableItems = {
                new Book("Book 1", "Author 1"),
                new Journal("Magazine 1"),
                new Book("Book 2", "Author 2"),
                new Journal("Magazine 2")
        };

        System.out.println("Magazine names:");
        Magazine.printMagazines(printableItems);

        System.out.println("\nBook details:");
        Magazine.printBooks(printableItems);
    }
}