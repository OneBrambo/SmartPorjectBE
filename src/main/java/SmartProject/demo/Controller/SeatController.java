package SmartProject.demo.Controller;
import SmartProject.demo.Entity.Seat;
import SmartProject.demo.Repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class SeatController {

    @Autowired
    private SeatRepository seatRepository;

    @PostMapping(value = "/addsit")
    public Seat AddSeat(@RequestBody Seat NewSeat){
        return seatRepository.save(NewSeat);
    }

    @PutMapping(value = "/api/modifySeat", consumes = {"application/json"})
    public void UpdateSeat(@RequestBody Seat seatUpdate){
        seatRepository.updateSeat(seatUpdate.getId(), seatUpdate.getLabel(),seatUpdate.getRotation(), seatUpdate.getPosition_top(), seatUpdate.getPosition_left());
    }

    @DeleteMapping(value = "/api/delete/{id}")
    public void deleteSeat(@PathVariable("id") Long id){
        seatRepository.deleteById(id);
    }

}
