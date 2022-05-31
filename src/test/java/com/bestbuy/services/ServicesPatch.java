package com.bestbuy.services;

import com.bestbuy.model.ServicesPojo;
import com.bestbuy.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class ServicesPatch extends TestBase {


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 3030;

    }


    @Test
    public void updateServices() {
        ServicesPojo servicesPojo = new ServicesPojo();
        servicesPojo.setName("Computer,Gpu Repairing");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(servicesPojo)
                .pathParam("id",9)
                .when()
                .patch("/services/{id}");
        response.prettyPrint();
        response.then().statusCode(200);



    }


}
