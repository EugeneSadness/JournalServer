package services.groups;

import entities.Group;
import exceptions.services.ServiceException;

import java.util.List;

public interface IServiceGroup {

     public long create(String nameOfGroup);

    public Group read(long id) throws ServiceException;

    public void update(long id, String nameOfGroup) throws ServiceException;

    public void delete(long id) throws ServiceException;

    public List<Group> readAll();
}
