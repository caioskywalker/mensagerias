package br.com.cfarias.eventoKafka.configuracao;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ConfigTopic {
	
	@Value("${kafka.aplicacao.nome.topico}")
	private String nomeTopicoAplicacao;
	
	@Bean
	public NewTopic topicoAplicacao() {
		return TopicBuilder.name(nomeTopicoAplicacao).partitions(3).replicas(2).build();
	}
	
	
}
