package SmartProject.demo.Controller;

import SmartProject.demo.Dto.UserDto;
import SmartProject.demo.Entity.User;
import SmartProject.demo.Mapper.UserMapper;
import SmartProject.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @PostMapping(value = "/api/addUser", consumes = "application/json")
    public User addUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @PutMapping("/api/updateUser")
    public ResponseEntity<UserDto> update(@RequestBody User user) {
        return userRepository.findById(user.getId())
                .map(userFound -> {
                    userFound.setFirstName((user.getFirstName()));
                    userFound.setLastName((user.getLastName()));
                    userFound.setPhoneNumber((user.getPhoneNumber()));
                    userFound.setSite((user.getSite()));
                    userRepository.save(userFound);
                    return new ResponseEntity<>(userMapper.toDto(user), HttpStatus.OK);
                })
                .orElseGet(() -> {
                    return ResponseEntity.notFound().build();
                });
    }

    @DeleteMapping("/api/deleteUser/{id}")
    public void  deleteUser (@PathVariable("id") Long id) {
        userRepository.deleteById(id);
    }
}

