package asmecbs.agranee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asmecbs.agranee.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
