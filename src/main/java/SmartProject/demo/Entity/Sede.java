package SmartProject.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "sedi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sede {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSede;

    private SedeEnum location;

    @OneToMany(mappedBy = "idSedeRoom")
    private List<Room> rooms;
}
