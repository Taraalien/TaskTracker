package practice.project.tasktracker.common.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponses {

    private int status;
    private String message;

}
