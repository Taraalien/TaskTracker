package practice.project.tasktracker.common.exception;


import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import practice.project.tasktracker.common.entity.ErrorResponses;

@ControllerAdvice
class GlobalExceptionHandler  {


    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ErrorResponses> handleBaseException(BaseException ex) {
        // Create the error response
        ErrorResponses errorResponses = new ErrorResponses(
                ex.getStatus().value(),    // HTTP status code
                ex.getDescription()        // Error message
        );

        // Return ResponseEntity with the error response and status code
        return new ResponseEntity<>(errorResponses, ex.getStatus());
    }

}
