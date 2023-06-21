package SmartProject.demo.Repository;

import SmartProject.demo.Entity.Seat;
import org.springframework.data.repository.CrudRepository;

public interface SeatRepository extends CrudRepository<Seat, Long> {
}
