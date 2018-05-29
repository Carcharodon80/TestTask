package bookmanager.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "books", schema = "bookmanager")
public class Book {
    private int id;
    private String title;
    private String description;
    private String author;
    private String isbn;
    private Integer printYear;
    private Byte readAlready;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 255)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "author", nullable = true, length = 100)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "isbn", nullable = true, length = 20)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "printYear", nullable = true)
    public Integer getPrintYear() {
        return printYear;
    }

    public void setPrintYear(Integer printYear) {
        this.printYear = printYear;
    }

    @Basic
    @Column(name = "readAlready", nullable = true)
    public Byte getReadAlready() {
        return readAlready;
    }

    public void setReadAlready(Byte readAlready) {
        this.readAlready = readAlready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return id == that.id &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(author, that.author) &&
                Objects.equals(isbn, that.isbn) &&
                Objects.equals(printYear, that.printYear) &&
                Objects.equals(readAlready, that.readAlready);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, description, author, isbn, printYear, readAlready);
    }
}
