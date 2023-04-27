package com.projeto.spring.curso.teste;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import com.projeto.spring.curso.controller.CursoController;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TesteSpringCurso {
	
	
	@Autowired
	private CursoController cc;
	
	@Test
	public void testarController() {
		String body = this.cc.dados();
		assertThat(body).isEqualTo("atividade");
	
	}
	

}
