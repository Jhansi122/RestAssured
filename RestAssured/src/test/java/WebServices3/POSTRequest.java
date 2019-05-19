package WebServices3;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTRequest 
{
 @Test
 public void POST_Request()
 {
	 RestAssured.baseURI= "https://reqres.in/";
	 
	 RequestSpecification req = RestAssured.given();
	 
	 JSONObject reqpar = new JSONObject();
	 
	 reqpar.put("name", "morpheus");
	 reqpar.put("job", "leader");
	 reqpar.put("id", "998");
	 reqpar.put("createdAt", "2019-05-01T12:34:34.688Z");
	 req.header("Content-Type", "application/json");
	 req.body(reqpar.toString());
	  Response response = req.post("/api/users");
	  System.out.println("Response body = " +response.body().asString());
	 
	 
	 
 }
}
