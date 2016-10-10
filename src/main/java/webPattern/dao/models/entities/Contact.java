package webPattern.dao.models.entities;

public class Contact {

    private String email;

    private int phone;

    public String getEmail() {
        assert email != "";
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}
