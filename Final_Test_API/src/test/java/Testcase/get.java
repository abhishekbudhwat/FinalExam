package Testcase;

import static io.restassured.RestAssured.given;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class get {
	
 
	ResponseSpecification res;
    
    
    RequestSpecification req_spec;
    
    String str=" ";
    
    @BeforeClass
    public void setSpecification() {
    	  res = RestAssured.expect();
	        res.statusLine("HTTP/1.1 200 OK");
	        res.contentType(ContentType.JSON);
	        
    	
      
    }
    
	
	
	
	  @Test(priority=1)
	    public void Generalsetting()
	   {
	    	RestAssured.baseURI="https://arcadia.pisystindia.com/";
	   	Response resp=given().header("Authoriztion",str).when().get("api/generalSetting").then().contentType(ContentType.JSON).extract().response();
	    	System.out.println("Get output is= "+resp.asPrettyString());
	        	
	    }
	   @Test(priority=2)
	   public void Transaction()
	  {
	    	RestAssured.baseURI="https://arcadia.pisystindia.com/";
	    	Response resp=given().header("Authoriztion",str).when().get("api/user/transactions").then().contentType(ContentType.JSON).extract().response();
	    	System.out.println("Get output is= "+resp.asPrettyString());
	    	
	    	
	    }

}
