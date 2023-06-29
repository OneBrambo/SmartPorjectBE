package SmartProject.demo.Controller;

import SmartProject.demo.Entity.Room;
import SmartProject.demo.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;

    @PostMapping("/api/addRoom")
    public Room addRoom(@RequestBody Room newRoom){
        return roomRepository.save(newRoom);
    }

    @DeleteMapping(value = "/api/deleteRoom/{id}")
    public void deleteRoom(@PathVariable("id") long id){
        roomRepository.deleteById(id);
    }

//    @PutMapping(value = "/api/modifyRoom",consumes = {"application/json"} )
//    public void UpdateRoom(@RequestBody Room roomUpdate){
//        roomRepository.updateRoom(roomUpdate.getId(),roomUpdate.getNameRoom(),roomUpdate.getTotalNumberSeats(),roomUpdate.getWidth(),roomUpdate.getHeight());
//    }
}
