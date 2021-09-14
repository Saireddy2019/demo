package teatclass;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.fasterxml.jackson.core.JsonProcessingException;

	//import RequestDTO.GeneratetokenReqDTO;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import Createaccreq.Createaccreq;
	import Createaccreq.User;


	public class Createacc {
		
	@Test
		
		public void createacc() throws JsonProcessingException {
		User user=new User();
		Createaccreq tokenreq=new Createaccreq();
		tokenreq.setUser(user);
			System.out.println("tokenreq  " + user);
		
			RestAssured.baseURI="http://democart.qapitol.com";
		Response getResponse=RestAssured.given()
				.header("Content-Type", "application/vnd.api+json")
				.body(tokenreq)
				.when()
				.post("/api/v2/storefront/account")
				.then()
				.assertThat().statusCode(200)
				.extract().response();
				//System.out.println("Second API Response : " + getResponse.asString());
				System.out.println("Second API Response : " + getResponse.asPrettyString());
				
				Createacc Resp=getResponse.body().as(Createacc.class);
				System.out.println("Response " +Resp);
				
					
	}


	}
