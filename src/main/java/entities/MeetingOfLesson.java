package entities;

import java.util.List;

public class MeetingOfLesson {
    private long id;
    private Lesson lesson;
    private List<Student> list;

    public MeetingOfLesson(long id, Lesson lesson, List<Student> list) {
        this.id = id;
        this.lesson = lesson;
        this.list = list;
    }

    public long getId() {
        return id;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public List<Student> getList() {
        return list;
    }
}
