package com.bestbuy.stores;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class StoresGetId {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
    }

    @Test
    public void getStoreId() {
        Response response = given()
                .pathParams("id",4)
                .when()
                .get("/stores/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }



}
