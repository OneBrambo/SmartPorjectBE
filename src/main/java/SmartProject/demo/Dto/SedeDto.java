package SmartProject.demo.Dto;

import SmartProject.demo.Entity.SedeEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SedeDto {
    private Long idSede;
    private SedeEnum location;
}
