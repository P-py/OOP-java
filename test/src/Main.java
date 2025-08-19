import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Creating a new book...");
        System.out.println("Please enter the name of the book: ");
        String bookName = sc.nextLine();

        System.out.println("Please enter the author of the book: ");
        String author = sc.nextLine();

        System.out.println("Please enter the date of publication (dd/MM/yyyy): ");
        String publicationDate = sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate publishDate = LocalDate.parse(publicationDate, formatter);

        Book bookObj = new Book(bookName, author, publishDate);

        System.out.println(bookObj.getBookInfo());
    }
}