package practice.project.tasktracker.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.http.HttpStatus;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public abstract class BaseException extends RuntimeException {

    private final String description;
    private final HttpStatus status;

}
