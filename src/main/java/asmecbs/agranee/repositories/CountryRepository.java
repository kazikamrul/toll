package asmecbs.agranee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asmecbs.agranee.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
