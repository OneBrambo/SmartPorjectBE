package SmartProject.demo.Dto;

import SmartProject.demo.Entity.Role;
import lombok.*;

import java.util.Set;

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
    private String username;
    private Set<Role> roles;
}
