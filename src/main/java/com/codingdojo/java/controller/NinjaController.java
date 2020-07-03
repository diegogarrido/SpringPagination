package com.codingdojo.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.codingdojo.java.model.Ninja;
import com.codingdojo.java.model.dao.NinjaService;

@Controller
public class NinjaController {

	@Autowired
	NinjaService ninjaService;

	@GetMapping("/")
	public String index() {
		return "redirect:/pages/1";
	}

	@GetMapping("/pages/{page}")
	public String ninjas(@PathVariable int page, Model model) {
		Page<Ninja> ninjas = ninjaService.ninjasPerPage(page - 1);
		model.addAttribute("page", page);
		model.addAttribute("totalPages", ninjas.getTotalPages());
		model.addAttribute("ninjas", ninjas);
		return "ninjas";
	}

}
