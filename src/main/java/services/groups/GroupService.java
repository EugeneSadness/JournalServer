package services.groups;

import entities.Group;
import exceptions.repostitories.RepositoryException;
import exceptions.services.NotFoundService;
import exceptions.services.ServiceException;
import repositories.GroupRepository;
import repositories.Storage;

import java.util.ArrayList;
import java.util.List;

public class GroupService implements IServiceGroup{
    GroupRepository groupRepository;

    public GroupService(Storage storage){
        groupRepository = new GroupRepository(storage);
    }

     public long create(String nameOfGroup){
         return groupRepository.create(nameOfGroup);
     }

    public Group read(long id) throws ServiceException {
        try {
            return groupRepository.read(id);
        } catch (RepositoryException e) {
            throw new NotFoundService(e);
        }
    }

    public void update(long id, String nameOfGroup) throws ServiceException{
        try {
            groupRepository.update(id, nameOfGroup);
        } catch (RepositoryException e) {
            throw new NotFoundService(e);
        }
    }

    public void delete(long id) throws ServiceException{
        try {
            groupRepository.delete(id);
        } catch (RepositoryException e) {
            throw new NotFoundService(e);
        }
    }

    public ArrayList<Group> readAll(){
         return groupRepository.readAll();
    }
}
