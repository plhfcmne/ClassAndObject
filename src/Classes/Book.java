package Classes;

import java.util.Objects;

public class Book {
    final String title;
    final Author author;
    private int publishingYear;

    public Book(String title, Author author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + getTitle() + ", год издания " + getPublishingYear() + "г., автор: " + getAuthor().getName() +
                " " + getAuthor().getSurname();

    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return publishingYear == book.publishingYear && title.equals(book.getTitle())
                && author.equals(book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishingYear, author);
    }

}
