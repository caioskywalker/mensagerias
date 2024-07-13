package com.example.mensageria.produtor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mensageria.service.ServiceRabbitMQ;

@RestController
@RequestMapping("/mensagens")
public class Produtor {
	
	@Autowired
	private ServiceRabbitMQ serviceRabbitMq;
	
	@PostMapping
	public void enviaMensagem(@RequestBody String mensagem) {
		System.out.println("Enviando mensagem.... \n " + mensagem);
		serviceRabbitMq.enviaMensagem(mensagem);
	}
	
	
	

}
