package practice.project.tasktracker.user.service;

import practice.project.tasktracker.user.entity.User;
import practice.project.tasktracker.user.entity.dto.UserDto;

public interface UserService {


    User addUser(UserDto userDto);
    void updateUser(Long id, UserDto userDto);
    UserDto getById(Long id) throws Exception;
    void deleteById(Long id);
}
