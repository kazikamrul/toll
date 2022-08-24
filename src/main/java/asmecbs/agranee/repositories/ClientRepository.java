package asmecbs.agranee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asmecbs.agranee.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
