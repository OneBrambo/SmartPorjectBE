package SmartProject.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Table(name = "seats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String seatCode;
    private String label;
    private String rotation;
    private String position_top;
    private String position_left;
    private boolean available;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room roomSeatsId;

    @OneToMany(mappedBy = "seatId")
    private List<UserSeat> idUserSeat;
}
