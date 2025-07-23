package quanlylop;

public class Users {
    private int userId;
    private String name;
    private String email;
    private java.sql.Date registrationDate;

    public Users() {}

    public Users(int userId, String name, String email, java.sql.Date registrationDate) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.registrationDate = registrationDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.sql.Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(java.sql.Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}