package SmartProject.demo.Repository;

import SmartProject.demo.Entity.Sede;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SedeRepository extends CrudRepository<Sede, Long> {
}
