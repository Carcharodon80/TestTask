package bookmanager.dao;

import bookmanager.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    //@SuppressWarnings("unchecked")
    public List<Book> listBooks() {
        List<Book> list;
        Session session = this.sessionFactory.getCurrentSession();

        TypedQuery<Book> query = session.createQuery("from Book", Book.class);
        list = query.getResultList();

        return list;
    }
}
