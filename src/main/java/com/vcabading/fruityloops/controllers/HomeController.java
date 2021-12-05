package com.vcabading.fruityloops.controllers;

/////////////////////////////////////////////////////////////////
//HOME CONTROLLER
/////////////////////////////////////////////////////////////////

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("dojoName", "San Jose");
		return "index.jsp";
	}
}