package practice.project.tasktracker.task.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.project.tasktracker.task.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
