package SmartProject.demo.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoomDto {
    private Long id;
    private String nameRoom;
    private Integer totalNumberSeats;
    private String width;
    private String height;
    private SedeDto idSede;
}
