package SmartProject.demo.Repository;

import SmartProject.demo.Entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}
