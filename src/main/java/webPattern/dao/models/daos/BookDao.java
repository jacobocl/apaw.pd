package webPattern.dao.models.daos;

import webPattern.dao.models.entities.Book;

public interface BookDao extends GenericDao<Book, Integer> {

    public Book findByISBN(String isbn);
}
