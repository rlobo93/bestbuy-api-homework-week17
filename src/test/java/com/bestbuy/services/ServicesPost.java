package com.bestbuy.services;

import com.bestbuy.model.ServicesPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPost {

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;

    }


    @Test
    public void createServices() {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Computer,Gpu Repairing");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .when()
                .post("/services");
        response.then().statusCode(201);
        response.prettyPrint();

    }
}
