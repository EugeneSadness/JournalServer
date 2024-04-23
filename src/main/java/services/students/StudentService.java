package services.students;

import entities.Student;
import exceptions.repostitories.RepositoryException;
import exceptions.services.NotFoundService;
import exceptions.services.ServiceException;
import repositories.Storage;
import repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements IServiceStudent {
    private StudentRepository studentRepository;

    public StudentService(Storage storage){
        studentRepository = new StudentRepository(storage);
    }

    public long create(long groupId, String firstName, String lastName, String middleName, String status) {
        return studentRepository.create(groupId, firstName, lastName, middleName, status);
    }

    public Student read(long id) throws ServiceException {
        try {
            return studentRepository.read(id);
        } catch (RepositoryException e) {
            throw new NotFoundService(e);
        }
    }

    public void update(long id, Student student) throws ServiceException {
        try {
            studentRepository.update(id, student);
        } catch (RepositoryException e) {
            throw new NotFoundService(e);
        }
    }

    public void delete(long id) throws ServiceException{
        try {
            studentRepository.delete(id);
        } catch (RepositoryException e) {
            throw new NotFoundService(e);
        }
    }

    public ArrayList<Student> readAll() {
        return studentRepository.readAll();
    }

    public ArrayList<Student> getByGroup(long id) throws ServiceException{
        ArrayList<Student> students;
        try {
             students = studentRepository.getByGroup(id);
        } catch (RepositoryException e){
            throw new NotFoundService(e);
        }
        return students;
    }
}
