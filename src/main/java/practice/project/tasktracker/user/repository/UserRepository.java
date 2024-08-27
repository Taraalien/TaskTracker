package practice.project.tasktracker.user.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practice.project.tasktracker.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
