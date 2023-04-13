package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@GetMapping 
	public String hello() {
		return "<b>Hello Turma 62!<b>";
	}

	@GetMapping ("/nome")
	public String nome() {
		return "<b>Nicolle<b>";
		
}
	@GetMapping ("/bsms")
	public String bsms() {
		return "<h1 style = \"color: Blue\"> \r\n"
				+ "Essas são as BSM'S\r\n"
				+ "\r\n"
				+ "</h1>\r\n"
				+ "\r\n"
				+ "<h3 style = \"color: red\">\r\n"
				+ "Mentalidade de crescimento<br>\r\n"
				+ "Persistência<br>\r\n"
				+ "Responsabilidade pessoal<br>\r\n"
				+ "Orientação ao futuro<br>\r\n"
				+ "Comunicação<br>\r\n"
				+ "Orientação ao detalhe<br>\r\n"
				+ "Proatividade<br>\r\n"
				+ "Trabalho em equipe<br>\r\n";
				
}

}