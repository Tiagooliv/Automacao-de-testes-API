package OlaMundoBasic;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundo {

	public static void main(String[] args) {

		Response response = RestAssured.request(Method.GET, "https://restapi.wcaquino.me/ola");

		
		// *** Imprimir no console o texto da api ***		   
		// System.out.println(response.getBody().asString());
		  
		// *** Imprimir no console o status da api ***
		//System.out.println(response.statusCode());
		 

		// *** Não imprimir o corpo/status, apenas verificar o status esperado ***		
		//System.out.println(response.getBody().asString().equals("Ola Mundo!"));
		System.out.println(response.statusCode() == 200);
		
		// ***Validar com exceções no console ***
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);

	}

}
