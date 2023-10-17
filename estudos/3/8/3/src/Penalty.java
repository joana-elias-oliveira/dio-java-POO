class Penalty {
    private String userName;
    private String bookTitle;
    private int daysLate;

    public Penalty(String userName, String bookTitle, int daysLate) {
        this.userName = userName;
        this.bookTitle = bookTitle;
        this.daysLate = daysLate;
    }

    public String getUserName() {
        return userName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getDaysLate() {
        return daysLate;
    }
}