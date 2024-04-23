package repositories.intefaces;

import entities.Subject;

import java.util.List;

public interface IRepositorySubject {

    public long create(Subject subject);

    public Subject read(long id);

    public void update(Subject subject);

    public void delete(long id);

    public List<Subject> readAll();

}
