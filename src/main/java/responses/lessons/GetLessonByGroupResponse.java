package responses.lessons;

import entities.Group;
import entities.Teacher;
import java.time.LocalDate;

public class GetLessonByGroupResponse {

    private LocalDate date;
    private int numberOfLesson;
    private Teacher teacher;
    private long id;

    public GetLessonByGroupResponse(LocalDate date, int numberOfLesson, Teacher teacher, long id) {
        this.date = date;
        this.numberOfLesson = numberOfLesson;
        this.teacher = teacher;
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

    public long getId() {
        return id;
    }
}
