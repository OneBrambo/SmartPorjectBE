package SmartProject.demo.Repository;

import SmartProject.demo.Entity.Room;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room, Long> {

//    @Query(value = "UPDATE smart_project.rooms " +
//            " SET height = :height,   " +
//            " name_room = :nameRoom, " +
//            " total_number_seats = :totalNumberSeat, " +
//            " width = :width, " +
//            " WHERE id = :id", nativeQuery = true )
//
//    @Modifying
//    @Transactional
//    void updateRoom(Long id,String nameRoom,Integer totalNumberSeats, String width,String height);
}
