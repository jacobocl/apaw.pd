package webPattern.dao.models.entities;

import java.util.List;

public class Book {

    private int id;

    private String isbn;

    private List<Theme> themes;

    private List<Author> authors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        assert isbn != "";
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Theme> getThemes() {
        assert themes != null;
        return themes;
    }

    public void setThemes(List<Theme> themes) {
        this.themes = themes;
    }

    public List<Author> getAuthors() {
        assert authors != null;
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

}
