package SmartProject.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "user_prenotation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUserSeat;

    private Date dataPrenotazione;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seatId;
}
