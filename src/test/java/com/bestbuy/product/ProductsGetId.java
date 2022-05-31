package com.bestbuy.product;

import com.bestbuy.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ProductsGetId   {

    @BeforeClass
    public static void inIt() {

        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
    }

    @Test
    public void getProductId() {
        Response response = given()
                .pathParam("id", 48530)
                .when()
                .get("/products/{id}");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
