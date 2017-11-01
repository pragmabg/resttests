package restassured;

import static io.restassured.RestAssured.given;

import java.net.URI;
import java.net.URISyntaxException;

import org.hamcrest.Matchers;
import org.junit.Ignore;
import org.junit.Test;


import io.restassured.response.Response;
import request.pojos.RepositoryRequest;
import response.pojos.RepositoryResponse;

public class Testcheta {
	
	@Test
	public void getUserEmails() throws URISyntaxException {
		
		Response response = given()
			.baseUri("https://api.github.com")
			.contentType("application/json")
			.auth().preemptive().basic("pragmaticuser", "parola123")
		.when()
			.get(new URI("/user/emails"));
			
		response.getBody().prettyPrint();
		
		response
			.then()
				.statusCode(200)
				.body(
						"[0].email", Matchers.equalTo("milen.strahinski@pragmatic.bg"),
						".", Matchers.hasSize(2),
						"[0].primary", Matchers.any(Boolean.class));
		
	}
	
	@Test
	public void test2() throws URISyntaxException {
		
		Response response = given()
			.baseUri("https://api.github.com")
			.contentType("application/json")
			.auth().preemptive().basic("pragmaticuser", "parola123")
		.when()
			.formParam("direction", "desc")
			.get("/users/pragmaticuser/repos");
			
		response.getBody().prettyPrint();
		
	}
	
	
	@Test
	public void test3() throws URISyntaxException {
		
		RepositoryRequest exampleRepo = new RepositoryRequest();
		exampleRepo.setName("novichko3");
		exampleRepo.setAllow_merge_commit(true);
		
		Response response = given()
			.baseUri("https://api.github.com")
			.contentType("application/json")
			.auth().preemptive().basic("pragmaticuser", "parola123")
			.body(exampleRepo)
		.when()
			.post(new URI("/user/repos"));
			
			
		response.getBody().prettyPrint();
		RepositoryResponse createdRepository = response.getBody().as(RepositoryResponse.class);
		
		System.out.println(createdRepository.getFull_name());
		System.out.println(createdRepository.getId());
		System.out.println(createdRepository.is_private());
		
	}

}
