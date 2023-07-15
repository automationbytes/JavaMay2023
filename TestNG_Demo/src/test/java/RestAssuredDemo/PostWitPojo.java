package RestAssuredDemo;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class PostWitPojo {
    @Test
    public void postReq(){

        PostReqBody postReqBody = new PostReqBody("ABytes Pojo Class Cafe", "Pojo Cafe");
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .and()
                .body(postReqBody)
                .when()
                .post("/api/Coffees_V2")
                .then().extract().response();

        System.out.println(response.asPrettyString());

        int Id = JsonPath.read(response.asString(),"$.Id");
        System.out.println(Id);

    }
}
