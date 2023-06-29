package SmartProject.demo.Repository;

import SmartProject.demo.Entity.Sede;
import SmartProject.demo.Entity.SedeEnum;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SedeRepository extends CrudRepository<Sede, Long> {

    @Query(value = "UPDATE smart_project.sedi " +
            "SET location = :location " +
            "WHERE id_sede = :idSede", nativeQuery = true)

    @Modifying
    @Transactional
    void updateSede(Long idSede, SedeEnum location);



}
