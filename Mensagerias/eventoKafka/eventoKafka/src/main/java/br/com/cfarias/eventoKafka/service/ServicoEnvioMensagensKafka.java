package br.com.cfarias.eventoKafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ServicoEnvioMensagensKafka {
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	@Value("${kafka.aplicacao.nome.topico}")
	private String nomeTopico;
	
	public void enviarMensagem(String msg) {
		kafkaTemplate.send(nomeTopico, msg);
		
	}

}
