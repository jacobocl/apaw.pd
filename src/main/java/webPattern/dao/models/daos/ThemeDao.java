package webPattern.dao.models.daos;

import webPattern.dao.models.entities.Theme;

public interface ThemeDao extends GenericDao<Theme, Integer> {

    public Theme findByName(String name);
}
