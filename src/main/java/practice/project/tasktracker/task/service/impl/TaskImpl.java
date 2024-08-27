package practice.project.tasktracker.task.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import practice.project.tasktracker.common.exception.NotFound;
import practice.project.tasktracker.task.entity.Task;
import practice.project.tasktracker.task.entity.dto.TaskDto;
import practice.project.tasktracker.task.entity.mapper.TaskMapper;
import practice.project.tasktracker.task.repository.TaskRepository;
import practice.project.tasktracker.task.service.TaskService;

import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskImpl implements TaskService {

    private final TaskMapper taskMapper;
    private final TaskRepository taskRepository;

    @Override
    public Task addTask(TaskDto taskDto) {
        Task task=taskMapper.toTaskEntity(taskDto);
        return taskRepository.save(task);
    }

    @Override
    @Transactional
    public void updateTask(Long id, TaskDto taskDto){

            Optional<Task> existingTaskOptional = taskRepository.findById(id);
            Task existingTask = existingTaskOptional.get();

            existingTask.setStartDate(taskDto.startDate());
            existingTask.setEndDate(taskDto.endDate());
            existingTask.setExplain(taskDto.explain());
            existingTask.setDone(taskDto.done());
            existingTask.setCategory(taskDto.category());
            existingTask.setLevel(taskDto.level());
            taskRepository.save(existingTask);
        }

    @Override
    public TaskDto getById(Long id){
        Optional<Task> optionalTask=taskRepository.findById(id);
        if(optionalTask.isEmpty()){
            throw new NotFound("not found");
        }
        return taskMapper.taskToDto(optionalTask.get());
    }

    @Override
    public void deleteById(Long id) {
        if(!taskRepository.existsById(id)){
            throw new NotFound("not found");
        }
        taskRepository.deleteById(id);
    }
}
