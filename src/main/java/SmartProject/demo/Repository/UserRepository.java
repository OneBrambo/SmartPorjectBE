package SmartProject.demo.Repository;

import SmartProject.demo.Entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);

    @Query(value = "UPDATE smart_project.users " +
            "SET first_name = :name, " +
            "   last_name = :surname, " +
            "   username = :username, " +
            "   phone_number = :phoneNumber," +
            "   site = :site " +
            "WHERE id = :id", nativeQuery = true)
    @Modifying
    @Transactional
    void updateUser(Long id, String name, String surname, String username, String phoneNumber, String site);
}
