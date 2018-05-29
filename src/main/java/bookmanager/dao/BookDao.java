package bookmanager.dao;

import bookmanager.model.Book;

import java.util.List;

public interface BookDao {
    List<Book> listBooks();
}
