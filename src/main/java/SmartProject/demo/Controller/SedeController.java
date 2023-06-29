package SmartProject.demo.Controller;

import SmartProject.demo.Entity.Sede;
import SmartProject.demo.Repository.SedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class SedeController {

    @Autowired
    private SedeRepository sedeRepository;

    @PutMapping(value = "/api/modifySede", consumes = {"application/json"})
    public void UpdateSede(@RequestBody Sede sedeUpdate) {
        sedeRepository.updateSede(sedeUpdate.getIdSede(), sedeUpdate.getLocation());
    }


}

