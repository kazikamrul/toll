package asmecbs.agranee.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import asmecbs.agranee.models.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {

	List<Menu> findByActiveTrue();

}