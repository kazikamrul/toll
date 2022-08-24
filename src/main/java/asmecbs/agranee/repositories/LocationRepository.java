package asmecbs.agranee.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import asmecbs.agranee.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
