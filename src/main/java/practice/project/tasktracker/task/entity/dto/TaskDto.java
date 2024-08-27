package practice.project.tasktracker.task.entity.dto;


import jakarta.validation.constraints.NotNull;
import practice.project.tasktracker.task.enums.Category;
import practice.project.tasktracker.task.enums.Level;
import java.time.LocalDateTime;

public record TaskDto (
                        @NotNull LocalDateTime startDate,
                        @NotNull LocalDateTime endDate,
                        @NotNull String explain,
                        @NotNull Boolean done,
                        @NotNull Level level,
                        @NotNull Category category){
}
