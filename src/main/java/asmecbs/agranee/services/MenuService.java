package asmecbs.agranee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import asmecbs.agranee.models.Menu;
import asmecbs.agranee.repositories.MenuRepository;

@Service
public class MenuService {
	@Autowired
	MenuRepository menuRepository;

	// Get All Clients
	public List<Menu> findAll() {
		return menuRepository.findAll();
	}

}
