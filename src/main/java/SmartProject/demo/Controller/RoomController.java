package SmartProject.demo.Controller;

import SmartProject.demo.Dto.RoomDto;
import SmartProject.demo.Entity.Room;
import SmartProject.demo.Mapper.RoomMapper;
import SmartProject.demo.Mapper.SedeMapper;
import SmartProject.demo.Repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class RoomController {
    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RoomMapper roomMapper;

    @PostMapping("/api/addRoom")
    public Room addRoom(@RequestBody Room newRoom){
        return roomRepository.save(newRoom);
    }

    @GetMapping("/api/getRooms")
    public ResponseEntity<List<RoomDto>> getRooms(){
        Optional<List<Room>> rooms = Optional.ofNullable((List<Room>) roomRepository.findAll());
        if(rooms.isPresent()){
            return new ResponseEntity<>(roomMapper.toDtoList(rooms.get()), HttpStatus.OK);
        }
        else return ResponseEntity.notFound().build();
    }
}
