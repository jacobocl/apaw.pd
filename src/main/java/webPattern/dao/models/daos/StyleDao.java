package webPattern.dao.models.daos;

import webPattern.dao.models.entities.Style;

public interface StyleDao extends GenericDao<Style, Integer> {

    public Style findByName(String name);
}
