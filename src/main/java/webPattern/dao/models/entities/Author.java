package webPattern.dao.models.entities;

public class Author {

    private int id;

    private String name;

    private String surname;
    
    private Contact contact;
    
    private Style style;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        assert name != "";
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        assert surname != "";
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Contact getContact() {
        assert contact != null;
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Style getStyle() {
        assert style != null;
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

}
