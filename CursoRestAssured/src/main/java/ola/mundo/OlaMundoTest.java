package ola.mundo;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundoTest {

	@Test
	public void TestOlaMundo() {

		Response response = RestAssured.request(Method.GET, "https://restapi.wcaquino.me/ola");

		Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
		// Validação 1

		// Validações do código de resposta
		Assert.assertTrue("O status code deveria ser 200.", response.statusCode() == 200);

		Assert.assertEquals(200, response.statusCode());

		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);

	}
}
