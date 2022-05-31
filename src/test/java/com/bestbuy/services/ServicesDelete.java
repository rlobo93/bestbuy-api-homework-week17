package com.bestbuy.services;

import com.bestbuy.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesDelete extends TestBase {



    @Test
    public void servicesDelete() {


        Response response = given()
                .header("Content-Type", "application/json")
                .pathParam("id",9)
                .when()
                .delete("/services/{id}");
        response.prettyPrint();
        response.then().statusCode(200);
    }



}
