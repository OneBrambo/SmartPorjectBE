package SmartProject.demo.Mapper;

import SmartProject.demo.Dto.UserDto;
import SmartProject.demo.Entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    UserDto toDto(User user);

    List<UserDto> toDtoList(List<User> users);
}
