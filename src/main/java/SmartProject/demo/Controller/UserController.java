package SmartProject.demo.Controller;

import SmartProject.demo.Entity.User;
import SmartProject.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PutMapping(value = "/api/modifyUser", consumes = {"application/json"})
    public void UpdateUser(@RequestBody User userUpdate) {
        userRepository.updateUser(userUpdate.getId(), userUpdate.getFirstName(), userUpdate.getLastName(), userUpdate.getUsername(), userUpdate.getPhoneNumber(), userUpdate.getSite());
    }

    @DeleteMapping(value = "api/deleteUser/{id}")
    public void deleteUser(@PathVariable("id")long id){
        userRepository.deleteById(id);
    }
}
