package com.bestbuy.categories;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesDelete extends TestBase {

    @Test
    public void categoriesDelete() {

        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id","pcmcat303600050001")
                .when()
                .delete("/categories/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }

}
