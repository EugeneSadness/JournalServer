package responses.students;

import entities.Student;

import java.util.List;

public class GetStudentsByGroupResponse {

    private List<Student> students;

    public GetStudentsByGroupResponse(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

}
