package com.atividade3fiap.fase3;

import com.atividade3fiap.fase3.api.hateoas.TutorialItemAssembler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
//@EnableWebMvc
//@EnableSwagger2
public class Fase3Application {

	public static void main(String[] args) {
		SpringApplication.run(Fase3Application.class, args);
	}
//	@Bean
//	public TutorialItemAssembler MemberResourceAssembler memberResourceAssembler() {
//		return new MemberResourceAssembler(MemberController.class, MemberResource.class);
//	}

}
