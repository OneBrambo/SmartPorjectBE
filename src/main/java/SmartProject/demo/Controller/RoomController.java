package SmartProject.demo.Controller;

import SmartProject.demo.Entity.Room;
import SmartProject.demo.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;

    @PostMapping("/api/addRoom")
    public Room addRoom(@RequestBody Room newRoom){
        return roomRepository.save(newRoom);
    }
}
