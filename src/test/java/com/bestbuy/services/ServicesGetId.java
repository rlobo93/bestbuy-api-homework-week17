package com.bestbuy.services;


import com.bestbuy.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesGetId   {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;
    }

    @Test
    public void getServiceId() {
        Response response = given()
                .pathParam("id",9)
                .when()
                .get("/services/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }

}
