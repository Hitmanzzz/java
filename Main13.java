class Publisher {
    protected String name;

    public Publisher(String name) {
        this.name = name;
    }
}

class Book extends Publisher {
    protected String author;

    public Book(String name, String author) {
        super(name);
        this.author = author;
    }
}

class Literature extends Book {
    protected String genre;

    public Literature(String name, String author, String genre) {
        super(name, author);
        this.genre = genre;
    }
}

class Fiction extends Book {
    protected String subgenre;

    public Fiction(String name, String author, String subgenre) {
        super(name, author);
        this.subgenre = subgenre;
    }
}

public class Main13 {
    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("Book1", "Author1");
        Literature book2 = new Literature("Book2", "Author2", "Drama");
        Fiction book3 = new Fiction("Book3", "Author3", "Science Fiction");

        // Print the details of books from each category
        System.out.println("Literature Books:");
        System.out.println("Name: " + book2.name);
        System.out.println("Author: " + book2.author);
        System.out.println("Genre: " + book2.genre);
        System.out.println();

        System.out.println("Fiction Books:");
        System.out.println("Name: " + book3.name);
        System.out.println("Author: " + book3.author);
        System.out.println("Subgenre: " + book3.subgenre);
    }
}
