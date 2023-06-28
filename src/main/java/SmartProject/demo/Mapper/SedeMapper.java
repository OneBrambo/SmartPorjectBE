package SmartProject.demo.Mapper;

import SmartProject.demo.Dto.SedeDto;
import SmartProject.demo.Entity.Sede;
import org.mapstruct.Mapper;

@Mapper
public interface SedeMapper {
    SedeDto toDto(Sede sede);
}
