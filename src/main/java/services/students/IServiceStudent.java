package services.students;

import entities.Student;
import exceptions.services.ServiceException;

import java.util.List;

public interface IServiceStudent {

    public long create(long groupId, String firstName, String lastName, String middleName, String status);

    public Student read(long id) throws ServiceException;

    public void update(long id, Student student) throws ServiceException;

    public void delete(long id) throws ServiceException;

    public List<Student> readAll();

}
