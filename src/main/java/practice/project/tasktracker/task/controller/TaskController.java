package practice.project.tasktracker.task.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import practice.project.tasktracker.task.entity.dto.TaskDto;
import practice.project.tasktracker.task.entity.Task;
import practice.project.tasktracker.task.service.TaskService;

import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("api/tasks")
@AllArgsConstructor
public class TaskController {


    private final TaskService taskService;


    @PostMapping("addTask")
    public Task addTask(@RequestBody TaskDto taskDto){
        return taskService.addTask(taskDto);
    }

    @PutMapping("updateTask/{id}")
    public void updateTask(@PathVariable Long id,@RequestBody TaskDto taskDto){
        taskService.updateTask(id,taskDto);
    }

    @GetMapping("getById/{id}")
    public TaskDto getById(@PathVariable Long id) throws Exception {
       return taskService.getById(id);
    }

    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable Long id){
         taskService.deleteById(id);
    }


}
