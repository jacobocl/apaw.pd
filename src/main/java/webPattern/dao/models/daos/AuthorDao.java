package webPattern.dao.models.daos;

import java.util.List;

import webPattern.dao.models.entities.Author;
import webPattern.dao.models.entities.Book;

public interface AuthorDao extends GenericDao<Author, Integer> {

    public List<Author> findByName(String name);
    
    public List<Author> findBySurname(String surname);
    
    public List<Book> findBooks();
}
