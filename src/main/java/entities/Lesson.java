package entities;

import java.time.LocalDate;
import java.util.Date;
public class Lesson {

    private long id;
    private LocalDate date;
    private int numberOfLesson;
    private Teacher teacher;
    private Group group;

    public Lesson(long id, LocalDate date, int numberOfLesson, Teacher teacher, Group group) {
        this.id = id;
        this.date = date;
        this.numberOfLesson = numberOfLesson;
        this.teacher = teacher;
        this.group = group;
    }

    public long getId() {
        return id;
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
}
