package practice.project.tasktracker.task.entity.mapper;


import org.mapstruct.Mapper;
import practice.project.tasktracker.task.entity.dto.TaskDto;
import practice.project.tasktracker.task.entity.Task;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    Task toTaskEntity(TaskDto taskDto);
    TaskDto taskToDto(Task task);
    List<Task> toTaskList(List<TaskDto> taskDtos);
    List<TaskDto> taskToDtos(List<Task> taskList);

}
