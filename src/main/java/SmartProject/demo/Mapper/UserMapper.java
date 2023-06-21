package SmartProject.demo.Mapper;

import SmartProject.demo.Dto.UserDto;
import SmartProject.demo.Entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {
    UserDto toDto(User user);
}
