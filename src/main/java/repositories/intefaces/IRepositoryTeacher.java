package repositories.intefaces;

import entities.Teacher;

import java.util.List;

public interface IRepositoryTeacher {

    public long create(Teacher teacher);

    public Teacher read(long id);

    public void update(Teacher teacher);

    public void delete(long id);

    public List<Teacher> readAll();

}
