package practice.project.tasktracker.common.exception;

import org.springframework.http.HttpStatus;

public class NotFound extends BaseException{

    public NotFound(String description) {
        super(description, HttpStatus.NOT_FOUND);
    }
}
