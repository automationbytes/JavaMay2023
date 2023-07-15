package RestAssuredDemo;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
public class firstGetApi {



    @Test
    public void getRequest(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
    }


    @Test
    public void validateResponseCode(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .extract().response();
        Assert.assertEquals(response.statusCode(),200);
        System.out.println(response.asPrettyString());
    }



    @Test
    public void validateResponseusinghamcrest(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
       RestAssured.given()
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .assertThat()
               .statusCode(200)
               .body("Id",hasItem(905));
    }


    @Test
    public void getRequestwithJsonPath(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .extract().response();

      System.out.println(response.asPrettyString());

      String description = JsonPath.read(response.asString(),"$..[?(@.Id==14)].Description").toString();
        System.out.println(description);
        Assert.assertTrue(description.contains("Brazil"));


    }
}
