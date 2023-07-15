package RestAssuredDemo;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.minidev.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PutReq {
    @Test
    public void putreq(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Description","Devlabs Delight Coffee");
        jsonObject.put("Id",41);
        jsonObject.put("Name","DL Cafe");

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .and()
                .body(jsonObject.toString())
                .when()
                .put("/api/Coffees_V2")
                .then().extract().response();

        System.out.println(response.asPrettyString());

        int Id = JsonPath.read(response.asString(),"$.Id");
        System.out.println(Id);
        Assert.assertEquals(Id,41);

        Response getresponse = RestAssured.given()
                .header("Authorization","Bearer 29e456f8-8555-4ece-aedf-64fb86798524")
                .when()
                .get("/api/Coffees_V2/"+Id)
                .then()
                .extract().response();

        System.out.println(getresponse.asPrettyString());

        String description = JsonPath.read(getresponse.asString(),"$..[?(@.Id=="+Id+")].Description").toString();
        System.out.println(description);
        Assert.assertTrue(description.contains(jsonObject.get("Description").toString()));

    }
}
