package responses.lessons;

import entities.Group;
import entities.Teacher;
import java.time.LocalDate;

public class GetLessonByIdResponse {

    private LocalDate date;
    private int numberOfLesson;
    private Teacher teacher;
    private Group group;

    public GetLessonByIdResponse(LocalDate date, int numberOfLesson, Teacher teacher, Group group) {
        this.date = date;
        this.numberOfLesson = numberOfLesson;
        this.teacher = teacher;
        this.group = group;
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
