package com.bestbuy.categories;

import com.bestbuy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CategoriesGet extends TestBase {

    @Test
    public void categoriesGet() {
        Response response = given()
                .when()
                .get("/categories");
        response.prettyPrint();
        response.then().statusCode(200);



    }

}
