package br.com.cfarias.eventoKafka.produtor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cfarias.eventoKafka.service.ServicoEnvioMensagensKafka;

@RestController
@RequestMapping("/eventos")
public class ProdutorController {
	
	@Autowired
	private ServicoEnvioMensagensKafka envioMensagemService;
	
	@PostMapping
	public void enviarMensagem(@RequestBody String msg) {
		System.out.println("Enviando Mensagem !!! \n" + msg);
		
		envioMensagemService.enviarMensagem(msg);
		
		
		
		
	}

}
