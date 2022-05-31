package com.bestbuy.stores;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresDelete {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
    }


    @Test
    public void storeDelete() {
        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id",5)
                .when()
                .delete("/stores/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }



}
