package entities;

public class Group {
    private long id;
    private String nameOfGroup;

    public Group(long id, String nameOfGroup) {
        this.id = id;
        this.nameOfGroup = nameOfGroup;
    }

    public long getId() {
        return id;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }
}
