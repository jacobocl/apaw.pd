package webPattern.dao.models.entities;

public class Theme {

    private int id;
    
    private String name;

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
    
    
}
