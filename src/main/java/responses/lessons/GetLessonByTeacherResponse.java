package responses.lessons;

import entities.Group;
import entities.Teacher;
import java.time.LocalDate;

public class GetLessonByTeacherResponse {

    private LocalDate date;
    private int numberOfLesson;
    private Group group;

    public GetLessonByTeacherResponse(LocalDate date, int numberOfLesson, Group group) {
        this.date = date;
        this.numberOfLesson = numberOfLesson;
        this.group = group;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getNumberOfLesson() {
        return numberOfLesson;
    }

    public Group getGroup() {
        return group;
    }
}
