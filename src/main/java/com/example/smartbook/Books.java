package quanlylop;

public class Books {
    private int bookId;
    private String title;
    private int authorId;
    private int categoryId;
    private int publisherId;
    private int publicationYear;
    private int quantity;

    public Books() {}

    public Books(int bookId, String title, int authorId, int categoryId, int publisherId, int publicationYear, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.authorId = authorId;
        this.categoryId = categoryId;
        this.publisherId = publisherId;
        this.publicationYear = publicationYear;
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}