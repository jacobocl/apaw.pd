package webPattern.dao.models.daos;

import webPattern.dao.models.entities.Contact;

public interface ContactDao extends GenericDao<Contact, Integer> {

    public Contact findByEmail(String email);
}
