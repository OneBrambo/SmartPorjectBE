package SmartProject.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Table(name = "rooms")
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
    private String width;
    private String height;

    @OneToMany(mappedBy = "roomSeatsId")
    private List<Seat> idRoom;

    @ManyToOne
    @JoinColumn(name = "id_sede")
    private Sede idSede;

}
