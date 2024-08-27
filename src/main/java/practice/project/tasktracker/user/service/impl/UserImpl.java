package practice.project.tasktracker.user.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import practice.project.tasktracker.common.exception.NotFound;
import practice.project.tasktracker.user.repository.UserRepository;
import practice.project.tasktracker.user.entity.User;
import practice.project.tasktracker.user.entity.dto.UserDto;
import practice.project.tasktracker.user.entity.mapper.UserMapper;
import practice.project.tasktracker.user.service.UserService;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserImpl implements UserService {

    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    public User addUser(UserDto userDto) {
        User user=userMapper.toUserEntity(userDto);
        return userRepository.save(user);
    }

    @Override
    public void updateUser(Long id, UserDto userDto) {
        Optional<User>optionalUser=userRepository.findById(id);
        User user=optionalUser.get();

        user.setUserName(userDto.userName());
        user.setPassword(userDto.password());
        user.setGmail(userDto.gmail());
        userRepository.save(user);

    }

    @Override
    public UserDto getById(Long id) throws Exception {
        Optional<User>optionalUser=userRepository.findById(id);
        if(optionalUser.isEmpty()){

            throw new NotFound("not found");
        }
        return userMapper.userToDto(optionalUser.get());
    }

    @Override
    public void deleteById(Long id) {
        if(!userRepository.existsById(id)){
            throw new NotFound("not found");
        }
        userRepository.deleteById(id);
    }
}
