package requests.lessons;

import entities.Group;
import entities.Teacher;
import java.time.LocalDate;

public class EditLessonRequest {

    private LocalDate date;
    private int numberOfLesson;
    private Teacher teacher;
    private Group group;
    private long id;

    public EditLessonRequest(LocalDate date, int numberOfLesson, Teacher teacher, Group group, long id) {
        this.date = date;
        this.numberOfLesson = numberOfLesson;
        this.teacher = teacher;
        this.group = group;
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }

    public long getId() {
        return id;
    }
}
