package repositories;

import entities.Student;
import exceptions.repostitories.ElementNotFoundException;
import exceptions.repostitories.RepositoryException;
import repositories.intefaces.IRepositoryStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentRepository implements IRepositoryStudent {
    Random random = new Random();
    Storage storage;

    public StudentRepository(Storage storage){
        this.storage = storage;
    }

    @Override
    public long create(long groupId,String firstName, String lastName, String middleName, String status) {
        long id = Math.abs(random.nextLong());
        storage.getStudents().put(id, new Student(id, groupId, firstName, lastName, middleName, status));
        return id;
    }

    @Override
    public Student read(long id) throws RepositoryException {
        if(!storage.getStudents().containsKey(id))
            throw new ElementNotFoundException("id: " + id + " isn't contained");
        return storage.getStudents().get(id);
    }

    @Override
    public void update(long id, Student student) throws RepositoryException {
        if(!storage.getStudents().containsKey(id))
            throw new ElementNotFoundException("id: " + id + " isn't contained");
        storage.getStudents().replace(id, student);
    }

    @Override
    public void delete(long id) throws RepositoryException {
        if(!storage.getStudents().containsKey(id))
            throw new ElementNotFoundException("id: " + id + " isn't contained");
        storage.getStudents().remove(id);
    }

    @Override
    public ArrayList<Student> readAll() {
        return new ArrayList<>(storage.getStudents().values());
    }

    public ArrayList<Student> getByGroup(long id) throws RepositoryException{
        ArrayList<Student> listOfStudents = new ArrayList<>();
        if(!storage.getGroups().containsKey(id))
            throw new ElementNotFoundException("id: " + id + "isn't contained");
        for(Student student: storage.getStudents().values()){
            if(student.getGroupId() == id)
                listOfStudents.add(student);
        }
        return listOfStudents;
    }
}
