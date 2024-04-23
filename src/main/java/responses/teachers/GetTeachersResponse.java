package responses.teachers;

import entities.Teacher;

import java.util.List;

public class GetTeachersResponse {

    private List<Teacher> teachers;

    public GetTeachersResponse(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
