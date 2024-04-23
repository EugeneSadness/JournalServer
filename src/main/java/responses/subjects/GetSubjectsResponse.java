package responses.subjects;

import entities.Subject;

import java.util.List;

public class GetSubjectsResponse {

    private List<Subject> subjects;

    public GetSubjectsResponse(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}
