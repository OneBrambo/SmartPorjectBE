package SmartProject.demo.Repository;

import SmartProject.demo.Entity.Seat;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, Long> {

    @Query(value = "UPDATE smart_project.seats " +
            "SET position_left = :position_left, " +
            "position_top = :position_top, " +
            "rotation = :rotation, " +
            "label = :lable " +
            "WHERE id = :id", nativeQuery = true)

    @Modifying
    @Transactional
    void updateSeat(Long id, String lable, String rotation, String position_top, String position_left);

}
