package practice.project.tasktracker.user.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import practice.project.tasktracker.user.entity.dto.UserDto;
import practice.project.tasktracker.user.service.UserService;
import practice.project.tasktracker.user.entity.User;

@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping("addUser")
    public User addUser(@RequestBody UserDto userDto){
        return userService.addUser(userDto);
    }

    @PutMapping("updateUser/{id}")
    public void updateUser(@PathVariable Long id,@RequestBody UserDto userDto){
        userService.updateUser(id,userDto);
    }

    @GetMapping("getById/{id}")
    public UserDto getById(@PathVariable Long id) throws Exception {
        return userService.getById(id);
    }

    @DeleteMapping("deleteById/{id}")
    public void deleteById(@PathVariable Long id){
        userService.deleteById(id);
    }

}
