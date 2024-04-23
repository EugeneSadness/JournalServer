package repositories;

import entities.Group;
import entities.Student;
import java.util.HashMap;
import java.util.Map;

public class Storage {
    private static Storage instance;
    private HashMap<Long, Group> groups;
    private HashMap<Long, Student> students;

    private Storage() {
        this.groups = new HashMap<>();
        this.students = new HashMap<>();
    }

    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public HashMap<Long, Group> getGroups() {
        return groups;
    }

    public HashMap<Long, Student> getStudents() {
        return students;
    }
}