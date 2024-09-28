//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //создание двух объектов класса Author
        Author author = new Author("Толстой", "Лев");
        Author author1 = new Author("Рубина","Дина");

        //создание двух объектов класса Book
        Book book1 = new Book("Война и мир",author, 1867);
        Book book2 = new Book("Белая голубка Кордовы",author1, 2009);
        //выводим информацию о книгах
        System.out.println("Book 1: " + book1.getTitle() + ", Author: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getFamilyName() + ", Year: " + book1.getYear());
        System.out.println("Book 2: " + book2.getTitle() + ", Author: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getFamilyName() + ", Year: " + book2.getYear());
//изменить год для первой книги
        book1.setYear(1950);
        System.out.println("Book 1 update: " + book1.getTitle() + ", Author: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getFamilyName() + ", Year: " + book1.getYear());

    }
}