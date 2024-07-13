package com.example.mensageria.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.mensageria.configuracao.ConfiguracaoRabbitMQ;

@Component
public class ServiceRabbitMQ {
	
	@Autowired
	private RabbitTemplate rabbitTamplate;
	
	public void enviaMensagem(String mensagem) {
		rabbitTamplate.convertAndSend(ConfiguracaoRabbitMQ.NOME_EXCHANGE, "aplicacao.rota.mensagem", mensagem);
	}
	

}
