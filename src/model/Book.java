package model;

public class Book {
    private int bookIBSN;
    private String bookAuthor;
    private String bookTitle;
    private String publisher;
    private int productionYear;
    private int bookPrice;

    public Book(int bookIBSN, String bookTitle, String bookAuthor, String publisher, int productionYear, int bookPrice) {
        this.bookIBSN = bookIBSN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publisher = publisher;
        this.productionYear = productionYear;
        this.bookPrice = bookPrice;
    }


    public int getBookIBSN() {
        return bookIBSN;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    @Override
    public String toString() {
        return String.format("Book{bookIBSN=%d, bookAuthor='%s', bookTitle='%s', publisher='%s', productionYear=%d, " +
                                "bookPrice=%d}", bookIBSN, bookAuthor, bookTitle, publisher, productionYear, bookPrice);
    }
}

