package SmartProject.demo.Controller;

import SmartProject.demo.Dto.UserDto;
import SmartProject.demo.Entity.User;
import SmartProject.demo.Mapper.UserMapper;
import SmartProject.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @PutMapping(value = "/api/modifyUser", consumes = {"application/json"})
    public void UpdateUser(@RequestBody User userUpdate) {
        userRepository.updateUser(userUpdate.getId(), userUpdate.getFirstName(), userUpdate.getLastName(), userUpdate.getUsername(), userUpdate.getPhoneNumber(), userUpdate.getSite());
    }

    @DeleteMapping(value = "api/deleteUser/{id}")
    public void deleteUser(@PathVariable("id")long id){
        userRepository.deleteById(id);
    }

    @GetMapping(value = "/api/getAllUsers")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        Optional<List<User>> users = Optional.ofNullable((List<User>) userRepository.findAll());
        if(users.isPresent()){
            System.out.println(users.toString());
            return new ResponseEntity<>(userMapper.toDtoList(users.get()), HttpStatus.OK);
        }
        else return ResponseEntity.notFound().build();
    }
}
