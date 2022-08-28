package asmecbs.agranee.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

	@GetMapping(value = { "/index", "/" })
	public String findAll(Model model) {

		return "index";

	}

	@GetMapping("/login")
	public String login() {
		return "login";

	}

	@GetMapping("/logout")
	public String logout() {
		return "login";

	}

}
