package practice.project.tasktracker.task.service;

import practice.project.tasktracker.task.entity.Task;
import practice.project.tasktracker.task.entity.dto.TaskDto;

public interface TaskService {

    Task addTask(TaskDto taskDto);
    void updateTask(Long id,TaskDto taskDto);
    TaskDto getById(Long id) throws Exception;
    void deleteById(Long id);
}
