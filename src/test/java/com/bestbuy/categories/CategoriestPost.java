package com.bestbuy.categories;

import com.bestbuy.model.CategoriesPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriestPost extends TestBase {

    @Test
    public void categoriestPost() {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setId("pcmcat303600050001");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(categoriesPojo)
                .when()
                .post("/categories");
        response.prettyPrint();
        response.then().statusCode(201);

    }
}
