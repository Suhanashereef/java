import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Publisher {
    private String name;
    public Publisher(String name) {
        this.name = name; // Removed "this" keyword
    }
    public String getName() {
        return name;
    }
}
class Book {
    private String title;
    private double price;
    private Publisher publisher;
    public Book(String title, double price, Publisher publisher) {
        this.title = title; // Removed "this" keyword
        this.price = price; // Removed "this" keyword
        this.publisher = publisher; // Removed "this" keyword
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {
        return price;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Publisher: " + publisher.getName());
    }
}
class Literature extends Book {
    public Literature(String title, double price, Publisher publisher) {
        super(title, price, publisher);
    }
}
class Fiction extends Book {
    public Fiction(String title, double price, Publisher publisher) {
        super(title, price, publisher);
    }
}
public class Mainpublisher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        Publisher publisher1 = new Publisher("Publisher A");
        Publisher publisher2 = new Publisher("Publisher B");
        books.add(new Literature("Literature Book 1", 20.99, publisher1));
        books.add(new Literature("Literature Book 2", 18.50, publisher1));
        books.add(new Fiction("Fiction Book 1", 15.75, publisher2));

        books.add(new Fiction("Fiction Book 2", 12.99, publisher2));
        System.out.println("Enter the category (Literature or Fiction): ");
        String category = scanner.nextLine();
        System.out.println("Books in the " + category + " category:");
        for (Book book : books) {
            if ((category.equalsIgnoreCase("Literature") && book instanceof Literature)
                    || (category.equalsIgnoreCase("Fiction") && book instanceof Fiction)) {
                book.display();
                System.out.println();
            }
        }
        scanner.close();
    }
}


output
--------
Enter the category (Literature or Fiction): 
literature
Books in the literature category:
Title: Literature Book 1
Price: $20.99
Publisher: Publisher A

Title: Literature Book 2
Price: $18.5
Publisher: Publisher A
Process finished with exit code 0
  
Enter the category (Literature or Fiction): 
fiction
Books in the fiction category:
Title: Fiction Book 1
Price: $15.75
Publisher: Publisher B

Title: Fiction Book 2
Price: $12.99
Publisher: Publisher B

Process finished with exit code 0
