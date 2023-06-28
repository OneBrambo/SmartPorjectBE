package SmartProject.demo.Dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String site;
    private String phoneNumber;
    private String email;
}
