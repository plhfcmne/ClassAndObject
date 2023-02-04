import Classes.Author;
import Classes.Book;

public class Main {
    public static void main(String[] args) {
        Author personOne = new Author("Иван", "ДОрн");
        Author personTwo = new Author("Сергей", "Карамушкин");
        Author personThree = new Author("Иван", "Алексеев");

        Book londa = new Book("Тынцамэн", personOne, 2014);
        Book forYourNewGuy = new Book("Твоему новому парню", personTwo, 2018);
        Book letThemDie = new Book("Пусть они умрут", personThree, 2019);
        londa.printInfo();
        forYourNewGuy.printInfo();
        letThemDie.printInfo();
        londa.setPublishingYear(2012);
        londa.printInfo();
    }
}