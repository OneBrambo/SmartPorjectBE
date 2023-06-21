package SmartProject.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "Rooms")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nameRoom;
    private Integer totalNumberSeats;

    @OneToMany(mappedBy = "roomSeatsId")
    private List<Seat> idRoom;

}
