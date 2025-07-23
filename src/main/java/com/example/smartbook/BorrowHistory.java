package quanlylop;

public class BorrowHistory {
    private int borrowId;
    private int userId;
    private int bookId;
    private java.sql.Date borrowDate;
    private java.sql.Date returnDate;
    private String status;

    public BorrowHistory() {}

    public BorrowHistory(int borrowId, int userId, int bookId, java.sql.Date borrowDate, java.sql.Date returnDate, String status) {
        this.borrowId = borrowId;
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public int getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(int borrowId) {
        this.borrowId = borrowId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public java.sql.Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(java.sql.Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public java.sql.Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(java.sql.Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}