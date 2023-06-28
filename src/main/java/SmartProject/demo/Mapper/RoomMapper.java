package SmartProject.demo.Mapper;

import SmartProject.demo.Dto.RoomDto;
import SmartProject.demo.Entity.Room;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface RoomMapper {
    RoomDto toDto(Room room);

    List<RoomDto> toDtoList(List<Room> rooms);
}
