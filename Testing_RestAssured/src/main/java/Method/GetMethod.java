package Method;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethod {
	public int getCode() {
		Response response=RestAssured
				.given().relaxedHTTPSValidation()
				.auth().oauth2(apiKey)
				.when()
				.get(Endp)
				.then()
				.extract()
				.response();
		int code=response.statusCode();
		return code;
	}

}
