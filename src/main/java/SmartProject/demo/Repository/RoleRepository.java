package SmartProject.demo.Repository;

import SmartProject.demo.Entity.ERole;
import SmartProject.demo.Entity.Role;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
