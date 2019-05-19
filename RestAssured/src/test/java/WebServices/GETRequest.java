package WebServices;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETRequest {
	@Test
	public void GetResponse() 
	{
	 //Specifying URI
      RestAssured.baseURI= "https://reqres.in/";
      
      //Specifying Http request type
      RequestSpecification request = RestAssured.given();
      Response response =request.request(Method.GET, "/api/users?page=2");
      
       //TO capture the response body
      
      String body =response.getBody().asString();
      System.out.println("Body =" +body);
 
      //To capture the status code
     int status_code= response.getStatusCode();
     System.out.println("Status code= "+status_code);
      
	}
}
 