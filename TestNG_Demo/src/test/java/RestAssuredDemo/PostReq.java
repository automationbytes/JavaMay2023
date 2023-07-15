package RestAssuredDemo;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostReq {
    @Test
    public void postreq(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Description","Automation Bytes Special Delight Coffee");
        jsonObject.put("Name","A-Bytes Kafe");

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .and()
                .body(jsonObject.toString())
                .when()
                .post("/api/Coffees_V2")
                .then().extract().response();

        System.out.println(response.asPrettyString());

        int Id = JsonPath.read(response.asString(),"$.Id");
        System.out.println(Id);

        Response getresponse = RestAssured.given()
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .extract().response();

        System.out.println(getresponse.asPrettyString());

        String description = JsonPath.read(getresponse.asString(),"$..[?(@.Id=="+Id+")].Description").toString();
        System.out.println(description);
        Assert.assertTrue(description.contains(jsonObject.get("Description").toString()));

    }
}
