package model;

public class Book {
    private int bookIBSN;
    private String bookAuthor;
    private String bookTitle;
    private String publisher;
    private int productionYear;
    private float bookPrice;
    private String bookType;

    public Book(int bookIBSN, String bookTitle, String bookAuthor, String publisher,
                int productionYear, float bookPrice, String bookType) {
        this.bookIBSN = bookIBSN;
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.publisher = publisher;
        this.productionYear = productionYear;
        this.bookPrice = bookPrice;
        this.bookType = bookType;
    }

    public String getBookType() {
        return bookType;
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

    public float getBookPrice() {
        return bookPrice;
    }

    @Override
    public String toString() {
        return String.format("Book{bookIBSN=%d, bookAuthor='%s', bookTitle='%s', publisher='%s', productionYear=%d," +
                                "bookPrice=%.2f, bookType='%s'}",
                                bookIBSN, bookAuthor, bookTitle,
                                publisher, productionYear,
                                bookPrice, bookType);
        }
}

