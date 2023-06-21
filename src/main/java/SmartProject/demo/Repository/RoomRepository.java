package SmartProject.demo.Repository;

import SmartProject.demo.Entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {
}
