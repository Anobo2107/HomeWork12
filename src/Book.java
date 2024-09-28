public class Book {
    public String getTitle;
    public String getAuthor;
    //Создайте класс
    //Book
    //, который будет содержать в себе данные о названии, авторе и годе публикации книги. Убедитесь, что типы полей класса Book выбраны правильно: это
    //String
    //,
    //Author
    // и
    //int
    //.
    private  String title;
    private  Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    String getTitle() {
        return title;
    }

    Author getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }
}
