package asmecbs.agranee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asmecbs.agranee.models.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
