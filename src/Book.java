import java.util.Scanner;

public class Book {
    private String BookID;
    private String title;
    private Author author;
    public Book(String BookID, String title, Author
            author) {
        this.BookID = BookID;
        this.title = title;
        this.author = author;
    }
    public Book() {
    }
    public String getID() {
        return BookID;
    }
    public void setID(String ID) {
        this.BookID = ID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void enterBook()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Book ID:");
        setID(sc.nextLine());
        System.out.println("Enter title of Book:");
        setTitle(sc.nextLine());
        Author author = new Author();
        System.out.println("Enter Author details:");
        author.enterAuthor();
        setAuthor(author);

    }

    @Override
    public String toString() {
        return "Book{" + "BookID='" + getID() + '\'' +
                ", title='" +getTitle() + '\'' +
                "," + getAuthor() + '}';
    }
}