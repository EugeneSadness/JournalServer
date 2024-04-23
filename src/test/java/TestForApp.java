import controllers.groups.GroupController;
import controllers.students.StudentController;
import entities.Group;
import entities.Student;
import org.junit.Before;
import org.junit.Test;
import repositories.Storage;
import requests.groups.AddGroupRequest;
import requests.groups.DeleteGroupRequest;
import requests.groups.EditGroupRequest;
import requests.groups.GetGroupByIdRequest;
import requests.students.*;
import responses.ResponseEntity;
import responses.groups.AddGroupResponse;
import responses.groups.DeleteGroupResponse;
import responses.groups.EditGroupResponse;
import responses.groups.GetGroupByIdResponse;
import responses.students.AddStudentResponse;
import responses.students.DeleteStudentResponse;
import responses.students.EditStudentResponse;
import responses.students.GetStudentsByGroupResponse;
import services.groups.GroupService;
import services.students.StudentService;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestForApp {

    private final Storage storage = Storage.getInstance(); ;
    private final StudentController studentController = new StudentController(storage);
    private final GroupController groupController = new GroupController(storage);

    @Before
    public void init(){
        ///заполним чутка бд
        storage.getGroups().put(125L, new Group(125L, "MMB-104"));
        storage.getGroups().put(136L, new Group(136L, "MMB-102"));
        storage.getStudents().put(11L, new Student(11L, 125L, "Ivanov", "Ivan", "Ivanich", "Listed"));
        storage.getStudents().put(12L, new Student(12L, 125L, "Kashov", "Max", "Lebedovich", "UnListed"));
        storage.getStudents().put(16L, new Student(16L, 136L, "Babov", "Alex", "Nikolaich", "Listed"));
    }

    @Test
    public void checkCreates() {
        //Просмотрим create , заодно и ResponseEntity
        ArrayList<ResponseEntity<AddStudentResponse>> arrayOfStudents = new ArrayList<>();
        ResponseEntity<AddGroupResponse> responseEntityGroup = groupController.addGroup(new AddGroupRequest("MMB-101"));
        ResponseEntity<AddStudentResponse> addStudentResponseResponseEntity =
                studentController.addStudent(new AddStudentRequest(
                        "Hopov", "Hop", "Hopovich", responseEntityGroup.getResp().getId(), "Listed"));
        //Чекнем ResponseEntity для студентов
        assertEquals(storage.getStudents().get(addStudentResponseResponseEntity.getResp().getId()).getFirstName(), "Hop");
        assertEquals(200, addStudentResponseResponseEntity.getStatus());
        //Теперь для групп
        assertEquals(storage.getGroups().get(responseEntityGroup.getResp().getId()).getNameOfGroup(), "MMB-101");
        assertEquals(200, responseEntityGroup.getStatus());

    }
    //К моему превеликому сожалению в респонзе данной операции нет ни одного поля...
    // Хотя хотелось бы, чтобы выводило Student, чтобы в случае случайного удаления,
    // можно было из ResponseEntity его достать и восстановить!
    @Test
    public void checkDeletes(){
        //Удаляем 12L, 125L, "Kashov", "Max", "Lebedovich", "UnListed"
        ResponseEntity<DeleteStudentResponse>  responseStudent =
                studentController.deleteStudentById(new DeleteStudentRequest(12L));
        assertTrue(!storage.getStudents().containsKey(12L));
        //Удаляем 136L, "MMB-104"
        ResponseEntity<DeleteGroupResponse> deleteGroupResponseResponseEntity =
                groupController.deleteGroup(new DeleteGroupRequest(136L));
        assertTrue(!storage.getGroups().containsKey(136L));
    }

    //Давайте обновим данные студентишек и групп
    @Test
    public void checkUpdate(){
        //Обновим 12L, 125L, "Kashov", "Max", "Lebedovich", "UnListed"
        //   : на 12L, 125L, "Lakov", "Kirill", "Kavanovich", "Listed"

        ResponseEntity<EditStudentResponse> responseEntityStudent =
                studentController.editStudentById(
                        new EditStudentRequest(12L, "Kavanovich", "Lakov", "Kirill", 125L, "Listed"));
        assertEquals(responseEntityStudent.getStatus(), 200);
        assertEquals(studentController.getStudentById(
                new GetStudentByIdRequest(12L)).getResp().getFirstName(), "Lakov");

        // Обновим 136L, "MMB-104"
        //   : на  136L, "HTB-101"

        ResponseEntity<EditGroupResponse> groupResponseResponseEntity =
                groupController.editGroup(
                        new EditGroupRequest(136L, "HTB-101"));
        assertEquals(groupResponseResponseEntity.getStatus(), 200);
        assertEquals(groupController.getGroupById(new GetGroupByIdRequest(136L)).getResp().getNameOfGroup(), "HTB-101");
    }

    @Test
    public void checkGetStudentByGroup() {
        ResponseEntity<GetStudentsByGroupResponse> responseEntity =
                studentController.getStudentsByGroup(new GetStudentsByGroupRequest(136L));
        assertEquals(200, responseEntity.getStatus());
        assertTrue(!responseEntity.getResp().getStudents().isEmpty());
    }

    @Test
    public void checkErrors() {
        //Давайте-ка пройдемся по Id, которых нет и половим ошибки
        ResponseEntity<DeleteStudentResponse> responseEntityStudent =
                studentController.deleteStudentById(new DeleteStudentRequest(12532131L));
        ResponseEntity<DeleteGroupResponse> responseEntityGroup =
                groupController.deleteGroup(new DeleteGroupRequest(123124L));

        assertEquals(List.of("Some error happens!"), responseEntityGroup.getErrors());
        assertEquals(List.of("Some error happens!"), responseEntityStudent.getErrors());
    }

    @Test
    public void checkReadAll(){
        //Ну и напоследок проверим оставшуюся функцию readAll
        GroupService groupService = new GroupService(storage);
        StudentService studentService = new StudentService(storage);
        ArrayList<Student> students = studentService.readAll();
        ArrayList<Group> groups = groupService.readAll();
        assertEquals(storage.getStudents().values().stream().toList(), students);
        assertEquals(storage.getGroups().values().stream().toList(), groups);
    }
}