package SmartProject.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Table(name = "Seats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String numberSeats;
    private Date reservationDate;
    private boolean aviable;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userSeatsId;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room roomSeatsId;
}
