class Book {
    private int bookId;
    private String bookName;
    private double price;


    public Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }


    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public double getPrice() {
        return price;
    }

   
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + ", Price: $" + price;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return bookId == book.bookId && Double.compare(book.price, price) == 0 && bookName.equals(book.bookName);
    }
}

public class q2 {
    public static void main(String[] args) {
       
        Book book1 = new Book(1, "Java Programming", 25.99);
        Book book2 = new Book(2, "Python Programming", 19.99);

       
        if (book1.getPrice() > book2.getPrice()) {
            System.out.println("Book 1 is more expensive: " + book1);
            System.out.println("Book 2: " + book2);
        } else if (book1.getPrice() < book2.getPrice()) {
            System.out.println("Book 2 is more expensive: " + book2);
            System.out.println("Book 1: " + book1);
        } else {
            System.out.println("Both books have the same price.");
            System.out.println("Book 1: " + book1);
            System.out.println("Book 2: " + book2);
        }
    }
}
