package controllers.students;

import entities.Group;
import entities.Student;
import repositories.Storage;
import requests.students.*;
import responses.ResponseEntity;
import responses.students.*;
import services.groups.GroupService;
import services.students.StudentService;
import validators.students.*;
import java.util.ArrayList;
import java.util.List;

public class StudentController {
    private StudentService studentService;
    private GroupService groupService;

    public StudentController(Storage storage){
        studentService = new StudentService(storage);
        groupService = new GroupService(storage);
    }

    public ResponseEntity<AddStudentResponse> addStudent(AddStudentRequest request){
        int status;
        long id;
        List<String> errors;
        try {
            errors = new AddStudentsRequestValidator().validate(request);
            if (errors.isEmpty()) {
                Student student = new Student(request.getGroupId(), request.getFirstName(), request.getLastName(),
                        request.getMiddleName(), request.getStatus());
                id = studentService.create(request.getGroupId(), request.getFirstName(),
                        request.getLastName(), request.getMiddleName(), request.getStatus());
                status = 200;
                return new ResponseEntity<AddStudentResponse>(status, new AddStudentResponse(id));
            }
            id = -1;
            status = 400;
            return new ResponseEntity<AddStudentResponse>(status, errors);
        }
        catch (Exception e){
            return new ResponseEntity<AddStudentResponse>(400, List.of("Some error happens!"));
        }
    }

    public ResponseEntity<GetStudentByIdResponse> getStudentById(GetStudentByIdRequest request){
        int status;
        List<String> errors;
        try {
            errors = new GetStudentByIdRequestValidator().validate(request);
            if (errors.isEmpty()) {
                Student student = studentService.read(request.getId());
                status = 200;
                return new ResponseEntity<GetStudentByIdResponse>(status, new GetStudentByIdResponse(
                        student.getFirstName(), student.getLastName(),
                        student.getMiddleName(), student.getStatus()));
            }
            status = 400;
            return new ResponseEntity<GetStudentByIdResponse>(status, errors);
        }
        catch (Exception e){
            return new ResponseEntity<GetStudentByIdResponse>(400, List.of("Some errors happen!"));
        }
    }

    public ResponseEntity<GetStudentsByGroupResponse> getStudentsByGroup(GetStudentsByGroupRequest request){
        int status;
        List<String> errors;
        try {
            errors = new GetStudentsByGroupRequestValidator().validate(request);
            if(errors.isEmpty()){
                ArrayList<Student> students = studentService.getByGroup(request.getIdOfGroup());
                status = 200;
                return new ResponseEntity<GetStudentsByGroupResponse>(status, new GetStudentsByGroupResponse(students));
            }
            status = 400;
            return new ResponseEntity<GetStudentsByGroupResponse>(status, errors);
        }
        catch (Exception e){
            return new ResponseEntity<GetStudentsByGroupResponse>(400, List.of("Some errors happen!"));
        }
    }

    public ResponseEntity<DeleteStudentResponse> deleteStudentById(DeleteStudentRequest request){
        int status;
        List<String> errors;
        try {
            errors = new DeleteStudentRequestValidator().validate(request);
            if (errors.isEmpty()) {
                studentService.delete(request.getId());
                status = 200;
                return new ResponseEntity<DeleteStudentResponse>(status, new DeleteStudentResponse());
            }
            status = 400;
            return new ResponseEntity<DeleteStudentResponse>(status, errors);
        }
        catch (Exception e){
            return new ResponseEntity<DeleteStudentResponse>(400, List.of("Some error happens!"));
        }
    }


    public ResponseEntity<EditStudentResponse> editStudentById(EditStudentRequest request){
        int status;
        List<String> errors;
        try {
            errors = new EditStudentRequestValidator().validate(request);
            if (errors.isEmpty()) {
                studentService.update(request.getId(), new Student(request.getId(),
                        request.getFirstName(), request.getLastName(),
                        request.getMiddleName() , request.getStatus()));
                status = 200;
                return new ResponseEntity<EditStudentResponse>(status, new EditStudentResponse());
            }
            status = 400;
            return new ResponseEntity<EditStudentResponse>(status, errors);
        }
        catch (Exception e){
            return new ResponseEntity<EditStudentResponse>(400, List.of("Some error happens!"));
        }
    }
}