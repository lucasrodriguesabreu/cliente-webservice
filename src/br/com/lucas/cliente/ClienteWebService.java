package br.com.lucas.cliente;

import java.io.IOException;

import org.apache.http.client.fluent.Request;

public class ClienteWebService {

	public static void main(String[] args) throws Exception, IOException {
		
		String conteudo = Request
			.Post("http://localhost:8080/gerenciador/empresas")
			.addHeader("Accept", "aplication/xml")
			.execute()
			.returnContent()
			.asString();
		
		System.out.println(conteudo);

	}

}
