package bookmanager.service;

import bookmanager.dao.BookDao;
import bookmanager.model.Book;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public List<Book> listBooks() {
        return this.bookDao.listBooks();
    }
}
