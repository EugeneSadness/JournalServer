package repositories.intefaces;

import entities.Group;
import exceptions.repostitories.RepositoryException;

import java.util.List;

public interface IRepositoryGroup {

    public long create(String nameOfGroup);

    public Group read(long id) throws RepositoryException;

    public void update(long id, String nameOfGroup) throws RepositoryException;

    public void delete(long id) throws RepositoryException;

    public List<Group> readAll();
}
