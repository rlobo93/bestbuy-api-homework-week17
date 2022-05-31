package com.bestbuy.services;

import com.bestbuy.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesGet extends TestBase {


    @Test
    public void getAllServices() {
        Response response = given()
                .when()
                .get("/services");
        response.then().statusCode(200);
        response.prettyPrint();



    }

}
