package repositories.intefaces;

import entities.Student;
import exceptions.repostitories.RepositoryException;

import java.util.List;

public interface IRepositoryStudent {

    public long create(long groupId,String firstName, String lastName, String middleName, String status);

    public Student read(long id) throws RepositoryException;

    public void update(long id, Student student) throws RepositoryException;

    public void delete(long id) throws RepositoryException;

    public List<Student> readAll();
}
