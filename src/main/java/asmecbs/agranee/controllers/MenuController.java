package asmecbs.agranee.controllers;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import asmecbs.agranee.models.Menu;
import asmecbs.agranee.services.MenuService;

@Controller
public class MenuController {

	 @Autowired
	private MenuService menuService;

	@CrossOrigin
	//@GetMapping("/menu")
	@ResponseBody
	public List<Menu> getMenus() {

		return (List<Menu>) menuService.findAll();
		
		
		// return (List<Menu>) menuService.findAll().stream() .filter(menu ->
		// Objects.isNull(menu.getParent()).collect(Collectors.toList()));
	}
	
	/*
	public String findAll(Model model){		
		model.addAttribute("menu", menuService.findAll());
		return "menu";
	}
	*/

}
