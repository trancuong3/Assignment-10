import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Author {
    private String authorID;
    private String name;
    private Date dateOfBirth;
    Author(){}

     Author(String authorID, String name, Date dateOfBirth) {
        this.authorID = authorID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getAuthorID() {
        return authorID;
    }

    public void setAuthorID(String authorID) {
        this.authorID = authorID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public void enterAuthor()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter authorId");
        setAuthorID(sc.nextLine());
        System.out.println("enter name author");
        setName(sc.nextLine());
        System.out.println("enter date of birth(yyyy-mm-dd)");
       String date=sc.nextLine();
       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date dateOfBirth= null;
        try {
            dateOfBirth = sdf.parse(date);
            setDateOfBirth(dateOfBirth);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Author{" +
                "authorID='" + getAuthorID() + '\'' +
                ", name='" + getName()  + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}
