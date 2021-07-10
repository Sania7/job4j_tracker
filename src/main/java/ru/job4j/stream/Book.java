package ru.job4j.stream;

import java.util.Objects;

public class Book {
    private String name;
    private int releaseYear;
    private String isbn;

    public Book(String name, int releaseYear, String isbn) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return releaseYear == book.releaseYear
                && Objects.equals(name, book.name)
                && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, releaseYear, isbn);
    }

    @Override
    public String toString() {
        return "Book{"
                + "name='"
                + name
                + '\''
                + ", releaseYear="
                + releaseYear
                + ", isbn='"
                + isbn
                + '\''
                + '}';
    }
}
