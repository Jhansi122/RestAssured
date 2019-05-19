package WebServices2;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETRequest_Demo 
{
	@Test
	public void GET_Demo() 
	{
         RestAssured.baseURI="https://reqres.in/";
         RequestSpecification req= RestAssured.given();
         Response res=req.request(Method.GET,"/api/users/23");
         String body =res.getBody().asString();
         System.out.println("Body = "+body);
         int code = res.getStatusCode();
         System.out.println("Status Code=" +code );
         String line =res.getStatusLine();
         System.out.println("Status Line =" +line);
         
         String id = res.getSessionId();
         System.out.println("Id = "+id);
         Assert.assertEquals(code, 404);
       //  Assert.assertEquals(line, "Http/1.1 404");
         
	}
}
