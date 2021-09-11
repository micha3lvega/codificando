package co.com.soft.technology.codificando.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = { "", "index" })
public class IndexController {

	@GetMapping("/{value}")
	public String dashboard(@PathVariable("value") String value, Model model) {

		System.out.println("Hola: " + value);
		return "index";

	}

}
