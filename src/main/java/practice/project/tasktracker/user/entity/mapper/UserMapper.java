package practice.project.tasktracker.user.entity.mapper;


import org.mapstruct.Mapper;
import practice.project.tasktracker.user.entity.User;
import practice.project.tasktracker.user.entity.dto.UserDto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUserEntity(UserDto userDto);
    UserDto userToDto(User user);
    List<User> toUserList(List<UserDto> userDtos);
    List<UserDto>userToDtos(List<User> users);
}
