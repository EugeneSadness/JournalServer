package responses;

import java.util.List;

public class ResponseEntity<T>{

    private int status;
    private T resp;
    private List<String> errors;

    public ResponseEntity(int status, T resp){
        this.status = status;
        this.resp = resp;
    }

    public ResponseEntity(int status, List<String> errors) {
        this.status = status;
        this.errors = errors;
    }

    public ResponseEntity(int status){
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public T getResp() {
        return resp;
    }

    public List<String> getErrors() {
        return errors;
    }
}
