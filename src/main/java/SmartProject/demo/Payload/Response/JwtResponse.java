package SmartProject.demo.Payload.Response;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long idUser;
    @NotNull
    private String username; //email dell'utente

    private String firstName;

    private String lastName;
    private List<String> roles;

    public JwtResponse(String accessToken, Long id, String username, String name, String surname, List<String> roles) {
        this.token = accessToken;
        this.idUser = id;
        this.username = username;
        this.firstName = name;
        this.lastName = surname;
        this.roles = roles;
    }
}
