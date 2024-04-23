package entities;

public class Subject {

    private long id;
    private String nameOfSubject;

    public Subject(long id, String nameOfSubject) {
        this.id = id;
        this.nameOfSubject = nameOfSubject;
    }

    public long getId() {
        return id;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }
}
