package br.senac.tads.dsw.dados_pessoais;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

	@GetMapping("/hello")
	public Mensagem hello() {
		return new Mensagem("Eduardo Leite Ribeiro e Gabriel Ramon Evangelista Ramos", "Olá, mundo! Nosso primeiro endpoint Spring Boot.");
	}

}
