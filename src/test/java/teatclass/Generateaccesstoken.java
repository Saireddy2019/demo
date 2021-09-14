package teatclass;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	import com.fasterxml.jackson.core.JsonProcessingException;
	import com.fasterxml.jackson.databind.ObjectMapper;

	import Createaccreq.Generatetokenreq;
	//import demo.api.UrlConstants;
	//import helper.GeneratetokenHelper;
	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import ResponseDTO.Generatetokenres;


	public class Generateaccesstoken {
		protected String accesstoken= " +tokenres.getAccess_token()";
		protected static String tokenres = "";

		@Test
		public void GenerateToken() throws JsonProcessingException {
		Generateaccesstoken tokenreq=new Generateaccesstoken();
	    Generatetokenreq token=new Generatetokenreq();
	    	token.setGrant_type("password");
	    token.setUsername("anish.kumar@qapitol.com");
	    token.setPassword("anishj");
		System.out.println("First Api" + token);

		RestAssured.baseURI = "http://democart.qapitol.com";
		
		
		Response response = RestAssured.given().header("Content-Type", "application/json").body(token).log().all()
		.when().post("/spree_oauth/token").then().assertThat().statusCode(200).extract().response();

		//String responseBody = response.getBody().asString();
		System.out.println("responseBody" + response.asPrettyString());
		Generatetokenres tokenres=response.body().as(Generatetokenres.class);
		System.out.println("access token " + tokenres);
		System.out.println("access_token  " + tokenres.getAccess_token());
		System.out.println("Refresh_token  " + tokenres.getRefresh_token());
		
	}


}
