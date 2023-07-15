package RestAssuredDemo;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteReq {

    @Test
    public void getRequest(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .when()
                .get("/api/Coffees_V2/38")
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
        int Id = JsonPath.read(response.asString(),"$.Id");
        System.out.println(Id);

        Assert.assertEquals(Id,38);
    }


    @Test(dependsOnMethods = "getRequest")
    public void DelRequest(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .when()
                .delete("/api/Coffees_V2/38")
                .then()
                .extract().response();
        System.out.println(response.asPrettyString());
    }

}
