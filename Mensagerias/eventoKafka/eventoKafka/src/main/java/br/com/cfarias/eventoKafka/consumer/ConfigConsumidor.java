package br.com.cfarias.eventoKafka.consumer;

import org.springframework.kafka.annotation.DltHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.RetryableTopic;
import org.springframework.stereotype.Component;

@Component
public class ConfigConsumidor {
	
	@RetryableTopic(attempts = "2")
	@KafkaListener(topics = "${kafka.aplicacao.nome.topico}", groupId = "aplicacaoGroup")
	public void construirMensagem(String msg) {
		
		if(msg.contains("DLT")) {
			throw new IllegalArgumentException("Teste falha DLT!!!!! ");
		}
		
		System.out.println("Recebendo Mensagem...");
		System.out.println(msg);
		System.out.println("Mensagem Recebida...");
	}
	
	@DltHandler
	public void consumirMensagemDLT(String msg) {
		System.out.println("#######Recebendo Mensagem DLT...#######");
		System.out.println(msg);
		System.out.println("#######Mensagem Recebida... DLT#####");
	}

}
