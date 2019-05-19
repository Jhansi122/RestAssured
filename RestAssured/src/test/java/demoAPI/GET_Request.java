package demoAPI;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GET_Request {
	@Test
	public void GetRequest() 
	{
       RestAssured.baseURI="https://reqres.in/";
       RequestSpecification request =RestAssured.given();
       Response response = request.request(Method.GET, "/api/unknown");
       String body=response.getBody().asString();
       System.out.println("Response body " +body);
       
       String status_line =response.statusLine();
       System.out.println("StatusLine = "+status_line);

       int code= response.statusCode();
       System.out.println("Status code =" +code);
       
	}

}
