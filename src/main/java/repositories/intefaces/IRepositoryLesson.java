package repositories.intefaces;

import entities.Lesson;

import java.time.LocalDate;
import java.util.List;

public interface IRepositoryLesson {

    public long create(Lesson lesson);

    public Lesson read(long id);

    public void update(Lesson lesson);

    public void delete(long id);

    public List<Lesson> readByTeacherId(long id);

    public List<Lesson> readByRange(long id, LocalDate start, LocalDate end);

    public void deleteByTeacherId(long id);

    public void deleteAllLessonsByGroupId(long id);

}
