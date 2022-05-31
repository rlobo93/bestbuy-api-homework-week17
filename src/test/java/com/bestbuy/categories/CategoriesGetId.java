package com.bestbuy.categories;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesGetId extends TestBase {


    @Test
    public void categoriesGetId() {
        Response response = given()
                .pathParam("id","pcmcat303600050001")
                .when()
                .get("/categories/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }

}
