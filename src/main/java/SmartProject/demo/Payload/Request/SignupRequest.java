package SmartProject.demo.Payload.Request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SignupRequest {
    private String firstName;
    private String lastName;
    private String site;
    @Email
    private String username;
    @Size(min = 1, max = 40)
    private String password;
    private String phoneNumber;
    private Set<String> role;
}