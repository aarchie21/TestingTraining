package JavaPackage;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResReqGETRequest {
	public static void main(String[] args) throws InterruptedException {
		RestAssured.baseURI="https://reqres.in";
		String Endp="/api/users";
		String apiKey="reqres-free-v1";
		
//		Response res=RestAssured.get(Endp);
		Response response=RestAssured
				.given().relaxedHTTPSValidation()
				.auth().oauth2(apiKey)
				.when()
				.get(Endp)
				.then()
				.extract()
				.response();
		int code=response.statusCode();
		int scode=200;
		System.out.println("Status Code is: "+code);
		String sLine=response.statusLine();
		String statusLine="HTTP/1.1 200 OK";
		System.out.println("Status Line is: "+sLine);
		String bodyData=response.getBody().asPrettyString();
		System.out.println("Body data is: "+bodyData);
		
		Assert.assertEquals(code,scode);
		Assert.assertEquals(sLine,statusLine);
				
	}

}
