package com.example.mensageria.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.mensageria.configuracao.ConfiguracaoRabbitMQ;

@Component
@RabbitListener(queues = ConfiguracaoRabbitMQ.NOME_FILA)
public class Consumidor {

	@RabbitHandler
	public void consumirMensagem(String mensagem) {
		System.out.println("Recebendo mensagem......");
		System.out.println(mensagem);
		System.out.println("Mensagem Recebida!!!!!!!!!");
	}
	
	
}
