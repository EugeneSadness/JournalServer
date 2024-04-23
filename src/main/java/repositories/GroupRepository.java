package repositories;

import entities.Group;
import exceptions.repostitories.ElementNotFoundException;
import exceptions.repostitories.RepositoryException;
import repositories.intefaces.IRepositoryGroup;
import java.util.*;

public class GroupRepository implements IRepositoryGroup {
    Random random = new Random();
    Storage storage;

    public GroupRepository(Storage storage){
        this.storage = storage;
    }

    public long create(String nameOfGroup) {
        Long id = Math.abs(random.nextLong());
        storage.getGroups().put(id, new Group(id, nameOfGroup));
        return id;
    }

    public Group read(long id) throws RepositoryException{
        if(!storage.getGroups().containsKey(id))
            throw new ElementNotFoundException("id: " + id + " isn't contained");
        return storage.getGroups().get(id);
    }

    public void update(long id, String nameOfGroup) throws RepositoryException {
        if(!storage.getGroups().containsKey(id))
            throw new ElementNotFoundException("id: " + id + " isn't contained");
        storage.getGroups().replace(id, new Group(id, nameOfGroup));
    }

    public void delete(long id) throws RepositoryException{
        if(!storage.getGroups().containsKey(id))
            throw new ElementNotFoundException("id: " + id + " isn't contained");
        storage.getGroups().remove(id);
    }

    public ArrayList<Group> readAll(){
        return new ArrayList<>(storage.getGroups().values());
    }
}
